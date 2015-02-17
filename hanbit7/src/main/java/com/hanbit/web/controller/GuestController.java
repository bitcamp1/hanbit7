package com.hanbit.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hanbit.web.service.impl.GuestServiceImpl;
import com.hanbit.web.util.PagingUtil;
import com.hanbit.web.vo.GuestVo;

@Controller
@RequestMapping("/guest")
public class  GuestController   {
	@Autowired
	GuestServiceImpl g;
	static final Logger logger = Logger.getLogger(GuestController.class);
	@RequestMapping("/list")
	public String getGuestList(@RequestParam(value="pageNo", required=true, defaultValue="1")int pageNo, 
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
		model.addAttribute("result","list");
		return "guest/main";
	}
	@RequestMapping("/detail")
	public String getGuest(@RequestParam("index")int guestNo,
			Model model){
		model.addAttribute("guest",g.getGuestByID(guestNo));
		model.addAttribute("result","detail");
		return "guest/main";
	}
	@RequestMapping("/update")
	public String updateGuest(
			@ModelAttribute("guest")GuestVo guest,
			RedirectAttributes r){	
		g.updateGuest(guest);
		r.addFlashAttribute("message","수정되었습니다.");
		return "redirect:list.do";
	}
	@RequestMapping("/delete")
	public String removeGuest(@RequestParam("index")int guestNo,
			RedirectAttributes r ){
		g.removeGuest(guestNo);
		r.addFlashAttribute("message","삭제되었습니다.");
		return "redirect:list.do";
	}
	
			
} //class END



