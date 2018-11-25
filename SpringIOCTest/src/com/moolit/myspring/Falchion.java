package com.moolit.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */

@Component
@Qualifier("gaunyudecai")
public class Falchion implements Weapon {
    public void attack() {
        System.out.println("青龙偃月刀在此，falcon is attacking!");
    }
}