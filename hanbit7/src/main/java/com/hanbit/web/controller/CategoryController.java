package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	static final Logger logger = Logger.getLogger(CategoryController.class);
	@RequestMapping("/main")
	public String main(Model model){
		return "category/main";
	}
			
}
