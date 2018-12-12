package com.neusoft.service;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/28
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    DeptMapper deptMapper;
    @Autowired
    EmpMapper empMapper;

    @Override
//    @Transactional
    public Dept getDeptById(int id) {
//        验证事物处理
//        Dept dept = new Dept();
//        dept.setDname("哒哒2");
//        deptMapper.addDept(dept);
//        int a = 34 / 0;
//        empMapper.deleteByPrimaryKey(7369);
        return deptMapper.getDeptByID(id);
    }
}
