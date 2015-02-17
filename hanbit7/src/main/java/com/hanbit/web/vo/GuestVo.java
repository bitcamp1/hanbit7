package com.hanbit.web.vo;

import java.util.Date;

public class GuestVo {
	private int guestNo;
	private String name;
	private String title;
	private int readHit;
	private Date nalja;
	public int getGuestNo() {
		return guestNo;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public int getReadHit() {
		return readHit;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setGuestNo(int guestNo) {
		this.guestNo = guestNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setReadHit(int readHit) {
		this.readHit = readHit;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	
	
	
}
