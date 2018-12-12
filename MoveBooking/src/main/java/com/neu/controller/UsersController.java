package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.entity.Users;
import com.neu.service.UsersService;

@Controller
@RequestMapping("users")
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("login")
	public String login(Users users) {
//		if(("admin").equals(users.getName()) && "111".equals(users.getPassword())) {
//			return "users/NewFile";
//		}
		if(usersService.login(users) != null) {
			return "forward:/movebooking/getallmovebooking.action";
		}
		return "redirect:/index.jsp";
	}
}
