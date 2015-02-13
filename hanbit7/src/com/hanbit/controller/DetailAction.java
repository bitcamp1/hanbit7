package com.hanbit.controller;

import com.hanbit.dao.GuestDao;
import com.hanbit.dto.GuestDto;
import com.opensymphony.xwork2.ActionSupport;

public class DetailAction  extends  ActionSupport {
	private  int idx ;
	private  GuestDto bean;
	
	public int getIdx() {return idx;	}
	public void setIdx(int idx) {	this.idx = idx;	}
	public   GuestDto getBean() {return bean;	}
	public   void setBean(GuestDto bean) {	this.bean = bean;	}

	public String execute() throws Exception {
		try{
			System.out.println("\nDetailAction.java");
			bean=GuestDao.dbDetail(idx);
		}catch(Exception ex) {   }
		return  SUCCESS;
	} //end
} //class END



