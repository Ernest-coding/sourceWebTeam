package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.CommentTypeEnum;
import com.example.sourcewebteam.controller.ex.UserNotLoginException;
import com.example.sourcewebteam.dto.CommentCreateDTO;
import com.example.sourcewebteam.dto.CommentDTO;
import com.example.sourcewebteam.entity.TComment;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.CommentService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
public class CommentController extends BaseController{
    @Autowired
    private CommentService commentService;
    @RequestMapping("/comment")
    public JsonResult<TComment> comment(@RequestBody CommentCreateDTO commentCreateDTO, HttpServletRequest request){
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            throw new UserNotLoginException("用户未登录");
        }
        TComment comment = new TComment();
        comment.setParentId(commentCreateDTO.getParentId());
        comment.setContent(commentCreateDTO.getContent());
        comment.setType(commentCreateDTO.getType());
        comment.setCommentator(1);
        comment.setLikes(0);
        Date date = new Date();
        comment.setCreateTime(date);
        comment.setModifiedTime(date);
        comment.setCommentCount(0);
        commentService.doComment(comment);
        return new JsonResult<TComment>(success, comment);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public JsonResult<List<CommentDTO>> showcomments(@PathVariable(name = "id") Integer id){
        CommentTypeEnum type = CommentTypeEnum.LEVEL_TWO_COMMENT;
        List<CommentDTO> commentDTOS = commentService.listByTargetIdAndType(id, type);
        return new JsonResult<List<CommentDTO>>(success, commentDTOS);
    }
}
