package com.sina.bootdemo.listen;

import com.sina.bootdemo.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:38
 */

// 使用注解  进行监听事件
@Component
public class AnnotationUserRegisterListener {
    //  监听用户注册事件
    @EventListener
    public  void sendMailToUser(UserRegisterEvent userRegisterEvent){
        System.out.println("---------------------------");
        System.out.println("利用@EventListener注解监听用户注册事件并向用户发送邮件");
        System.out.println("注册用户名：" + userRegisterEvent.getUser().getUsername());
    }

}
