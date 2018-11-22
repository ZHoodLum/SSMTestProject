package com.neu.service;

import java.util.List;

import com.neu.entity.MoveBooking;

public interface MoveBookingService {
	public int insert(MoveBooking moveBooking);
	
	public List<MoveBooking> getallmovebooking();
}
