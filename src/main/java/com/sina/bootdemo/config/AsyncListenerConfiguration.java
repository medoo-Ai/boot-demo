package com.sina.bootdemo.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012下午 12:07
 */

// 设置异步线程池对象 , 开启异步
@Configuration
@EnableAsync
public class AsyncListenerConfiguration implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor poolTE = new ThreadPoolTaskExecutor();
        // 设置线程池的数目
        poolTE.setCorePoolSize(10);
        poolTE.setMaxPoolSize(20);
        poolTE.setQueueCapacity(50);
        poolTE.initialize();
        return poolTE;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
