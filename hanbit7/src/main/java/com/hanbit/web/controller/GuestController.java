package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanbit.web.service.impl.GuestServiceImpl;

@Controller
@RequestMapping("/guest")
public class  GuestController   {
	@Autowired
	GuestServiceImpl g;
	static final Logger logger = Logger.getLogger(GuestController.class);
	@RequestMapping("/main")
	public String main(Model model){
		model.addAttribute("list",g.getAllGuests());
		return "guest/main";
	}
			
} //class END



