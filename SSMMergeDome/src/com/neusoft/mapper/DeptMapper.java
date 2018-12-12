package com.neusoft.mapper;

import com.neusoft.domain.Dept;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/21.
 */
public interface DeptMapper {
    public Dept getDeptByID(int id);
    public List<Dept> getAllDepts();
    public int deleteDeptByID(int id);

    public int addDept(Dept dept);
    public int updateDept(Dept dept);

    public List<Dept> getDeptsList(Dept dept);

    public int getDeptRecordCount();

    public List<Dept> getDeptsListMap(Map<String, Object> params);

    public List<Map<String,Object>> getEmpDeptInfo();

}
