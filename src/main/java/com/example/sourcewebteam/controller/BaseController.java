package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.FileUploadException;
import com.example.sourcewebteam.service.ex.ServiceException;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

//控制层类的基类，用于异常捕获处理
public class BaseController {
    //定义成功状态码
    public static final int success = 200;
    //用于统一处理抛出的异常，当项目中产生了异常，被统一拦截到此方法
    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handlerException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
//        示例：约定状态码4000表示"用户名已经被占用的异常"
//        if(e instanceof UsernameDuplitedException){
//            result.setState(4000);
//            result.setMessage("用户名已经被占用");
//        }
        return result;
    }
}
