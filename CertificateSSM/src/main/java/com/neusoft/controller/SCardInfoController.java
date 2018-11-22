package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.entity.CardType;
import com.neusoft.entity.SCardInfo;
import com.neusoft.service.CardTypeService;
import com.neusoft.service.SCardInfoService;


@Controller
@RequestMapping("scardinfo")
public class SCardInfoController {
	@Autowired
	private CardTypeService cardTypeService;
	
	@Autowired
	private SCardInfoService scardInfoService;
	
	@RequestMapping("getSearch")
	public String getSearch(Model model) {
		List<CardType> list = cardTypeService.getAll();
		
		model.addAttribute("list", list);
		
		return "scardinfo/search";
	}
	
	@RequestMapping("getSearch2")
	public String getSearch2(Model model) {
		List<CardType> list = cardTypeService.getAll();
		
		model.addAttribute("list", list);
		
		return "scardinfo/search2";
	}
	
	@RequestMapping("search")
	public String search(Model model,String stype,String sname,String idCard) {
		List<SCardInfo> list = null;
		if("0".equals(stype)) {
			list = scardInfoService.search1(sname, idCard);
		}else {
			list = scardInfoService.search2(stype, sname, idCard);
		}
		
		model.addAttribute("infoList", list);
		
		List<CardType> list2 = cardTypeService.getAll();
		
		model.addAttribute("list", list2);
		
		model.addAttribute("callback", true);
		
		return "scardinfo/search";
	}
	
	@RequestMapping("search2")
	@ResponseBody
	public List<SCardInfo> searchForJSON(String stype,String sname,String idCard) {
		List<SCardInfo> list = null;
		if("0".equals(stype)) {
			list = scardInfoService.search1(sname, idCard);
		}else {
			list = scardInfoService.search2(stype, sname, idCard);
		}		
		
		return list;
	}	
	
	@RequestMapping("del")
	@ResponseBody
	public int del(int sid) {
		return scardInfoService.delete(sid);
	}
}








