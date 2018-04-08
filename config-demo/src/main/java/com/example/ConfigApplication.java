package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;

/**
 * Created by ldd on 2018/4/8.
 */
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

}
