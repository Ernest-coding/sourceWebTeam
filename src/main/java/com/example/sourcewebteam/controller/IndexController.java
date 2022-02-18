package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController extends BaseController{
    @Autowired
    private TUserMapper tuserMapper;

    @RequestMapping("/")
    public JsonResult<Void> index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies) {
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                TUser user = tuserMapper.selectByToken(token);
                if(user != null) {
                    request.getSession().setAttribute("username", user.getUsername());
                }
                break;
            }
        }
        return new JsonResult<>(success);
    }
}
