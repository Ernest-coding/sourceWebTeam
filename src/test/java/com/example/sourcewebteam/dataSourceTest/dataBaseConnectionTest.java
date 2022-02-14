package com.example.sourcewebteam.dataSourceTest;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;


@Log4j2
@SpringBootTest
public class dataBaseConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void connection_db() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
