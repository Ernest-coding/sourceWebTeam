//package com.example.sourcewebteam.service;
//
//import com.example.sourcewebteam.entity.UserBean;
//import com.example.sourcewebteam.mapper.UserMapper;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
//@Service
//public class UserService {
//    // dao层属性注入service层
//    @Resource
//    private UserMapper userMapper;
//
//    public UserBean LoginIn(String username, String password) {
//        return userMapper.getInfo(username, password);
//    }
//
//    public void Insert(String username, String password) {
//        userMapper.saveInfo(username, password);
//    }
//}
