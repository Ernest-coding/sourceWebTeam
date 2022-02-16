//package com.example.sourcewebteam.controller;
//
//import com.example.sourcewebteam.entity.UserBean;
//import com.example.sourcewebteam.service.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.annotation.Resource;
//
//@Slf4j
//@Controller
//public class LoginController {
//
//    //将Service注入Web层
//    @Resource
//    UserService userService;
//
//    //登录
//    @RequestMapping("/login")
//    public String show() {
//        return "login";
//    }
//
//    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
//    public String login(String name, String password) {
//        UserBean userBean = userService.LoginIn(name, password);
//        log.info("username:{}", name);
//        log.info("password:{}", password);
//        if (userBean != null) {
//            return "success";
//        } else {
//            return "error";
//        }
//    }
//
//    @RequestMapping("/signup")
//    public String disp() {
//        return "signup";
//    }
//
//    //注册
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String signUp(String name, String password) {
//        userService.Insert(name, password);
//        return "success";
//    }
//}
//
