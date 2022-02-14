package com.example.sourcewebteam.service.impl;

import com.example.sourcewebteam.mapper.UserMapper;
import com.example.sourcewebteam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
