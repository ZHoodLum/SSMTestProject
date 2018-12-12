package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neusoft.entity.CardType;
import com.neusoft.service.CardTypeService;

@Controller
@RequestMapping("cardtype")
public class CardTypeController {
	@Autowired
	private CardTypeService  cardTypeService;
	
	
	@RequestMapping("getAll")
	public String getAll(Model model) {
		List<CardType> list = cardTypeService.getAll();
		model.addAttribute("list",list);
		return "cardtype/getall";
		
	}
	
}
