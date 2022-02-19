package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.dto.PostDTO;
import com.example.sourcewebteam.service.PostService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController extends BaseController{
    @Autowired
    private PostService postService;
    @GetMapping("/post/{id}")
    public JsonResult<PostDTO> post(@PathVariable(name = "id") Integer id){
        PostDTO postDTO = postService.getDTOById(id);
        return new JsonResult<PostDTO>(success, postDTO);
    }
}
