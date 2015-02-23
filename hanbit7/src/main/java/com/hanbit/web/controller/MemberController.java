package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = Logger.getLogger(MemberController.class);
	
	@RequestMapping("/main")
	public String main(Model model){
		return "guest/main";
	}
}
