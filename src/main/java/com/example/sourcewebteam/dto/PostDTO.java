package com.example.sourcewebteam.dto;

import com.example.sourcewebteam.entity.TUser;
import lombok.Data;

import java.util.Date;
@Data
public class PostDTO {
    private Integer id;
    private String title;
    private String content;
    private String tag;
    private String image;
    private String video;
    private Integer type;
    private Integer isDeleted;
    private Long creatorId;
    private Long hits;
    private Long favorites;
    private Date createTime;
    private Date modifiedTime;
    private Integer agree;
    private Integer disagree;
    private String summary;
    private TUser user;
}
