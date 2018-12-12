package com.neu.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neu.entity.EleCust;
import com.neu.mapper.EleCustMapper;

public class EleCustServiceTest {
	
	@Test
	public void testGetById() {
		//启动spring容器
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EleCustService custService = c.getBean(EleCustService.class);
		
		EleCust eleCust = custService.getById("1002-003");
		
		System.out.println(eleCust);
	}
	@Test
	public void test() {
		//启动spring容器
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EleCustService custService = c.getBean(EleCustService.class);
		
		custService.test();
	}
	
//	@Test
//	public void testEmpGet() {
//		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		TblempMapper tblempMapper = c.getBean(TblempMapper.class);
//		
//		Tblemp tblemp = tblempMapper.selectByPrimaryKey(1);
//		
//		System.out.println(tblemp.getDept().getDname());
//	}
}








