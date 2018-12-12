package com.neusoft.aop;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public interface UserManager {
    public void addUser(String username,String password);



    public void delUser(int userId);



    public String findUserById(int userId);



    public void modifyUser(int userId,String username,String password);
}
