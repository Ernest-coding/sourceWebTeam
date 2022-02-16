package com.example.sourcewebteam.config;

import com.example.sourcewebteam.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
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
        WhiteLists.add("/templates/login.html");
        //配置拦截器
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(WhiteLists);
    }
}
