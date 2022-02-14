package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.FileUploadException;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

//控制层类的基类，用于异常处理
public class BaseController {
    @ExceptionHandler({FileUploadException.class})
    public JsonResult<Void> handlerException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
//        错误类型
//        if(e instanceof ...){
//            状态码
//            result.setState(...);
//            错误信息
//            result.setMessage("...");
//        }
        return result;
    }
    //一些前端常用的数据可以存入session中
    protected final Integer getuidFromSession(HttpSession httpSession){
        return Integer.valueOf(httpSession.getAttribute("uid").toString());
    }
    protected final String getUsernameFromSession(HttpSession httpSession){
        return httpSession.getAttribute("username").toString();
    }
}
