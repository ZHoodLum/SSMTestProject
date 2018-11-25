package com.neusoft.test;

import com.neusoft.dao.UserDao;
import com.neusoft.factory.BusinessServiceFactory;
import com.neusoft.service.BusinessService;
import com.neusoft.vo.Users;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */

/**
 * 如果你想使用对象的话，你需要从新new一个对象
 */
public class Testspring1{

    //原始的方式
    //需要什么得从新new，然后进行使用
    @Test
    public void test1(){
        BusinessService businessService = new BusinessService();
        businessService.querybusiness();
    }

    //半封建社会(使用工厂)
    @Test
    public void test2(){
        BusinessService businessService = BusinessServiceFactory.staticgetInstance();
        businessService.querybusiness();
    }

    //现代社会
    //使用Spring 帮我们new

    //第一种方法 使用beanfactory
    @Test
    public void test3(){
        //属于懒加载
        /**
         * 节省内存 ，获得时候在帮我们进行实例化
         * 但是浪费响应时间
         */
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/config/applicationContext.xml"));
        BeanFactory beanFactory1 = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        //当使用get具体的bean实体类才会进行初始化，当前UserDao被实例化
        beanFactory1.getBean("userdao");

    }

    //第二种方法 使用applicationcontext
    @Test
    public void test4(){
        //当我们获得Spring容器时，容器里的bean就会被自动的被实例化
        //属于积极加载
        /**
         * 空间换时间
         *
         * 在加载容器的时候，就将我所有的容器都进行加载，加载到内存当中
         * 需要消耗内存   ，来换取响应时间更快一点
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userdao");
        userDao.queryuser();
        userDao.queryuser();
    }

//    通过构造器进行实例化
    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/applicationContext.xml");

    }

//    通过静态工厂
    @Test
    public void test6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        Users user = (Users)applicationContext.getBean("staticuserfactory");
        System.out.println(user);
    }

    //    通过实例工厂
    @Test
    public void test7(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        Users user = (Users)applicationContext.getBean("user1");
        System.out.println(user);
    }

}
