package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.UserNotLoginException;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.service.PostService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class AgreeController extends BaseController{
    @Autowired
    private PostService postService;

    @RequestMapping("/agree")
    public JsonResult<Void> Agree(@RequestParam("id") int id, HttpServletRequest request){
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            throw new UserNotLoginException("用户未登录");
        }
        Integer uid = user.getUid();
        postService.doAgree(uid, id);
        return new JsonResult<>(success);
    }
}
