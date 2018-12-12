package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.Book;
import com.neusoft.mapper.BookMapper;


@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookMapper bookMapper;
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookMapper.getAll();
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return bookMapper.delete(id);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookMapper.getById(id);
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return bookMapper.update(book);
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return bookMapper.insert(book);
	}

	@Override
	public List<Book> getpaged(int pageSize, int pageNum) {
		// TODO Auto-generated method stub
		return bookMapper.getpaged(pageSize, pageNum);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return bookMapper.count();
	}

}
