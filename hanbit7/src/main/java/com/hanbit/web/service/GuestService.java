package com.hanbit.web.service;

import java.util.List;

import com.hanbit.web.vo.GuestVo;



public interface GuestService {
	public List<GuestVo> getAllGuests(int[] page);
	public GuestVo getGuestByID(int id);
	public void addGuest(GuestVo guest);
	public void updateGuest(GuestVo guest);
	public void removeGuest(int guestNo);
	public int getTotCount();

}
