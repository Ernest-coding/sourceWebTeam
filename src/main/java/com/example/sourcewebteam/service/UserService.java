package com.example.sourcewebteam.service;

import com.example.sourcewebteam.entity.TFollowFan;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.mapper.TFollowFanMapper;
import com.example.sourcewebteam.mapper.TUserMapper;
import com.example.sourcewebteam.service.ex.UpdateException;
import com.example.sourcewebteam.service.ex.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private TUserMapper userMapper;
    /**
     * 根据id查找其全部的粉丝
     * @return List<TUser>
     */
    @Autowired
    private TFollowFanMapper tFollowFanMapper;

    public List<TUser> selectAllFollowById (Integer id) {
        List<TUser> tUsers = tFollowFanMapper.selectAllFollowById(id);
        return tUsers;
    }

    /**
     * 更改用户头像
     * @param uid
     * @param avatar
     * @param username
     */
    public void changeAvatar(Integer uid, String avatar, String username) {
        TUser res = userMapper.selectByPrimaryKey(uid);
        if(res == null || res.getIsDelete()==1){
            throw new UserNotFoundException("用户不存在");
        }
        Integer rows = userMapper.updateAvatarByUid(uid, avatar, username, new Date());
        if(rows != 1) {
            throw new UpdateException("更新数据时产生未知的异常");
        }
    }
}
