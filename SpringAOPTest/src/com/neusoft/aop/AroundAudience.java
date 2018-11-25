package com.neusoft.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class AroundAudience {
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("表演之前  按号就座       The audience is taking their seats.");
            System.out.println("表演之前 手机静音   The audience is turning off their cellphones");

            long start = System.currentTimeMillis();            // 执行被通知的方法
            proceedingJoinPoint.proceed();            // 表演之后
            long end = System.currentTimeMillis();

            System.out.println("表演之后鼓掌 鼓掌           CLAP CLAP CLAP CLAP CLAP");
        } catch (Exception e) {

        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("表演失败之后,退票，退票    Boo! We want our money back!");

        }
    }
}
