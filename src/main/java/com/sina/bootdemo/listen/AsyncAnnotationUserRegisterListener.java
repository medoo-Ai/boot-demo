package com.sina.bootdemo.listen;

import com.sina.bootdemo.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012下午 12:16
 */

@Component
public class AsyncAnnotationUserRegisterListener {
    //  异步监听的方法上面   添加 async注解
    @Async
    @EventListener
   public void  sendMailToUser(UserRegisterEvent userRegisterEvent){
            // 线程
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("通过异步监听 "+ userRegisterEvent.getUser().getUsername());
   }
}
