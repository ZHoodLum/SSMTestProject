package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.entity.Book;

public interface BookMapper {
	List<Book> getAll();
	int delete(int id);
//	根据iD查找图书
	Book getById(int id);
//	保存图书信息，返回数据库行数
	int update(Book book);
	
	//添加
	int insert(Book book);
	
	//分页
//	pageSize 每页多少数据，pageNum 第几页
	List<Book> getpaged(@Param("pageSize")int pageSize,@Param("pageNum")int pageNum);
	//数据总量
	int count();
	
}
