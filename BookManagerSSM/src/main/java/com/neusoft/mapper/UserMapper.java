package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.entity.User;

public interface UserMapper {
	
	User login(User user);
	int register(User user);
	List<User> getAllUser();
	int delete(int id);
	User getById(int id);
	int update(User user);
	//添加
	int add(User user);
	//分页
	List<User> getpage(@Param("pageSize")int pageSize,@Param("pageNum")int pageNum);
	int count();
	
}
