package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.neusoft.entity.Book;
import com.neusoft.service.BookService;

@Controller
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("getall")
	public String getAll(Model model){
		//list集合放入到request中，jsp中访问request,得到list集合
		List<Book> list = bookService.getAll();
		model.addAttribute("list",list);
		return "book/getall";
		
	}
	
	@RequestMapping("del")
	public String delete(int id){
		bookService.delete(id);
		return "forward:/book/getall.action";
		
	}
	
	@RequestMapping("edit")
	public String edit(int id,Model model){
		Book book = bookService.getById(id);
		model.addAttribute("book",book);
		return "book/edit";
		
	}
	
	@RequestMapping("update")
	public String update(Book book){
		bookService.update(book);
		return "forward:/book/getall.action";
		
	}
	
	//跳转添加界面
	@RequestMapping("getadd")
	public String getadd(){
		return "book/add";
		
	}
	//添加
	@RequestMapping("add")
	public String add(Book book){
		bookService.insert(book);
		return "forward:/book/getall.action";
		
	}
	
//	分页
	@RequestMapping("getPaged")
	//设置为默认值 为@RequestParam(defaultValue="1")
	public String getPaged(@RequestParam(defaultValue="1") int pageNum,Model model) {
		int pageSize = 2;
		List<Book> list = bookService.getpaged(pageSize, pageNum);
		model.addAttribute("list",list);
		
		model.addAttribute("pageSize",pageSize);
		model.addAttribute("pageNum",pageNum);
		
		int rowNum = bookService.count();
		model.addAttribute("rowNum",rowNum);
		
		int num = (rowNum%pageSize ==0)?(rowNum/pageSize):(rowNum/pageSize)+1;
		model.addAttribute("num",num);
		return "book/getpaged";
	}
	
	
}
