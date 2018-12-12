package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.neusoft.entity.Book;
import com.neusoft.entity.User;
import com.neusoft.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login(User user) {
//		if(("admin").equals(user.getUsername()) && "111".equals(user.getPassword())) {
//			return "user/main";
//		}
		if(userService.login(user) != null) {
			return "user/main";
		}
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("register")
	public String register(User user) {
		userService.register(user);
		
		return "user/success";
	}
	
	@RequestMapping("getalluser")
	public String getAllUser(Model model) {
		List<User> list = userService.getAllUser();
		model.addAttribute("list",list);
		return "user/getalluser";
	}
	
	@RequestMapping("delete")
	public String delete(int id) {
		
		userService.delete(id);
		return "forward:/user/getalluser.action";
	}
	
	@RequestMapping("edituser")
	public String getById(int id,Model model) {
		User user = userService.getById(id);
		model.addAttribute("user",user);
		return "user/edituser";
		
	}
	@RequestMapping("update")
	public String update(User user) {
		userService.update(user);
		return "forward:/user/getalluser.action";
	}
	
	//跳转界面
	@RequestMapping("getadd")
	public String add() {
		return "/user/adduser";
		
	}

	@RequestMapping("add")
	public String add(User user) {
		userService.add(user);
		return "forward:/user/getalluser.action";
	}
	
	//分页查询
	@RequestMapping("getPage")
	public String getPage(@RequestParam(defaultValue="1") int pageNum,Model model) {
		int pageSize = 2;
		List<User> list = userService.getpage(pageSize, pageNum);
		model.addAttribute("list",list);
		
		model.addAttribute("pageSize",pageSize);
		model.addAttribute("pageNum",pageNum);
		
		int rowNum =  userService.count();
		model.addAttribute("rowNum",rowNum);
		
		int num = (rowNum%pageSize ==0)?(rowNum/pageSize):(rowNum/pageSize)+1;
		model.addAttribute("num",num);
		
		return "user/getalluser2";
		
	}
}
