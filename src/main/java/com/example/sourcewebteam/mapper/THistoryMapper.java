package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.THistory;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface THistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history
     *
     * @mbg.generated Mon Feb 14 20:15:09 CST 2022
     */
    @Delete({
        "delete from t_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history
     *
     * @mbg.generated Mon Feb 14 20:15:09 CST 2022
     */
    @Insert({
        "insert into t_history (id, user_id, ",
        "post_id, view_date)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{postId,jdbcType=BIGINT}, #{viewDate,jdbcType=TIMESTAMP})"
    })
    int insert(THistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history
     *
     * @mbg.generated Mon Feb 14 20:15:09 CST 2022
     */
    @Select({
        "select",
        "id, user_id, post_id, view_date",
        "from t_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="view_date", property="viewDate", jdbcType=JdbcType.TIMESTAMP)
    })
    THistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history
     *
     * @mbg.generated Mon Feb 14 20:15:09 CST 2022
     */
    @Select({
        "select",
        "id, user_id, post_id, view_date",
        "from t_history",
        "order by age desc,username asc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="view_date", property="viewDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<THistory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history
     *
     * @mbg.generated Mon Feb 14 20:15:09 CST 2022
     */
    @Update({
        "update t_history",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "view_date = #{viewDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(THistory record);
}