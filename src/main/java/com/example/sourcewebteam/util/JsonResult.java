package com.example.sourcewebteam.util;

import lombok.Data;

import java.io.Serializable;

//json格式的数据进行响应
@Data
public class JsonResult<E> implements Serializable {
    //状态码
    private Integer state;
    //描述信息
    private String message;
    private E data;
    public JsonResult(){

    }
    public JsonResult(Integer state){
        this.state = state;
    }

    public JsonResult(Throwable e){
        this.message = e.getMessage();
    }

    public JsonResult(Integer state, E data){
        this.state = state;
        this.data = data;
    }
}
