package com.neu.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.EleCust;
import com.neu.entity.EleCustExample;
import com.neu.mapper.EleCustMapper;

@Service
public class EleCustServiceImpl implements EleCustService {
	@Autowired
	private EleCustMapper eleCustMapper;

	@Override
	public EleCust getById(String cardId) {
		
		return eleCustMapper.selectByPrimaryKey(cardId);
	}

	@Override
	public void test() {
		EleCustExample example = new EleCustExample();
		example.or().andAddrLike("长江东路%");
		example.or().andOwnMoneyGreaterThan(new BigDecimal("40"));
		
		/*List<EleCust> list = eleCustMapper.selectByExample(example);
		System.out.println(list);	*/	
		
		EleCust eleCust = new EleCust();
		eleCust.setCardId("1002-003");
		//eleCust.setAddr("沈阳");
		//eleCust.setOwnMoney(new BigDecimal("30"));
		eleCust.setUname("迈克尔");
		
		//eleCustMapper.updateByExample(eleCust, example);
		eleCustMapper.updateByExampleSelective(eleCust, example);
	}

}
