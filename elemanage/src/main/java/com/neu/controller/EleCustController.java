package com.neu.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.entity.EleCust;
import com.neu.service.BankCustService;
import com.neu.service.EleCustService;

@Controller
@RequestMapping("elecust")
public class EleCustController {
	@Autowired
	private EleCustService eleCustService;
	@Autowired
	private BankCustService bankCustService;
	
	@RequestMapping("getbyid")
	@ResponseBody
	public EleCust getById(String cardId) {
		
		return eleCustService.getById(cardId);
	}
	//缴费
	@RequestMapping("charge")
	@ResponseBody
	public int charge(String eleCardId,String bankCardId) {
		//判断
		//1、判断银行卡是否存在
		boolean b = bankCustService.exist(bankCardId);
		if(!b) {
			return 0;
		}
		//2、判断银行卡的余额
		EleCust eleCust = eleCustService.getById(eleCardId);
		BigDecimal balance = bankCustService.getBalance(bankCardId);
		if(eleCust.getOwnMoney().compareTo(balance) > 0) {
			return 1;
		}
		//开始进行缴费
		//1、银行卡扣费
		//2、修改电表的余额
		int n;
		try {
			n = bankCustService.charge(eleCardId, bankCardId);
			if(n == 1) {
				return 2;
			}
		}catch(Exception e) {
			return 3;
		}
		return 3;
		
	}
}
