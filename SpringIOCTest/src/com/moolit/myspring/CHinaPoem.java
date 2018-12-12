package com.moolit.myspring;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/22
 */


public class CHinaPoem implements Poem {
    private static String[] LINES = {
            "门前一直压",
            "老虎没打着,",
            "小兔子乖乖,",
    };
    @Override
    public void recite() {
        for (String line : LINES)
            System.out.println(line);
    }
}
