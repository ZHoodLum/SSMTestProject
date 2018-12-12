package com.neusoft.controll;

/**
 * @ Author     ：zhoodlum
 * @ Date       ：Created in 2018/9/26
 * @ Description：${description}
 * @Version: $version$
 */


public class Lowerformater implements Formater{

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String execute(String s) {
        return title+":"+s+":"+s.toLowerCase();
    }
}
