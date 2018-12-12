package com.moolit.myspring;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/22
 */


public class PoeticJugger extends Juggler {
    private Poem poem;

    public PoeticJugger(Poem poem) {
//        super(1);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        poem.recite();
    }

}
