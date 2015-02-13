package com.hanbit.controller;

import com.hanbit.dao.GuestDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction  extends  ActionSupport {
	private  int sabun ;	
	public int getSabun() { return sabun; 	}
	public void setSabun(int sabun) {	 this.sabun = sabun; }

	public String execute() throws Exception {
		try{
			System.out.println("\nDeleteAction.java");
			GuestDao.dbDelete(sabun) ; 
		}catch(Exception ex) {   }
		return  SUCCESS;
	} //end
} //class END



