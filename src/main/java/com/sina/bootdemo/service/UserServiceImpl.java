package com.sina.bootdemo.service;

import com.sina.bootdemo.event.UserRegisterEvent;

import com.sina.bootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:25
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void registerUser(User user) {
        // 若用户不为null，发布用户注册事件
        if (null!=user) {
            applicationContext.publishEvent(new UserRegisterEvent(this, user));
        }
    }
}
