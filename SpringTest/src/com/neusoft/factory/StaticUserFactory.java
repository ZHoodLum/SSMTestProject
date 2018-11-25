package com.neusoft.factory;

import com.neusoft.vo.Users;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/9/28
 * @ Description：${description}
 * @Version: $version$
 */


public class StaticUserFactory {
    public static Users getInstance() {
        return new Users();
    }
}
