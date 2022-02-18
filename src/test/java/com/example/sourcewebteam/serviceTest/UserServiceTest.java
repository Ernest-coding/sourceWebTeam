package com.example.sourcewebteam.serviceTest;

import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void UserServiceSelectAllFollowByIdTest(){
        Long uid = (long)1;
        List<TUser> tUsers = userService.selectAllFollowById(uid);
        System.out.println(tUsers);
    }
}
