package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TAgree;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TAgreeMapper {
    @Insert("insert into t_agree (id, user_id, post_id) values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT})")
    int insert(TAgree record);

    @Delete("delete from t_agree where id = #{id,jdbcType=BIGINT}")
    int deleteByPrimaryKey(Integer id);

    @Select("select user_id from t_agree where post_id = #{postId}")
    List<Integer> selectUserIdByPostId (Integer postId);

}
