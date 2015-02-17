package com.hanbit.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanbit.web.dao.GuestDao;
import com.hanbit.web.service.GuestService;
import com.hanbit.web.vo.GuestVo;
@Service
public class GuestServiceImpl implements GuestService{
	static final Logger logger = Logger.getLogger(GuestServiceImpl.class);
	@Autowired
	private GuestDao dao;
	@Override
	public List<GuestVo> getAllGuests(int[] page) {
		int start = page[0];
		int end = page[1];
		logger.debug("[DEBUG] SERVICE start :"+start);
		logger.debug("[DEBUG] SERVICE end  :"+end);
		return dao.getAllGuests(start,end);
	}

	@Override
	public GuestVo getGuestByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addGuest(GuestVo guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGuest(GuestVo guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeGuest(int guestNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTotCount() {
		return dao.getTotCount();
	}

}
