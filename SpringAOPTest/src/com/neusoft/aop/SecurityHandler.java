package com.neusoft.aop;

import org.aspectj.lang.JoinPoint;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class SecurityHandler {
    private void checkSecurity(JoinPoint joinPoint){

        for (int i = 0; i < joinPoint.getArgs().length; i++) {

            System.out.println(joinPoint.getArgs()[i]);

        }

        System.out.println(joinPoint.getSignature().getName());
        System.out.println("=====checkSecurity====");
    }
}
