package com.example.sourcewebteam.config;

import com.example.sourcewebteam.interceptor.LoginInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;


public class LoginInterceptorConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       HandlerInterceptor interceptor = new LoginInterceptor();
       //配置拦截白名单
       List<String> WhiteLists = new ArrayList<>();
        WhiteLists.add("/bootstrap3/**");
        WhiteLists.add("/css/**");
        WhiteLists.add("/images/**");
        WhiteLists.add("/js/**");
        WhiteLists.add("/web/register.html");
        WhiteLists.add("/web/login.html");

        registry.addInterceptor(interceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(WhiteLists);
    }
}
