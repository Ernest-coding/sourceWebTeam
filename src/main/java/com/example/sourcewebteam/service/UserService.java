package com.example.sourcewebteam.service;

import com.example.sourcewebteam.entity.TFollowFan;
import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.mapper.TFollowFanMapper;
import com.example.sourcewebteam.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
