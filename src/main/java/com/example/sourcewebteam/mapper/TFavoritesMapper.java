package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TFavorites;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TFavoritesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_favorites
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Delete({
        "delete from t_favorites",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_favorites
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Insert({
        "insert into t_favorites (id, user_id, ",
        "post_id)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{postId,jdbcType=INTEGER})"
    })
    int insert(TFavorites record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_favorites
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "id, user_id, post_id",
        "from t_favorites",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.INTEGER)
    })
    TFavorites selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_favorites
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "id, user_id, post_id",
        "from t_favorites",
        "order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.INTEGER)
    })
    List<TFavorites> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_favorites
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Update({
        "update t_favorites",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "post_id = #{postId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TFavorites record);
}