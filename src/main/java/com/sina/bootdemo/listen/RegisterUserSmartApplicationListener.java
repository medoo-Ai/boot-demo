package com.sina.bootdemo.listen;

import com.sina.bootdemo.event.UserRegisterEvent;
import com.sina.bootdemo.service.UserServiceImpl;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 11:49
 */

// 实现 接口进行监听事件
@Component
public class RegisterUserSmartApplicationListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass== UserRegisterEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        // 事件源 、 和service的实现类
        return sourceType== UserServiceImpl.class;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        UserRegisterEvent userRegisterEvent =(UserRegisterEvent)applicationEvent;
        System.out.println("---------------------------");
        System.out.println("实现SmartApplicationListener接口进行监听");
        System.out.println("向用户发送邮箱"+userRegisterEvent.getUser().getUsername());
    }
}
