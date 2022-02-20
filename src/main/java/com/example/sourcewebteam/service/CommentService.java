package com.example.sourcewebteam.service;

import com.example.sourcewebteam.CommentTypeEnum;
import com.example.sourcewebteam.controller.ex.PostNotFound;
import com.example.sourcewebteam.entity.TComment;
import com.example.sourcewebteam.entity.TPost;
import com.example.sourcewebteam.mapper.TCommentMapper;
import com.example.sourcewebteam.mapper.TPostMapper;
import com.example.sourcewebteam.service.ex.CommentNotFound;
import com.example.sourcewebteam.service.ex.CommentTypeException;
import com.example.sourcewebteam.service.ex.InsertException;
import com.example.sourcewebteam.service.ex.UpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {
    @Autowired
    private TCommentMapper commentMapper;
    @Autowired
    private TPostMapper postMapper;
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
}
