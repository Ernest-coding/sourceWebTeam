package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.service.UserService;
import com.example.sourcewebteam.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

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
}
