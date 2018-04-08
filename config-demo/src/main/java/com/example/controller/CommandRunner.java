package com.example.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ldd on 2018/4/8.
 */
@Component
@Order(1)
public class CommandRunner implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("开始运行"+ CommandRunner.class.getName());
    }
}
