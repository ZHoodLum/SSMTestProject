package com.neusoft.aop;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/23
 */


public class UserManagerImpl implements UserManager {
    @Override
    public void addUser(String username, String password) {
        //checkSecurity();
        System.out.println("===UserManager.addUser===");
    }

    @Override
    public void delUser(int userId) {
        //checkSecurity();
        System.out.println("===UserManager.delUser===");
    }

    @Override
    public String findUserById(int userId) {
        //checkSecurity();
        System.out.println("===UserManager.findUserById===");
        return  "张三";
    }

    @Override
    public void modifyUser(int userId, String username, String password) {
        //checkSecurity();
        System.out.println("===UserManager.modifyUser===");
    }
}
