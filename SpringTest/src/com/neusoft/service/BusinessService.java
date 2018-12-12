package com.neusoft.service;

import com.neusoft.dao.UserDao;

/**
 * @ Author     ：zhoodlum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */


public class BusinessService {
    UserDao userDao = new UserDao();
    public void querybusiness(){
        userDao.queryuser();
    }
}
