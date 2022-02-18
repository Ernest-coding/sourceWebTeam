package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostServiceTests {
    @Autowired
    private PostService postService;
    @Test
    public void doAgree(){
        postService.doAgree(1, 1);
    }

}
