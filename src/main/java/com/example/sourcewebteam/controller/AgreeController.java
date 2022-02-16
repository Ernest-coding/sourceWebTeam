package com.example.sourcewebteam.controller;

import com.example.sourcewebteam.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AgreeController {
    @Autowired
    private UserSerivce userSerivce;

}
