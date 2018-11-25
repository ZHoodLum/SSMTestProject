package com.neusoft.factory;

import com.neusoft.service.BusinessService;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/9/27
 * @ Description：${description}
 * @Version: $version$
 */


public class BusinessServiceFactory {

    public BusinessService getInstance(){
        return new BusinessService();
    }

    public static BusinessService staticgetInstance(){
        return new BusinessService();
    }
}
