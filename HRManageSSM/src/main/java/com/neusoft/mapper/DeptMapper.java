package com.neusoft.mapper;

import java.util.List;

import com.neusoft.entity.Dept;

public interface DeptMapper {
	Dept getById(int deptId);
	List<Dept> getAll();
}
