package com.hanbit.web.vo;

import java.io.Serializable;

public class StockVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int itemNO;
	private int put;
	private int out;
	private int base;
	private String date;
	public int getItemNO() {
		return itemNO;
	}
	public int getPut() {
		return put;
	}
	public int getOut() {
		return out;
	}
	public int getBase() {
		return base;
	}
	public String getDate() {
		return date;
	}
	public void setItemNO(int itemNO) {
		this.itemNO = itemNO;
	}
	public void setPut(int put) {
		this.put = put;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
