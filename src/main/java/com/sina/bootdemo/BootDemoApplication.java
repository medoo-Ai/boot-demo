package com.sina.bootdemo;

import com.sina.bootdemo.listen.InitializeRedisCacheListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoApplication {

    public static void main(String[] args) {
        // 添加监听器
        SpringApplication springApplication = new SpringApplication(BootDemoApplication.class);
        springApplication.addListeners(new InitializeRedisCacheListener());
        springApplication.run(args);
    }
}
