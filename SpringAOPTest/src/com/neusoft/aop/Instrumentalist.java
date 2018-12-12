package com.neusoft.aop;

import javax.swing.*;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class Instrumentalist implements Performer {
    //唱歌
    private String song;
    //演奏乐器
    private Instrument instrument;

    //getter  setter方法
    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public Instrument getInstrument() {
        return instrument;
    }
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    //实现接口Performer方法
    @Override
    public void perform() {

        /***
         * 新的需求来  实现下面这个注释的方法，但是不能改变Instrumentlist这个类的代码，也可以想象成它是一个JAR包，你只能调用这里的方法
         * 那么  AOP就诞生了  前置通知，后置通知等等 详情见spring-aop.xml配置文件
         */

        /**
         * 观众坐下并关闭手机 静音
         */
        System.out.println("演奏" + song + "曲目");
        //报异常  退票
        int x = 9/0;
        instrument.play();
        try {
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * 演奏结束后鼓掌  或者要求 退票
         */
    }

}
