package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TUser;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Delete({
        "delete from t_user",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Insert({
        "insert into t_user (uid, username, ",
        "password, salt, phone, ",
        "email, gender, avatar, ",
        "is_delete, created_user, ",
        "created_time, modified_user, ",
        "modified_time, token)",
        "values (#{uid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=CHAR}, #{salt,jdbcType=CHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{gender,jdbcType=INTEGER}, #{avatar,jdbcType=VARCHAR}, ",
        "#{isDelete,jdbcType=INTEGER}, #{createdUser,jdbcType=VARCHAR}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{modifiedUser,jdbcType=VARCHAR}, ",
        "#{modifiedTime,jdbcType=TIMESTAMP}), #{token,jdbcType=CHAR})"
    })
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "uid, username, password, salt, phone, email, gender, avatar, is_delete, created_user, ",
        "created_time, modified_user, modified_time, token",
        "from t_user",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.CHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.INTEGER),
        @Result(column="created_user", property="createdUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_user", property="modifiedUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="token", property="token", jdbcType=JdbcType.CHAR)
    })
    TUser selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "uid, username, password, salt, phone, email, gender, avatar, is_delete, created_user, ",
        "created_time, modified_user, modified_time, token",
        "from t_user",
        "order by id"
    })
    @Results({
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.CHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.INTEGER),
        @Result(column="created_user", property="createdUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_user", property="modifiedUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="token", property="token", jdbcType=JdbcType.CHAR)
    })
    List<TUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Update({
        "update t_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=CHAR},",
          "salt = #{salt,jdbcType=CHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=INTEGER},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "is_delete = #{isDelete,jdbcType=INTEGER},",
          "created_user = #{createdUser,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "modified_user = #{modifiedUser,jdbcType=VARCHAR},",
          "modified_time = #{modifiedTime,jdbcType=TIMESTAMP},",
          "token = #{token,jdbcType=CHAR}",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TUser record);

    /**
     * This method was generated by yyw.
     * This method is used for get the user by token
     */
    @Select({
            "select",
            "uid, username, password, salt, phone, email, gender, avatar, is_delete, created_user, ",
            "created_time, modified_user, modified_time, token",
            "from t_user",
            "where token = #{token,jdbcType=CHAR}"
    })
    @Results({
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
            @Result(column="salt", property="salt", jdbcType=JdbcType.CHAR),
            @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
            @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
            @Result(column="gender", property="gender", jdbcType=JdbcType.INTEGER),
            @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.INTEGER),
            @Result(column="created_user", property="createdUser", jdbcType=JdbcType.VARCHAR),
            @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="modified_user", property="modifiedUser", jdbcType=JdbcType.VARCHAR),
            @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="token", property="token", jdbcType=JdbcType.CHAR)
    })
    TUser selectByToken(String token);

    Integer updateAvatarByUid(@Param("uid") Integer uid,
                              @Param("avatar")String avatar,
                              @Param("modifiedUser")String modifiedUser,
                              @Param("modifiedTime")Date modifiedTime);
}