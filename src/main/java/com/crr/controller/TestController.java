package com.crr.controller;

import java.util.List;

import com.crr.mapper.UserMapper;
import com.crr.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/select")
    public List<User> selectAllUsers(){
        return userMapper.getAllUser();
    }
}
