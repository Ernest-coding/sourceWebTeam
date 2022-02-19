package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.util.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("api")
public class LogoutController extends BaseController{
    /**
     * @param request
     * @param response
     * logout 退出登录,移除cookie和session
     * @return
     */
    @RequestMapping("logout")
    public JsonResult<Void> logout(HttpServletRequest request, HttpServletResponse response){
        request.getSession().removeAttribute("user");
        Cookie cookie = new Cookie("token", null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return new JsonResult<>(success);
    }

}
