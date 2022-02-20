package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.UserNotLoginException;
import com.example.sourcewebteam.entity.TPost;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.PostService;
import com.example.sourcewebteam.service.ex.DataException;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class PublishController extends BaseController {
    @Autowired
    private PostService postService;
    @RequestMapping("/publish")
    public JsonResult<Void> publish(@RequestParam(value = "id", required = false) Integer id,
                                    @RequestParam(value = "title", required = false) String title,
                                    @RequestParam(value = "summary", required = false) String summary,
                                    @RequestParam(value = "content", required = false) String content,
                                    @RequestParam(value = "tag", required = false) String tag,
                                    @RequestParam(value = "type", required = false) Integer type,
                                    @RequestParam(value = "image", required = false) String image,
                                    @RequestParam(value = "video", required = false) String video,
                                    @RequestParam(value = "is_deleted", required = false) Integer is_deleted,
                                    @RequestParam(value = "creator_id") Integer creater_id,
                                    HttpServletRequest request ){
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            throw new UserNotLoginException("用户未登录");
        }
        if(title == null || title.equals("")){
            throw new DataException("标题不能为空");
        }
        if(summary == null || summary.equals("")){
            throw new DataException("摘要不能为空");
        }
        if(content == null || content.equals("")){
            throw new DataException("内容不能为空");
        }
        if(tag == null || tag.equals("")){
            throw new DataException("标签不能为空");
        }
        if(type == null){
            throw new DataException("分类不能为空");
        }
        TPost post = new TPost();
        post.setTitle(title);
        post.setSummary(summary);
        post.setContent(content);
        post.setTag(tag);
        post.setType(type);
        post.setCreatorId(user.getUid());
        post.setVideo(video);
        post.setImage(image);
        post.setIsDeleted(is_deleted);
        post.setCreatorId(creater_id);
        //如果id为空，则执行的是add操作
        post.setId(id);
        postService.addorUpdatePost(post);
        return new JsonResult<>(success);
    }

    @GetMapping("/publish/{id}")
    public JsonResult<TPost> edit(@PathVariable(name = "id") Integer id){
        TPost post = postService.getPost(id);
        return new JsonResult<TPost>(success, post);
    }
}
