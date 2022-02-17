package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
    @Autowired
    private TUserMapper userMapper;
    @Test
    public void selectByToken(){
        TUser user = userMapper.selectByToken("123456789");
        System.out.println(user.getUsername());
    }
    @Test
    public void selectByUid(){
        TUser user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getUsername());
    }
}
