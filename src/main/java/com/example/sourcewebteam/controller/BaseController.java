package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.FileUploadException;
import com.example.sourcewebteam.controller.ex.PostNotFound;
import com.example.sourcewebteam.controller.ex.UserNotLoginException;
import com.example.sourcewebteam.service.ex.*;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

//控制层类的基类，用于异常捕获处理
public class BaseController {
    //定义成功状态码
    public static final int success = 200;
    //用于统一处理抛出的异常，当项目中产生了异常，被统一拦截到此方法
    @ExceptionHandler({ServiceException.class, FileUploadException.class, RuntimeException.class})
    public JsonResult<Void> handlerException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if(e instanceof UserNotLoginException){
            result.setState(4000);
        } else if(e instanceof DataException){
            result.setState(4001);
        } else if(e instanceof InsertException){
            result.setState(4002);
        } else if(e instanceof RedundantAgreeException){
            result.setState(4003);
        } else if(e instanceof UpdateException){
            result.setState(4004);
        } else if(e instanceof PostNotFound){
            result.setState(4005);
        }
        result.setMessage(e.getMessage());
        return result;
    }
}
