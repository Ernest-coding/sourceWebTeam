package com.example.sourcewebteam.dto;

import lombok.Data;

import java.util.List;

@Data
public class PostDisplayDTO {
    private List<CommentDTO> comments;
    private PostDTO postDTO;
}
