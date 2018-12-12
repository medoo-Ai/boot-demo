package com.sina.bootdemo.util;

import org.springframework.stereotype.Component;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012下午 12:30
 */
@Component
public class RedisUtil {
    public void initializeRedisData() {
        System.out.println("初始化redis 缓存");
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){

        }
    }
}
