package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.Emp;
import com.neusoft.mapper.EmpMapper;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpMapper empMapper;
	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		return empMapper.getAll();
	}
	//编辑
	@Override
	public Emp getById(int empId) {
		// TODO Auto-generated method stub
		return empMapper.getById(empId);
	}
	
	//修改
	@Override
	public int update(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.update(emp);
	}
	
	//添加
	@Override
	public int insert(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.insert(emp);
	}

}
