package com.hanbit.web.vo;

import java.io.Serializable;
import java.util.Date;

public class ItemVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int itemNo;
	private String itemName;
	private int price;
	private String pdDate;
	private String dsc;
	private String repImg;
	private String bigImg;
	private String cateName;
	private Date regDate;
	
	public int getItemNo() {
		return itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public int getPrice() {
		return price;
	}
	public String getPdDate() {
		return pdDate;
	}
	public String getDsc() {
		return dsc;
	}
	public String getRepImg() {
		return repImg;
	}
	public String getBigImg() {
		return bigImg;
	}
	public String getCateName() {
		return cateName;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPdDate(String pdDate) {
		this.pdDate = pdDate;
	}
	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
	public void setRepImg(String repImg) {
		this.repImg = repImg;
	}
	public void setBigImg(String bigImg) {
		this.bigImg = bigImg;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
