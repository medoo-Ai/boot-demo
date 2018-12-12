package com.sina.bootdemo.event;

import com.sina.bootdemo.pojo.User;
import lombok.Data;

import org.springframework.context.ApplicationEvent;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:20
 */
public @Data class UserRegisterEvent extends ApplicationEvent {
//  user注册用户、source 事件源
    private User user;
    public UserRegisterEvent(Object source,User user ) {
        super(source);
        this.user=user;
    }
}
