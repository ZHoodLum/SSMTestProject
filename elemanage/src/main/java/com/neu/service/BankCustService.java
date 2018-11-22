package com.neu.service;

import java.math.BigDecimal;

public interface BankCustService {
	
	//查询银行卡
	public boolean exist(String cardId);
	//卡余额
	public BigDecimal getBalance(String cardId);
	
	//缴费
	public int charge(String eleCardId,String bankCardId);
}
