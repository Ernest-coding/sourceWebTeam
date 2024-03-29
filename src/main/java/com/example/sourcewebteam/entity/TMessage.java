package com.example.sourcewebteam.entity;

import java.util.Date;

public class TMessage extends baseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.user1_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer user1Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.user2_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer user2Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.create_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.create_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.content
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.status
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.id
     *
     * @return the value of t_message.id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.id
     *
     * @param id the value for t_message.id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.user1_id
     *
     * @return the value of t_message.user1_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getUser1Id() {
        return user1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.user1_id
     *
     * @param user1Id the value for t_message.user1_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setUser1Id(Integer user1Id) {
        this.user1Id = user1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.user2_id
     *
     * @return the value of t_message.user2_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getUser2Id() {
        return user2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.user2_id
     *
     * @param user2Id the value for t_message.user2_id
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setUser2Id(Integer user2Id) {
        this.user2Id = user2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.create_user
     *
     * @return the value of t_message.create_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.create_user
     *
     * @param createUser the value for t_message.create_user
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.create_time
     *
     * @return the value of t_message.create_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.create_time
     *
     * @param createTime the value for t_message.create_time
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.content
     *
     * @return the value of t_message.content
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.content
     *
     * @param content the value for t_message.content
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.status
     *
     * @return the value of t_message.status
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.status
     *
     * @param status the value for t_message.status
     *
     * @mbg.generated Wed Feb 16 20:53:31 CST 2022
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}