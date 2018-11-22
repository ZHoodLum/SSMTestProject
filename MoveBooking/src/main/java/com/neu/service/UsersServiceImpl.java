package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.Users;
import com.neu.mapper.UsersMapper;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users login(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.login(users);
	}

	
}
