package com.neusoft.test;

import com.neusoft.controll.Formater;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author     ：zhoodlum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */


public class TestSpring {

    @Test
    public void test1(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        Formater formater = (Formater)beanFactory.getBean("formater");
        System.out.print(formater.execute("AAAAV"));
    }
}
