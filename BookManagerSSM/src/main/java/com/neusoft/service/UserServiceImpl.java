package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.User;
import com.neusoft.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
//	声明组件 能被扫描到 实现自动装配 自动扫描
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		
		return userMapper.login(user);
	}

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userMapper.register(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return userMapper.getById(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

//	分页
	@Override
	public List<User> getpage(int pageSize, int pageNum) {
		// TODO Auto-generated method stub
		return userMapper.getpage(pageSize, pageNum);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return userMapper.count();
	}

}
