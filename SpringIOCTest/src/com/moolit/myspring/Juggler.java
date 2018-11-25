package com.moolit.myspring;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/22
 */

//杂技演员
public class Juggler implements Perform{

    //袋子（球）的个数
    private int bags = 3;

    //默认的构造方法
    public Juggler() { }
    //创造带参构造方法
    public Juggler(int bags) {
        this.bags = bags;
    }
    //实现接口方法
    @Override
    public void perform() {
        System.out.println("表演！抛球，叨叨"+bags+"个球");
    }
}
