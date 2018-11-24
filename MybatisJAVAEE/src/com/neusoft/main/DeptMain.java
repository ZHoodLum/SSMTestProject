package com.neusoft.main;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/21
 */


public class DeptMain {
    public static void main(String[] args) throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
//        Dept dept = deptMapper.getDeptById(10);
        List<Dept> deptList = deptMapper.getAllDept();
        System.out.println(deptList);

    }
}
