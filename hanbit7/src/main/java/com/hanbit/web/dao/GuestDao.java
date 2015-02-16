package com.hanbit.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hanbit.web.vo.GuestVo;


@Repository(value="guestMapper")
public interface GuestDao {
	public List<GuestVo> getGuestList();
	public GuestVo getGuest(int id);
	public void addGuest(GuestVo guest);
	public void updateGuest(GuestVo guest);
	public void deleteGuest(int guestNo);
} //class END








