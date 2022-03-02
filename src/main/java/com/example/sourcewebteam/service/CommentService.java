package com.example.sourcewebteam.service;

import com.example.sourcewebteam.CommentTypeEnum;
import com.example.sourcewebteam.controller.ex.PostNotFound;
import com.example.sourcewebteam.dto.CommentDTO;
import com.example.sourcewebteam.entity.TComment;
import com.example.sourcewebteam.entity.TPost;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.mapper.TCommentMapper;
import com.example.sourcewebteam.mapper.TPostMapper;
import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.service.ex.CommentNotFound;
import com.example.sourcewebteam.service.ex.CommentTypeException;
import com.example.sourcewebteam.service.ex.InsertException;
import com.example.sourcewebteam.service.ex.UpdateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    private TCommentMapper commentMapper;
    @Autowired
    private TPostMapper postMapper;
    @Autowired
    private TUserMapper userMapper;
    @Transactional
    public void doComment(TComment comment){
        int rows;
        if(comment.getParentId() == null){
            throw new CommentNotFound("评论不存在");
        }
        if(comment.getType() == null || !CommentTypeEnum.isExist(comment.getType())){
            throw new CommentTypeException("评论种类错误");
        }
        if(comment.getType().equals(CommentTypeEnum.LEVEL_ONE_COMMENT.getType())){
            //一级评论
            TPost post = postMapper.selectByPrimaryKey(comment.getParentId());
            if(post == null){
                throw new PostNotFound("评论的帖子不存在");
            }
            //这里存在前面的执行成功后面执行失败的可能性，因此用事务@Transactional
            rows = postMapper.increaseCommentCountById(post.getId());
            if(rows != 1){
                throw new UpdateException("用户在更新数据过程中发生未知的异常");
            }
            rows = commentMapper.insert(comment);
            if(rows != 1){
                throw new InsertException("用户在插入数据过程中发生未知的异常");
            }
        } else {
            //二级评论
            TComment tComment = commentMapper.selectByPrimaryKey(comment.getParentId());
            if(tComment == null){
                throw new CommentNotFound("评论不存在");
            }
            rows = commentMapper.increaseCommentCountById(comment.getId());
            if(rows != 1){
                throw new InsertException("用户在更新数据过程中发生未知的异常");
            }
            rows = commentMapper.insert(comment);
            if(rows != 1){
                throw new InsertException("用户在插入数据过程中发生未知的异常");
            }


        }

    }

    /**
     * 查找某个帖子之下的所有一级评论，并和对应的评论人User打包成CommentDTO传回
     * @param id
     * @return
     */
    public List<CommentDTO> listByTargetIdAndType(Integer id, CommentTypeEnum type) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        List<TComment> comments = commentMapper.selectAllByIdAndType(id, type.getType());
        for (TComment comment : comments) {
            Integer uid = comment.getCommentator();
            TUser user = userMapper.selectByPrimaryKey(uid);
            CommentDTO commentDTO = new CommentDTO();
            BeanUtils.copyProperties(comment, commentDTO);
            commentDTO.setUser(user);
            commentDTOS.add(commentDTO);
        }
        return commentDTOS;
    }
}
