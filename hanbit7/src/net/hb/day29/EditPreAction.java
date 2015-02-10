package net.hb.day29;

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

public class  EditPreAction  extends  ActionSupport {
	private  int idx ;
	private  DBbean bean;
	
	public int getIdx() {return idx;	}
	public void setIdx(int idx) {	this.idx = idx;	}
	public   DBbean getBean() {return bean;	}
	public   void setBean(DBbean bean) {	this.bean = bean;	}

	public String execute() throws Exception {
		try{
			System.out.println("\nEditPreAction.java 4-30-¼ö¿äÀÏ");
			bean=Dao.dbDetail(idx);
		}catch(Exception ex) {   }
		return  SUCCESS;
	} //end
} //class END



