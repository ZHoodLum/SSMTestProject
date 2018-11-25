package com.neusoft.vo;

import java.io.Serializable;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */


public class Users implements Serializable {

    public Users(){
        System.out.println("User构造器方法!!");
    }

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
