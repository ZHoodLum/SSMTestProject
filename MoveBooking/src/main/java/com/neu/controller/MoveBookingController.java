package com.neu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.entity.MoveBooking;
import com.neu.service.MoveBookingService;


// http://localhost:8089/movebooking/getjsp.action
@Controller
@RequestMapping("movebooking")
public class MoveBookingController {
	@Autowired
	private MoveBookingService moveBookingService;
	
	@RequestMapping("getjsp")
	public String getjsp(){
		return "movebooking/add";
	}
	@RequestMapping("insert")
	public String insert(MoveBooking moveBooking) {
		moveBookingService.insert(moveBooking);
		
		return "movebooking/success";
	}
	
	@RequestMapping("getallmovebooking")
	public String getallmovebooking(Model model) {
		List<MoveBooking> list = moveBookingService.getallmovebooking();
		model.addAttribute("list",list);
		return "users/main";
	}
}
