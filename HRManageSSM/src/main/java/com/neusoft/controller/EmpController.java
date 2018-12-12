package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.entity.Dept;
import com.neusoft.entity.Emp;
import com.neusoft.mapper.EmpMapper;
import com.neusoft.service.DeptService;
import com.neusoft.service.EmpService;

@Controller
@RequestMapping("emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("getAll")
	public String getAll(Model model) {
		List<Emp> list = empService.getAll();
		model.addAttribute("list",list);
		return "emp/getall";
		
	}
	
	@RequestMapping("edit")
	public String edit(int empId,Model model) {
		Emp emp = empService.getById(empId);
		model.addAttribute("emp",emp);
		
		List<Dept> deptlist = deptService.getAll();
		model.addAttribute("deptlist",deptlist);
		
		return "emp/edit";
		
	}
	
	
	@RequestMapping("update")
	public String update(Emp emp) {
		empService.update(emp);
		return "forward:getAll.action";
		
	}
	
	@RequestMapping("getadd")
	public String getadd(Model model) {
		List<Dept> deptlist = deptService.getAll();
		model.addAttribute("deptlist",deptlist);
		return "emp/add";
		
	}
	
	@RequestMapping("add")
	public String add(Emp emp) {
		empService.insert(emp);
		return "forward:getAll.action";
		
	}
	
}
