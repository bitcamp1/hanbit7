package com.hanbit.web.vo;

import java.io.Serializable;
import java.util.Date;

public class ItemVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int itemNO;
	private String itemName;
	private int price;
	private String pdDate;
	private int salNO ;
	private int capa;
	private int alcol;
	private String desc;
	private int imgNO;
	private String pdOrigin;
	public int getItemNO() {
		return itemNO;
	}
	public String getItemName() {
		return itemName;
	}
	public int getPrice() {
		return price;
	}
	int getSalNO() {
		return salNO;
	}
	public int getCapa() {
		return capa;
	}
	public int getAlcol() {
		return alcol;
	}
	public String getDesc() {
		return desc;
	}
	public int getImgNO() {
		return imgNO;
	}
	public String getPdOrigin() {
		return pdOrigin;
	}
	public void setItemNO(int itemNO) {
		this.itemNO = itemNO;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSalNO(int salNO) {
		this.salNO = salNO;
	}
	public void setCapa(int capa) {
		this.capa = capa;
	}
	public void setAlcol(int alcol) {
		this.alcol = alcol;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setImgNO(int imgNO) {
		this.imgNO = imgNO;
	}
	public void setPdOrigin(String pdOrigin) {
		this.pdOrigin = pdOrigin;
	}
	public String getPdDate() {
		return pdDate;
	}
	public void setPdDate(String pdDate) {
		this.pdDate = pdDate;
	}
	
	
}
