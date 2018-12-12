package com.sina.bootdemo.pojo;

import lombok.Data;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:38
 */
public @Data class User {
    private  String username;
    private  Integer age;
    public User() {
    }
    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}
