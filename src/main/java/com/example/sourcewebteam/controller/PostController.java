package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.CommentTypeEnum;
import com.example.sourcewebteam.dto.CommentCreateDTO;
import com.example.sourcewebteam.dto.CommentDTO;
import com.example.sourcewebteam.dto.PostDTO;
import com.example.sourcewebteam.dto.PostDisplayDTO;
import com.example.sourcewebteam.service.CommentService;
import com.example.sourcewebteam.service.PostService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController extends BaseController{
    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;
    @GetMapping("/post/{id}")
    public JsonResult<PostDisplayDTO> post(@PathVariable(name = "id") Integer id){
        PostDTO postDTO = postService.getDTOById(id);
        CommentTypeEnum type = CommentTypeEnum.LEVEL_ONE_COMMENT;
        List<CommentDTO> comments = commentService.listByTargetIdAndType(id, type);
        postService.increaseHits(id);
        PostDisplayDTO postDisplayDTO = new PostDisplayDTO();
        postDisplayDTO.setPostDTO(postDTO);
        postDisplayDTO.setComments(comments);
        return new JsonResult<PostDisplayDTO>(success, postDisplayDTO);
    }
}
