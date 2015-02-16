package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController  {
	
	static final Logger logger = Logger.getLogger(AboutController.class);
	@RequestMapping(value="/main.do")
	public String main(Model model){
		model.addAttribute("main","");
		return "about/main";
	}
	
} //class END



