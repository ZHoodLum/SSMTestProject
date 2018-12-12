package com.moolit.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class HalBerd implements Weapon {
    @Autowired
    @Qualifier("lvbudecai")
    @Override
    public void attack() {
        System.out.println("方天画戟再次！");
    }
}
