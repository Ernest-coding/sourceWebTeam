package com.example.sourcewebteam.service.impl;

import com.example.sourcewebteam.entity.TAgree;
import com.example.sourcewebteam.mapper.TAgreeMapper;
import com.example.sourcewebteam.mapper.TPostMapper;
import com.example.sourcewebteam.service.PostService;
import com.example.sourcewebteam.service.ex.DataException;
import com.example.sourcewebteam.service.ex.RedundantAgreeException;
import com.example.sourcewebteam.service.ex.UpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private TPostMapper postMapper;
    @Autowired
    private TAgreeMapper agreeMapper;
    @Override
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
}
