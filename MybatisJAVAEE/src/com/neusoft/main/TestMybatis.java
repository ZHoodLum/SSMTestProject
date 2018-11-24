package com.neusoft.main;

import com.neusoft.domain.Dept;
import com.neusoft.domain.Emp;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/21
 */


public class TestMybatis {
    SqlSession sqlSession = null;
    DeptMapper deptMapper = null;
    EmpMapper empMapper = null;
    //每次junit执行的执行的使用都会最先执行before
    @Before
    public  void beforemain() throws IOException{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
         sqlSession = sqlSessionFactory.openSession();

        deptMapper = sqlSession.getMapper(DeptMapper.class);
        empMapper = sqlSession.getMapper(EmpMapper.class);
    }
    @Test
    //查询全部
    public void getAllDept() throws IOException {
        List<Dept> deptList = deptMapper.getAllDept();
        System.out.println(deptList);
    }

    @Test
    //根据ID进行查询
    public void getDeptById() throws IOException{
        Dept dept = deptMapper.getDeptById(10);
        System.out.println(dept);
    }

    @Test
    //删除 按编号
    public void deleteDeptById() throws IOException{
        int dept = deptMapper.deleteDeptById(40);
        sqlSession.commit();
        System.out.println(dept);
    }

    @Test
    //添加
    public void addDept() throws IOException{
        Dept dept = new Dept();
        dept.setDname("销售2");
        dept.setLoc("沈阳");
        int result = deptMapper.addDept(dept);
        sqlSession.commit();
        System.out.println(dept.getDeptno());

        System.out.println(result);
    }

    @Test
    //更新
    public void updateDept() throws IOException{
        Dept dept = new Dept();
        dept.setDeptno(46);
        dept.setDname("销售2222");
        dept.setLoc("沈阳");
        int result = deptMapper.updateDept(dept);
        sqlSession.commit();
        System.out.println(result);
    }

    @Test
    //按条件查询
    public void getDeptList() throws IOException {
        Dept dept = new Dept();
        dept.setLoc("沈阳");
        dept.setDname("销售");
        List<Dept> deptList = deptMapper.getDeptList(dept);
        System.out.println(deptList);
    }

    @Test
    //查询表数据中的数目
    public void getDeptRecordCount() throws IOException {
        int deptList = deptMapper.getDeptRecordCount();
        System.out.println(deptList);
    }

    @Test
    //使用map集合进行查询
    public void getDeptListMap() throws IOException{
        Map<String, Object> params = new HashMap<>();
        params.put("loc", "沈阳");
        params.put("deptname", "销售");
        List<Dept> deptList = deptMapper.getDeptListMap(params);
        System.out.println(deptList);
    }

    @Test
    //使用多表连接查询 emp表和dept表
    public void getEmpDeptInfo() throws IOException{
        List<Map<String,Object>> deptList = deptMapper.getEmpDeptInfo();
        for (Map<String,Object> mapRow:deptList){
            //第一种遍历map集合的方法
//            for (String key : mapRow.keySet()) {
//                System.out.println(key + "?"+ mapRow.get(key));
//            }
            //第二种遍历map集合的方法
            for (Map.Entry<String, Object> entryMap : mapRow.entrySet()) {
                System.out.println(entryMap);
            }
            System.out.println("-----");
        }
       // System.out.println(deptList);
    }


    //Emp表
    @Test
    public void getEmpInfo() {
        Emp emp = empMapper.selectByPrimaryKey(7369);
        System.out.println(emp.getEname());
    }
}
