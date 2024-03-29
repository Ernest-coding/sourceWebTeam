package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TFollowFan;
import java.util.List;

import com.example.sourcewebteam.entity.TUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TFollowFanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_follow_fan
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Delete({
        "delete from t_follow_fan",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_follow_fan
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Insert({
        "insert into t_follow_fan (id, follow_id, ",
        "fan_id)",
        "values (#{id,jdbcType=INTEGER}, #{followId,jdbcType=INTEGER}, ",
        "#{fanId,jdbcType=INTEGER})"
    })
    int insert(TFollowFan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_follow_fan
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "id, follow_id, fan_id",
        "from t_follow_fan",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="follow_id", property="followId", jdbcType=JdbcType.INTEGER),
        @Result(column="fan_id", property="fanId", jdbcType=JdbcType.INTEGER)
    })
    TFollowFan selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_follow_fan
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "id, follow_id, fan_id",
        "from t_follow_fan",
        "order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="follow_id", property="followId", jdbcType=JdbcType.INTEGER),
        @Result(column="fan_id", property="fanId", jdbcType=JdbcType.INTEGER)
    })
    List<TFollowFan> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_follow_fan
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Update({
        "update t_follow_fan",
        "set follow_id = #{followId,jdbcType=INTEGER},",
          "fan_id = #{fanId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TFollowFan record);

    @Select({
            "select",
            "t_user.id, t_user.username",
            "from t_follow_fan",
            "RIGHT JOIN t_user",
           "ON t_user.id=t_follow_fan.follow_id",
            "where t_follow_fan.fan_id=#{uid,jdbcType=INTEGER};"
    })
    @Results({
            @Result(column="t_user.id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="t_user.username", property="userName", jdbcType=JdbcType.VARCHAR),
    })
    List<TUser> selectAllFollowById(Integer uid);
}