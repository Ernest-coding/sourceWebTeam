package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.controller.ex.*;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.UserService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController extends BaseController{

    @Autowired
    UserService userService;
    //头像最大上传大小
    public static final int AVATAR_MAX_SIZE = 10 * 1024 * 1024;
    // TODO: 图片保存路径
    public static final String ImagePath = "";
    //接受的文件格式
    public static final List<String> AVATAR_TYPE = new ArrayList<>();
    static {
        AVATAR_TYPE.add("image/jpeg");
        AVATAR_TYPE.add("image/png");
        AVATAR_TYPE.add("image/bmp");
        AVATAR_TYPE.add("image/jpg");
        AVATAR_TYPE.add("image/gif");
    }
    @RequestMapping("/api/list-of-people")
    public JsonResult<Void> selectAllFollowById(@CookieValue("uid") String uid) throws Exception {
        Integer uidInteger = uidStringToInteger(uid);
        List<TUser> tUsers = userService.selectAllFollowById(uidInteger);
        JsonResult<Void> result = selectAllFollowByIdResultsToJsonString(tUsers);
        return result;
    }

    private JsonResult<Void> selectAllFollowByIdResultsToJsonString(List<TUser> tUsers) {
        JsonResult<Void> result = new JsonResult<Void>();
        String resultMessage = "[ ";
        for(int i = 0 ; i < tUsers.size() ; i++) {
            TUser tUser = tUsers.get(i);
            String username = tUser.getUsername();
            String avatar = tUser.getAvatar();
            String OneUser = "{ " + "\"name\" : \"" + username + "\", " + "\"avatar\" : \"" + avatar + "\"" + " }";
            if(i!=0) resultMessage = resultMessage + " , ";
            resultMessage = resultMessage + OneUser;
        }
        resultMessage += " ]";
        result.setState(200);
        result.setMessage(resultMessage);
        return result;
    }

    private Integer uidStringToInteger(String uid) throws Exception {
        return Integer.valueOf(uid);
    }

    /**
     * MultipartFile是SpringMVC提供的一个接口，这个接口为我们包装了获取文件类型的数据，任何类型的file都可以接收，Springboot整合了SpringMVC
     * 只需要声明为MultipartFile类型，Springboot自动将传递给服务的文件数据赋值给这个参数
     * @param request
     * @param file
     * @return
     */
    @RequestMapping("change_avatar")
    public JsonResult<String> changeAvatar(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {
        TUser user = (TUser) request.getSession().getAttribute("user");
        if(user == null){
            throw new UserNotLoginException("用户未登录");
        }
        if(file.isEmpty()){
            throw new FileEmptyException("文件为空");
        }
        if(file.getSize() > AVATAR_MAX_SIZE){
            throw new FileSizeException("文件大小超出限制");
        }
        String contentType = file.getContentType();
        if(!AVATAR_TYPE.contains(contentType)){
            throw new FileTypeException("文件类型不支持");
        }
        String parent = ImagePath + "/upload";
        File dir = new File(parent);
        if(!dir.exists()){
            boolean a = dir.mkdirs();
            System.out.println(a);
        }
        //杜绝上传的文件重名：获取到这个文件名称，UUID工具生成一个新字符串作为文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println("originalFilename: " + originalFilename);
        assert originalFilename != null;
        String suffix = originalFilename.split("\\.")[1];
        String filename = UUID.randomUUID().toString().toUpperCase() + suffix;
        File dest = new File(dir, filename);
        try {
            file.transferTo(dest);          //将file文件中的数据写入到dest文件中
        } catch (IOException e) {
            throw new FileUploadIOException("文件读写异常");
        } catch (FileStateException e) {
            throw new FileStateException("文件状态异常");
        }
        Integer uid = user.getUid();
        String username = user.getUsername();
        String avatar = "/upload/" + filename;
        userService.changeAvatar(uid, avatar, username);
        //返回用户头像的路径给前端页面，将来用于头像展示使用
        return new JsonResult<>(success, avatar);
    }
}
