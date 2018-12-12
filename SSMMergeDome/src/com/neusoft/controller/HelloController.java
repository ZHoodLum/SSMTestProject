package com.neusoft.controller;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/28
 */

@Controller
public class HelloController {
    @Value("${chengmi_crawl_timer_enable}")
    private Boolean timerEnabled;
    @Value("${user_name}")
    private String user_name;
    @Value("${age}")
    private String age;

    //雷晓雨
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("你好 世界  ！！！    hello");
        Dept dept = helloService.getDeptById(20);
        System.out.println(dept);

        System.out.println(timerEnabled);
        System.out.println(user_name);
        System.out.println(age);
        return "hello";
    }
}
