package com.neusoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.entity.Book;

public interface BookService {
	List<Book> getAll();
	int delete(int id);
	Book getById(int id);
	int update(Book book);
	//添加
	int insert(Book book);
	//分页
//	pageSize 每页多少数据，pageNum 第几页
	List<Book> getpaged(int pageSize,int pageNum);
	//数据总量
	int count();
	
}
