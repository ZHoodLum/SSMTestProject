package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.Dept;
import com.neusoft.mapper.DeptMapper;
import com.neusoft.mapper.EmpMapper;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;
	
	
	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return deptMapper.getAll();
	}
	
}
