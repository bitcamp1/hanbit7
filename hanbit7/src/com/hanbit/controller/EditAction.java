package com.hanbit.controller;

import com.hanbit.dao.GuestDao;
import com.hanbit.dto.GuestDto;
import com.opensymphony.xwork2.ActionSupport;

public class EditAction  extends  ActionSupport {
	private  GuestDto bean; //twoEdit.jsp����  <input type=text  name="bean.sabun">
	public   GuestDto getBean() { 		return bean;	}
	public   void setBean(GuestDto bean) {		this.bean = bean;	}

	public String execute() throws Exception {
		try{
			System.out.println("\nEditAction.java ");
			//Dao.dbInsert(bean);
			GuestDao.dbEdit(bean) ; // UML=> NationalRose, StarUML 
		}catch(Exception ex) {  System.out.println( "EditAction.java ����:" + ex.toString()) ; }
		return  SUCCESS;
	} //end
} //class END






