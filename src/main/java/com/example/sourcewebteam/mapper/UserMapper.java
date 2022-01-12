package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    // 登录对象查询
    @Select("SELECT * FROM user WHERE username = #{name} AND password = #{password}")
    UserBean getInfo(@Param("name") String name, @Param("password") String password);

    // 注册时使用，添加进数据库
    @Insert("insert into user(name,password)values(#{name},#{password})")
    void saveInfo(@Param("name") String name, @Param("password") String password);
}
