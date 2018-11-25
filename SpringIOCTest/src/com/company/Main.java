package com.company;

import com.moolit.myspring.Juggler;
import com.moolit.myspring.Perform;
import com.moolit.myspring.Poem;
import com.moolit.myspring.SongXiaoBao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        /*
        正常的方式调用
     */
	    // 调用Juggler类
//        Juggler juggler = new Juggler();
//        juggler.perform();

//        Perform perform = new Juggler();
//        perform.perform();

        //调用SongXiaoBao类
//        Perform perform = new SongXiaoBao();
//        perform.perform();

        /*
        使用spring加载对象
     */
//        1、初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Perform perform = (Perform)context.getBean("juggle");
        System.out.println("第一个节目：");
        perform.perform();

        Perform perform1 = (Perform)context.getBean("songxiaobao");
        System.out.println("第二个节目：");
        perform1.perform();

        //背诗
//        Poem poem = (Poem) context.getBean("shashibiya");
        System.out.println("第三个节目：");
//        poem.recite();
        perform1 = (Perform)context.getBean("liudehua");
        perform1.perform();

        System.out.println("第四个节目：");
        Perform perform4 = (Perform)context.getBean("zhaoliying");
        perform4.perform();

    }
}
