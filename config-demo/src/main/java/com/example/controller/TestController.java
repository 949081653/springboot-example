package com.example.controller;

import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ldd on 2018/4/8.
 */
@RestController
public class TestController {


    @RequestMapping("/index")
    public String index(){
        MyConfig config = new MyConfig();
        return config.getUuid()+" hello world";
    }
}
