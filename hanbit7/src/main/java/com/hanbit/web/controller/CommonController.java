package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/common")
public class CommonController {
	static final Logger logger = Logger.getLogger(CommonController.class);
	
	@RequestMapping(value="/main.do",method=RequestMethod.GET)
	public String main(Model model){
		model.addAttribute("hello", "Hello !!");
		return "common/main";
	}
}
