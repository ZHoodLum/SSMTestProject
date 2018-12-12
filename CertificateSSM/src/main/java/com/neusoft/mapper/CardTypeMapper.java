package com.neusoft.mapper;

import java.util.List;

import com.neusoft.entity.CardType;

public interface CardTypeMapper {
	
	List<CardType> getAll();
	
	CardType getById(String stype);
}
