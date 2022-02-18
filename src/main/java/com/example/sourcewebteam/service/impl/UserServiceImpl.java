package com.example.sourcewebteam.service.impl;

import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSerivce {
    @Autowired
    private TUserMapper userMapper;

}
