package com.neusoft.mapper;

import com.neusoft.domain.Dept;

import java.util.List;
import java.util.Map;

/**
 * @ Author     ：ZhoodLum
 * @ Date       ：Created in 2018/11/21
 */


public interface DeptMapper {
   //根据ID进行查询
   public Dept getDeptById(int deptno);

   //查询全部
   public List<Dept> getAllDept();

   //删除 按编号
   public int deleteDeptById(int deptno);

   //添加
   public int addDept(Dept dept);

   //更新
   public int updateDept(Dept dept);

   //按条件查询
   public List<Dept> getDeptList(Dept dept);

   //查询条数
   public int getDeptRecordCount();

   //使用map集合
   public List<Dept> getDeptListMap(Map<String, Object>params);


   //多表连接查询
   public List<Map<String ,Object>> getEmpDeptInfo();
}
