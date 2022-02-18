package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostMapperTests {
    @Autowired
    private TPostMapper postMapper;
    @Test
    public void insert(){
        TPost post = new TPost();
        post.setTitle("title");
        post.setContent("content");
        post.setTag("tag");
        post.setImage("image");
        post.setVideo("video");
        post.setType(0);
        post.setIsDeleted(0);
        post.setCreatorId((long)2333);
        post.setHits((long)233);
        post.setFavorites((long)233);
        Date date = new Date();
        post.setCreateTime(date);
        post.setModifiedTime(date);
        post.setAgree(200);
        post.setDisagree(400);
        post.setSummary("summary");
        int rows = postMapper.insert(post);
        System.out.println(rows);
    }
    @Test
    public void updateAgreeById(){
        int rows  = postMapper.updateAgreeById(1, 999);
        System.out.println(rows);
    }
}

