package com.neusoft.mapper;

import java.util.List;

import com.neusoft.entity.Emp;

public interface EmpMapper {
	List<Emp> getAll();
	//编辑
	Emp getById (int empId);
	
	int update(Emp emp);
	
	int insert(Emp emp);
}
