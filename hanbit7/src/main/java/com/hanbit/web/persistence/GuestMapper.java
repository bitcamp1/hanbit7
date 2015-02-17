package com.hanbit.web.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanbit.web.vo.GuestVo;



public interface GuestMapper {
	public List<GuestVo> getAllGuests();
	public GuestVo getGuestByID(int id);
	public void addGuest(GuestVo guest);
	public void updateGuest(GuestVo guest);
	public void removeGuest(int guestNo);
} //class END








