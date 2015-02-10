package com.hanbit.dto;

import java.util.Date;

public class GuestDto {
	private int sabun;
	private String name;
	private String title;
	private int pay;
	private Date nalja;
	public int getSabun() {
		return sabun;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public int getPay() {
		return pay;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	
	
}
