package com.sina.bootdemo.controller;

import com.sina.bootdemo.pojo.User;
import com.sina.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:31
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("register")
    public String registerUser(@NotNull String username,@NotNull Integer age){
        // 返回注册  success or fail
        String msg="success";
        try {
            userService.registerUser(new User(username,age));
        } catch (Exception e) {
            msg="fail";
            e.printStackTrace();
        }
        return msg;
    }

}
