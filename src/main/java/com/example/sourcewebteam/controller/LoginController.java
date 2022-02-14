package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.entity.UserBean;
import com.example.sourcewebteam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Slf4j
@Controller
public class LoginController extends BaseController{

    @Autowired
    UserService userService;
}

