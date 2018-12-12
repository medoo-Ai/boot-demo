package com.sina.bootdemo.listen;

import com.sina.bootdemo.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:44
 */
//  实现接口 ApplicationListener 进行监听
@Component
public class RegisterUserApplicationListener  implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("---------------------------");
        System.out.println("实现ApplicationListener接口监听userRegisterEvent 并向用户发邮箱");
        System.out.println("注册的用户名字"+userRegisterEvent.getUser().getUsername());
    }
}
