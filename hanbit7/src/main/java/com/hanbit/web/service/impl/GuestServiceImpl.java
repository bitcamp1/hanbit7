package com.hanbit.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanbit.web.dao.GuestDao;
import com.hanbit.web.service.GuestService;
import com.hanbit.web.vo.GuestVo;
@Service
public class GuestServiceImpl implements GuestService{
	
	@Autowired
	private GuestDao dao;
	@Override
	public List<GuestVo> getAllGuests() {
		List<GuestVo> list = dao.getAllGuests();
		return list;
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

}
