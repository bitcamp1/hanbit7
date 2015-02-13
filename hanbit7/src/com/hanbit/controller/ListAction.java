package com.hanbit.controller;

import java.util.ArrayList;

import com.hanbit.dao.GuestDao;
import com.hanbit.dto.GuestDto;
import com.opensymphony.xwork2.ActionSupport;

public class  ListAction  extends  ActionSupport {
	private  ArrayList<GuestDto>  list ; 
	public ArrayList<GuestDto> getList() { 	return list;	}
	public void setList(ArrayList<GuestDto> list) {		this.list = list;	}
	
	public String execute( ) throws Exception {
		System.out.println("\nListAction.java 3:08") ;
	    list=GuestDao.dbSelect( ); 
		return  SUCCESS;
	} //end

} //class END





