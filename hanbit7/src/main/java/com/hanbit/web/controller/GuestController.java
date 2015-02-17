package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbit.web.service.impl.GuestServiceImpl;
import com.hanbit.web.util.PagingUtil;

@Controller
@RequestMapping("/guest")
public class  GuestController   {
	@Autowired
	GuestServiceImpl g;
	static final Logger logger = Logger.getLogger(GuestController.class);
	@RequestMapping("/list.do")
	public String getGuestList(@RequestParam("pageNo")int pageNo,
			Model model){
		int pageSize = 10;
		int start = PagingUtil.getStart(pageNo, pageSize);
		int end = PagingUtil.getEnd(pageNo, pageSize);
		logger.debug("[DEBUG] CONTROL start :"+start);
		logger.debug("[DEBUG] CONTROL end :"+end);
		int page[] = {start,end};
		model.addAttribute("pageNo",pageNo);
		model.addAttribute("totCount",g.getTotCount());
		model.addAttribute("list",g.getAllGuests(page));
		return "guest/main";
	}
	
			
} //class END



