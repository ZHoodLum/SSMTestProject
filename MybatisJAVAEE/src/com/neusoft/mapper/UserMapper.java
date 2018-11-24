package com.neusoft.mapper;

import com.neusoft.domain.User;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/21
 */


public interface UserMapper {
    //查询
    public User findUserById(int id);
}
