package com.company;

import com.moolit.myspring.Hero;
import com.moolit.myspring.Perform;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class WeaponMain {
    public static void main(String[] args) {
//        1、初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Hero hero = (Hero) context.getBean("guanyu");
        hero.perform();


    }
}
