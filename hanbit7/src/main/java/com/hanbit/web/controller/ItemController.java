package com.hanbit.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.web.service.impl.ItemServiceImpl;
import com.hanbit.web.util.PagingUtil;
import com.hanbit.web.vo.ItemVo;




@Controller
@RequestMapping("/item")
public class  ItemController   {
	static final Logger logger = Logger.getLogger(ItemController.class);
	@Autowired
	ItemServiceImpl s;
	@RequestMapping("/main")
	public @ResponseBody Map<String,Object> main(
			@RequestParam(value="pageNo", required=true, defaultValue="1")int pageNo,
			@RequestParam(value="key",required=false)String key,
			@RequestParam(value="val",required=false)String val
			){
		int pageSize = 10;
		int start = PagingUtil.getStart(pageNo, pageSize);
		int end = PagingUtil.getEnd(pageNo, pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);
		map.put("key", key);
		map.put("val", val);
		Map<String, Object> result = new HashMap<String, Object>();
		map.put("pageNo", pageNo);
		map.put("list", s.getList(result));
		return result;
	}
	

} //class END





