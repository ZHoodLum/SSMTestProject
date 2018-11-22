package com.neusoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.entity.User;

public interface UserService {
	
	User login(User user);
	
	int register(User user);
	
	List<User> getAllUser();
	
	int delete(int id);
	
	User getById(int id);
	int update(User user);
	//添加
	int add(User user);
	//分页
	List<User> getpage(int pageSize,int pageNum);
	int count();
}
