package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TAgree;
import com.example.sourcewebteam.entity.TDisagree;
import com.example.sourcewebteam.entity.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AgreeMapperTests {
    @Autowired
    private TAgreeMapper agreeMapper;
    @Autowired
    private TDisagreeMapper disagreeMapper;
    @Test
    public void insert(){
        TAgree agree = new TAgree();
        agree.setUserId(999);
        agree.setPostId(1);
        agreeMapper.insert(agree);
    }
    @Test
    public void selectUserIdByPostId(){
        List<Integer> res = agreeMapper.selectUserIdByPostId(1);
        System.out.println(res.size());
    }
    @Test
    public void deleteByPrimaryKey(){
        int row = agreeMapper.deleteByPrimaryKey(3);
        System.out.println(row);
    }
    @Test
    public void insert2(){
        TDisagree disagree = new TDisagree();
        disagree.setUserId(1999);
        disagree.setPostId(1);
        disagreeMapper.insert(disagree);
    }
    @Test
    public void selectUserIdByPostId2(){
        List<Integer> res = disagreeMapper.selectUserIdByPostId(1);
        System.out.println(res.size());
    }
    @Test
    public void deleteByPrimaryKey2(){
        int row = disagreeMapper.deleteByPrimaryKey(3);
        System.out.println(row);
    }

}
