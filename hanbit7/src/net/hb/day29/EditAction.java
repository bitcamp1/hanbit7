package net.hb.day29;

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

public class EditAction  extends  ActionSupport {
	private  DBbean bean; //twoEdit.jsp문서  <input type=text  name="bean.sabun">
	public   DBbean getBean() { 		return bean;	}
	public   void setBean(DBbean bean) {		this.bean = bean;	}

	public String execute() throws Exception {
		try{
			System.out.println("\nEditAction.java ");
			//Dao.dbInsert(bean);
			Dao.dbEdit(bean) ; // UML=> NationalRose, StarUML 
		}catch(Exception ex) {  System.out.println( "EditAction.java 실패:" + ex.toString()) ; }
		return  SUCCESS;
	} //end
} //class END






