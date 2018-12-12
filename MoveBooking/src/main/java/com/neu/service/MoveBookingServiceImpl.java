package com.neu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.entity.MoveBooking;
import com.neu.mapper.MoveBookingMapper;

@Service
public class MoveBookingServiceImpl implements MoveBookingService {
	@Autowired
	private MoveBookingMapper moveBookingMapper; 
	
	//添加预约表单
	@Override
	public int insert(MoveBooking moveBooking) {
		// TODO Auto-generated method stub
		return moveBookingMapper.insertSelective(moveBooking);
	}

	//查询全部
	@Override
	public List<MoveBooking> getallmovebooking() {
		// TODO Auto-generated method stub
		return moveBookingMapper.getallmovebooking();
	}
	
}
