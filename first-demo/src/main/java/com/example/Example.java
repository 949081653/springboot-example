package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ldd on 2018/4/3.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }
}
