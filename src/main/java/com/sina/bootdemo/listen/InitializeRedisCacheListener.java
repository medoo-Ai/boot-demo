package com.sina.bootdemo.listen;

import com.sina.bootdemo.util.RedisUtil;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012下午 12:26
 */
// 初始化  redis 缓存
    //  把 listner 注册到 启动main 中

public class InitializeRedisCacheListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        // 获取redisUtil ，若其不为null 初始化redis
        ConfigurableApplicationContext applicationContext = applicationReadyEvent.getApplicationContext();
        RedisUtil redisUtil = applicationContext.getBean(RedisUtil.class);
        if (null!=redisUtil) {
            redisUtil.initializeRedisData();
        }

    }
}
