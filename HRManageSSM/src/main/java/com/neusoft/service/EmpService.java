package com.neusoft.service;

import java.util.List;

import com.neusoft.entity.Emp;

public interface EmpService {
	List<Emp> getAll();
	
	//编辑
	Emp getById (int empId);
	
	int update(Emp emp);
	
	int insert(Emp emp);
}
