package com.sina.bootdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 10:59
 */
@Component
public @Data class StuConfig {
    @Value("${student.name}")
    private  String name;
    @Value("${student.age}")
    private  Integer age;
}
