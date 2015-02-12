package com.hanbit.common;

import com.hanbit.guest.GuestDto;
import com.opensymphony.xwork2.ActionSupport;

public class IntroAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GuestDto guest;
	
	@Override
	public String execute() throws Exception {
		System.out.println("진입");
		return SUCCESS;
	}

	public GuestDto getGuest() {
		return guest;
	}

	public void setGuest(GuestDto guest) {
		this.guest = guest;
	}
	
}
