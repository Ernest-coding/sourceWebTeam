package com.example.sourcewebteam.entity;

public class TFollowFan extends baseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_follow_fan.id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_follow_fan.follow_id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    private Long followId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_follow_fan.fan_id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    private Long fanId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_follow_fan.id
     *
     * @return the value of t_follow_fan.id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_follow_fan.id
     *
     * @param id the value for t_follow_fan.id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_follow_fan.follow_id
     *
     * @return the value of t_follow_fan.follow_id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    public Long getFollowId() {
        return followId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_follow_fan.follow_id
     *
     * @param followId the value for t_follow_fan.follow_id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    public void setFollowId(Long followId) {
        this.followId = followId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_follow_fan.fan_id
     *
     * @return the value of t_follow_fan.fan_id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    public Long getFanId() {
        return fanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_follow_fan.fan_id
     *
     * @param fanId the value for t_follow_fan.fan_id
     *
     * @mbg.generated Tue Feb 15 23:20:39 CST 2022
     */
    public void setFanId(Long fanId) {
        this.fanId = fanId;
    }
}