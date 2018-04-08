package com.example.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by ldd on 2018/4/8.
 */
@ConfigurationProperties(value = "my")
public class MyConfig {

    private Integer number;

    private String secret;

    private String uuid;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
