package com.neusoft.dao;

/**
 * @ Author     ：zhoodlum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */


public class UserDao {
    /**
     *  init-method="init" destroy-method="destory"
     *  在xml文件中进行配置
     */
    //初始化方法
    public void init(){
        System.out.println("init方法！");
    }
    //销毁方法
    public void destory(){
        System.out.println("destory方法！");
    }

    public UserDao(){

        System.out.print("当前dao被实例化！");
    }

    public void queryuser()
    {
        System.out.print("这个是UserDao方法！");
    }
}
