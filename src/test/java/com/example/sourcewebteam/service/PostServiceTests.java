package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.dto.PaginationDTO;
import com.example.sourcewebteam.entity.TPost;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostServiceTests {
    @Autowired
    private PostService postService;
    @Test
    public void doAgree(){
        postService.doAgree(1, 1);
    }
    @Test
    public void list(){
        PaginationDTO list = postService.list(1, 3);
        System.out.println(list.getTotalPage());
    }
    @Test
    public void addOrUpdate(){
        TPost post = new TPost();
        //post.setId(20);
        post.setTitle("title2");
        post.setContent("content2");
        post.setTag("tag2");
        post.setImage("image2");
        post.setVideo("video2");
        post.setType(0);
        post.setIsDeleted(0);
        post.setCreatorId(12345);
        post.setHits(888888);
        post.setFavorites(233);
        Date date = new Date();
        post.setCreateTime(date);
        post.setModifiedTime(date);
        post.setAgree(200);
        post.setDisagree(400);
        post.setSummary("summary2");
        postService.addorUpdatePost(post);
    }
    @Test
    public void increaseViews(){
        postService.increaseHits(1);
    }

}
