package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.UserNotLoginException;
import com.example.sourcewebteam.dto.CommentDTO;
import com.example.sourcewebteam.entity.TComment;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.CommentService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class CommentController extends BaseController{
    @Autowired
    private CommentService commentService;
    @RequestMapping("/comment")
    public JsonResult<TComment> comment(@RequestBody CommentDTO commentDTO, HttpServletRequest request){
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            throw new UserNotLoginException("用户未登录");
        }
        TComment comment = new TComment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setCommentator(1);
        comment.setLikes(0);
        Date date = new Date();
        comment.setCreateTime(date);
        comment.setModifiedTime(date);
        comment.setCommentCount(0);
        commentService.doComment(comment);
        return new JsonResult<TComment>(success, comment);
    }
}
