package com.moolit.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */

@Component("guanyu")
public class GuanYu implements Hero {

    @Autowired
    @Qualifier("gaunyudecai")
    private Weapon weapon;
    public void perform() {
        System.out.println("GuanYu pick up his weapon.");
        weapon.attack();
    }
    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;
    }
}
