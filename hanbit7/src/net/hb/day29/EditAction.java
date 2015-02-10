package net.hb.day29;

import com.hanbit.dto.DBbean;
import com.opensymphony.xwork2.ActionSupport;

import dao.Dao;

public class EditAction  extends  ActionSupport {
	private  DBbean bean; //twoEdit.jsp����  <input type=text  name="bean.sabun">
	public   DBbean getBean() { 		return bean;	}
	public   void setBean(DBbean bean) {		this.bean = bean;	}

	public String execute() throws Exception {
		try{
			System.out.println("\nEditAction.java ");
			//Dao.dbInsert(bean);
			Dao.dbEdit(bean) ; // UML=> NationalRose, StarUML 
		}catch(Exception ex) {  System.out.println( "EditAction.java ����:" + ex.toString()) ; }
		return  SUCCESS;
	} //end
} //class END






