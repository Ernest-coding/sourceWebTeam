package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.TComment;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Delete({
        "delete from t_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Insert({
        "insert into t_comment (id, parent_id, ",
        "commentator, create_time, ",
        "modified_time, likes, ",
        "content, comment_count, type)",
        "values (#{id,jdbcType=INTEGER}, #{parentId,jdbcType=INTEGER}, ",
        "#{commentator,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifiedTime,jdbcType=TIMESTAMP}, #{likes,jdbcType=INTEGER}, ",
        "#{content,jdbcType=VARCHAR}, #{commentCount,jdbcType=INTEGER}, #{type,jdbcType=INTEGER})"
    })
    int insert(TComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "id, parent_id, commentator, create_time, modified_time, likes, content, comment_count, type",
        "from t_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="commentator", property="commentator", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="likes", property="likes", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment_count", property="commentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    TComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Select({
        "select",
        "id, parent_id, commentator, create_time, modified_time, likes, content, comment_count, type",
        "from t_comment",
        "order by id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="commentator", property="commentator", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="likes", property="likes", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment_count", property="commentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)

    })
    List<TComment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    @Update({
        "update t_comment",
        "set parent_id = #{parentId,jdbcType=INTEGER},",
          "commentator = #{commentator,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modified_time = #{modifiedTime,jdbcType=TIMESTAMP},",
          "likes = #{likes,jdbcType=INTEGER},",
          "content = #{content,jdbcType=VARCHAR},",
          "comment_count = #{commentCount,jdbcType=INTEGER}",
          "type = #{type,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TComment record);

    @Update({
            "update t_comment",
            "set comment_count = comment_count + 1",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int increaseCommentCountById(Integer id);

    @Select({
            "select",
            "id, parent_id, commentator, create_time, modified_time, likes, content, comment_count, type",
            "from t_comment",
            "where id = #{id,jdbcType=INTEGER} and type = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
            @Result(column="commentator", property="commentator", jdbcType=JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="modified_time", property="modifiedTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="likes", property="likes", jdbcType=JdbcType.INTEGER),
            @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
            @Result(column="comment_count", property="commentCount", jdbcType=JdbcType.INTEGER),
            @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<TComment> selectAllByIdAndType(Integer id, Integer type);
}