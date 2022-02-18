package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TDisagree;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TDisagreeMapper {
    @Insert("insert into t_disagree (id, user_id, post_id) values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT})")
    int insert(TDisagree record);

    @Delete("delete from t_disagree where id = #{id,jdbcType=BIGINT}")
    int deleteByPrimaryKey(Integer id);

    @Select("select user_id from t_disagree where post_id = #{postId}")
    List<Integer> selectUserIdByPostId (Integer postId);
}
