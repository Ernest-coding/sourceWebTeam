package com.example.sourcewebteam.service;

import com.example.sourcewebteam.entity.TComment;
import com.example.sourcewebteam.mapper.TCommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentServiceTests {
    @Autowired
    private CommentService commentService;
    @Test
    public void insert(){
        TComment comment = new TComment();
        comment.setParentId(100);
        comment.setContent("yywyyw");
        comment.setType(1);
        comment.setCommentator(1);
        comment.setLikes(0);
        Date date = new Date();
        comment.setCreateTime(date);
        comment.setModifiedTime(date);
        comment.setCommentCount(0);
        commentService.doComment(comment);
    }
}
