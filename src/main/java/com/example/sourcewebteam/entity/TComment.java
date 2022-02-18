package com.example.sourcewebteam.entity;

import java.util.Date;

public class TComment extends baseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.parent_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.commentator
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer commentator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.create_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.modified_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Date modifiedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.likes
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer likes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.content
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.comment_count
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.id
     *
     * @return the value of t_comment.id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.id
     *
     * @param id the value for t_comment.id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.parent_id
     *
     * @return the value of t_comment.parent_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.parent_id
     *
     * @param parentId the value for t_comment.parent_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.commentator
     *
     * @return the value of t_comment.commentator
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getCommentator() {
        return commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.commentator
     *
     * @param commentator the value for t_comment.commentator
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setCommentator(Integer commentator) {
        this.commentator = commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.create_time
     *
     * @return the value of t_comment.create_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.create_time
     *
     * @param createTime the value for t_comment.create_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.modified_time
     *
     * @return the value of t_comment.modified_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.modified_time
     *
     * @param modifiedTime the value for t_comment.modified_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.likes
     *
     * @return the value of t_comment.likes
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.likes
     *
     * @param likes the value for t_comment.likes
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.content
     *
     * @return the value of t_comment.content
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.content
     *
     * @param content the value for t_comment.content
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.comment_count
     *
     * @return the value of t_comment.comment_count
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.comment_count
     *
     * @param commentCount the value for t_comment.comment_count
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}