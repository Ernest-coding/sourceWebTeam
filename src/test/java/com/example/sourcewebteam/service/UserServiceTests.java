package com.example.sourcewebteam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {
    @Autowired
    private UserService userService;
    @Test
    public void changeAvatar(){
        userService.changeAvatar(1,"upload/imgs/yyw","yyw");
    }
}
