package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.CardType;
import com.neusoft.mapper.CardTypeMapper;

@Service
public class CardTypeServiceImpl implements CardTypeService{
	@Autowired
	private CardTypeMapper cardTypeMapper;

	@Override
	public List<CardType> getAll() {
		// TODO Auto-generated method stub
		return cardTypeMapper.getAll();
	}
	
	
}
