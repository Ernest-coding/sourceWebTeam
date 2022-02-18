package com.example.sourcewebteam.service;

import com.example.sourcewebteam.dto.PaginationDTO;
import com.example.sourcewebteam.dto.PostDTO;
import com.example.sourcewebteam.entity.TAgree;
import com.example.sourcewebteam.entity.TPost;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.mapper.TAgreeMapper;
import com.example.sourcewebteam.mapper.TPostMapper;
import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.service.ex.DataException;
import com.example.sourcewebteam.service.ex.RedundantAgreeException;
import com.example.sourcewebteam.service.ex.UpdateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private TUserMapper userMapper;
    @Autowired
    private TPostMapper postMapper;
    @Autowired
    private TAgreeMapper agreeMapper;
    public void doAgree(int uid, int id) {
        List<Integer> list = agreeMapper.selectUserIdByPostId(id);
        if(list.contains(uid)){
            throw new RedundantAgreeException("重复点赞");
        }
        int agree = postMapper.selectAgreeById(id);
        if(agree < 0){
            throw new DataException("agree数据异常");
        }
        agree = agree + 1;
        int row = postMapper.updateAgreeById(id, agree);
        if(row != 1){
            throw new UpdateException("用户在更新数据时产生未知的异常");
        }
        TAgree agreeRecord = new TAgree();
        agreeRecord.setUserId(uid);
        agreeRecord.setPostId(id);
        row = agreeMapper.insert(agreeRecord);
        if(row != 1){
            throw new UpdateException("用户在插入数据时产生未知的异常");
        }
    }

    public PaginationDTO list(Integer page, Integer size){
        PaginationDTO paginationDTO = new PaginationDTO();
        Integer totalCount = postMapper.count();
        paginationDTO.setPagination(totalCount, page, size);
        if(page < 1){
            page = 1;
        }
        if(page > paginationDTO.getPage()){
            page = paginationDTO.getPage();
        }
        Integer offset = size * (page - 1);
        List<TPost> posts = postMapper.list(offset, size);
        List<PostDTO> postDTOList = new ArrayList<>();
        for(TPost post : posts){
            TUser user = userMapper.selectByPrimaryKey(post.getCreatorId());
            PostDTO postDTO = new PostDTO();
            BeanUtils.copyProperties(post, postDTO);
            postDTO.setUser(user);
            postDTOList.add(postDTO);
        }
        paginationDTO.setPosts(postDTOList);
        return paginationDTO;
    }
}
