package com.hanbit.dao;



public class GuestDao {
	private static GuestDao instance;
	public static GuestDao getInstance(){
		if(instance == null){
			instance = new GuestDao();
		}
		return instance;
	}
	
	
}
