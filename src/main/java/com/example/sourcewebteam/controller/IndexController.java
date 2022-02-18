package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.dto.PaginationDTO;
import com.example.sourcewebteam.dto.PostDTO;
import com.example.sourcewebteam.entity.TPost;
import com.example.sourcewebteam.mapper.TPostMapper;
import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.PostService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class IndexController extends BaseController{
    @Autowired
    private TUserMapper tuserMapper;
    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public JsonResult<PaginationDTO> index(HttpServletRequest request,
                                           @RequestParam(name = "page", defaultValue = "1") Integer page,
                                           @RequestParam(name = "size", defaultValue = "1") Integer size){
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
        PaginationDTO pagination = postService.list(page, size);
        return new JsonResult<PaginationDTO>(success, pagination);
    }
}
