package com.example.sourcewebteam.dto;

import com.example.sourcewebteam.entity.TUser;
import lombok.Data;

import java.util.Date;

@Data
public class CommentDTO {
    private Integer id;
    private String title;
    private String content;
    private String tag;
    private String image;
    private String video;
    private Integer type;
    private Integer isDeleted;
    private Integer creatorId;
    private Integer hits;
    private Integer favorites;
    private Date createTime;
    private Date modifiedTime;
    private Integer agree;
    private Integer disagree;
    private String summary;
    private Integer commentCount;
    private TUser user;
}
