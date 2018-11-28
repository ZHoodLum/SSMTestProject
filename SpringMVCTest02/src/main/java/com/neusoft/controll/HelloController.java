package com.neusoft.controll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		ModelAndView  modelAndView = new ModelAndView();
		System.out.println(request.getParameter("username"));
		modelAndView.setViewName("hello.jsp");
		return modelAndView;
	}
}
