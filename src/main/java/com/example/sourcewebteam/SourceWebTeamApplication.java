package com.example.sourcewebteam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.sourcewebteam.mapper")
@SpringBootApplication
public class SourceWebTeamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SourceWebTeamApplication.class, args);
    }

}
