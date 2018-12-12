package com.neu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neu.entity.BankCust;
import com.neu.entity.EleCust;
import com.neu.mapper.BankCustMapper;
import com.neu.mapper.EleCustMapper;

@Service
public class BankCustServiceImpl implements BankCustService {

	@Autowired
	private BankCustMapper bankCustMapper;
	@Autowired
	private EleCustMapper eleCustMapper;
	
	//查询卡号是否存在
	@Override
	public boolean exist(String cardId) {
		// TODO Auto-generated method stub
		BankCust bankCust = bankCustMapper.selectByPrimaryKey(cardId);
		if(bankCust == null) {
			return false;
		}
		return true;
	}

	//查询余额
	@Override
	public BigDecimal getBalance(String cardId) {
		// TODO Auto-generated method stub
		BankCust bankCust = bankCustMapper.selectByPrimaryKey(cardId);
		return bankCust.getBlanace();
	}

	//缴费
	@Transactional
	@Override
	public int charge(String eleCardId, String bankCardId) {
		// TODO Auto-generated method stub
		//查询银行卡信息余额
		EleCust eleCust = eleCustMapper.selectByPrimaryKey(eleCardId);
		
		BankCust bankCust = bankCustMapper.selectByPrimaryKey(bankCardId);
		BigDecimal balance = bankCust.getBlanace().subtract(eleCust.getOwnMoney());
		int c = 10/0;
		bankCust.setCardId(bankCardId);
		bankCust.setBlanace(balance);
		//更新银行卡信息
		bankCustMapper.updateByPrimaryKey(bankCust);
		eleCust.setOwnMoney(new BigDecimal(0));
		//根据主键 更新电表欠费数
		eleCustMapper.updateByPrimaryKey(eleCust);
		
		return 1;
	}

}
