package com.example.sourcewebteam.mapperTest;

import com.example.sourcewebteam.entity.TUser;
import com.example.sourcewebteam.mapper.TFollowFanMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TFollowFanMapperTest {

    @Autowired
    private TFollowFanMapper tFollowFanMapper;

    @Test
    public void selectAllFollowById () {
        Integer id = 1;
        List<TUser> tUsers = tFollowFanMapper.selectAllFollowById(id);
        System.out.println( tUsers.get(0).getUsername() );
        System.out.println( tUsers.get(1).getUsername() );
        System.out.println( tUsers.get(2).getUsername() );
    }
}
