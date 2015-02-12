package com.hanbit.controller;

import com.opensymphony.xwork2.ActionSupport;

public class IndexController extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@Override
	public String execute() throws Exception {
		System.out.println("진입");
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
