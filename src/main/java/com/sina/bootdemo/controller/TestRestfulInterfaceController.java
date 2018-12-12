package com.sina.bootdemo.controller;

import com.sina.bootdemo.config.StuConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther SyntacticSugar
 * @data 2018/12/12 0012上午 10:34
 */

@RestController
@RequestMapping("rest")
public class TestRestfulInterfaceController {
    @Autowired
    private StuConfig stuConfig;

    @GetMapping("test")
    public String rest(@RequestParam("name")String name){
        return  "hello "+name;
    }

    //  读取配置文件中的student属性
    @GetMapping("showNews")
    public  String show(){
        return "hello "+stuConfig.getName()+",age :"+stuConfig.getAge();
    }

}
