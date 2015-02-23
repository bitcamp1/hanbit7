package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	static final Logger logger = Logger.getLogger(BoardController.class);
	@RequestMapping("/main.do")
	public String main(Model model){
		
		return "board/main";
	}
} //class END






