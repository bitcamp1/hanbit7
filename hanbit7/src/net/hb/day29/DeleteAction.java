package net.hb.day29;

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

public class DeleteAction  extends  ActionSupport {
	private  int sabun ;	
	public int getSabun() { return sabun; 	}
	public void setSabun(int sabun) {	 this.sabun = sabun; }

	public String execute() throws Exception {
		try{
			System.out.println("\nDeleteAction.java");
			Dao.dbDelete(sabun) ; 
		}catch(Exception ex) {   }
		return  SUCCESS;
	} //end
} //class END



