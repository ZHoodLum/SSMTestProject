package com.neusoft.aop;

import javax.sound.midi.Soundbank;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("演奏的乐器发出的声音mou mou mou jou  jou jou");
    }
}
