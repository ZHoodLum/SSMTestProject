package com.neusoft.main;

import com.neusoft.domain.User;
import com.neusoft.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/21
 */


public class Main {
    public static void main(String[] args) throws IOException {
        //创建sqlSessionFactory
        //Mybatis 配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂,传入Mybatis的配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建usermapper对象,mybatis自动生成代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper的方法
        User user = userMapper.findUserById(1);
        System.out.println(user.getUsername());
    }
}
