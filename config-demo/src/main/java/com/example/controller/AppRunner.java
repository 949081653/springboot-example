package com.example.controller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ldd on 2018/4/8.
 */
@Component
@Order(2)
public class AppRunner implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("开始运行AppRunner"+AppRunner.class.getName()+applicationArguments.toString());
    }
}
