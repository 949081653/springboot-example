package com.example.controller;

import com.example.bean.User;
import com.example.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldd on 2018/4/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getUserByName")
    @ResponseBody
    public User getUserByName(String name){
        User user = userMapper.selectUserByName(name);
        return user;
    }
}
