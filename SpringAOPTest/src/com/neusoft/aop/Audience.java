package com.neusoft.aop;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class Audience {
    // 表演之前
    public void takeSeats() {
        System.out.println("表演之前  按号就座       The audience is taking their seats.");
    }

    // 表演之前
    public void turnOffCellPhones() {
        System.out.println("表演之前 手机静音   The audience is turning off their cellphones");
    }

    // 表演之后
    public void applaud() {
        System.out.println("表演之后鼓掌 鼓掌           CLAP CLAP CLAP CLAP CLAP");
    }

    // 表演失败之后
    public void demandRefund() {
        //见Instrumentalist类  45行 代码
        System.out.println("表演失败之后,退票，退票    Boo! We want our money back!");
    }
}
