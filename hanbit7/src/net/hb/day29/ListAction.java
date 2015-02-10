/*package net.hb.day29;

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

public class InsertAction  extends  ActionSupport {
	private  DBbean bean; //two.jsp����  <input type=text  name="bean.sabun">
	public   DBbean getBean() { 		return bean;	}
	public   void setBean(DBbean bean) {		this.bean = bean;	}

	public String execute() throws Exception {
		try{
			Dao.dbInsert(bean);
			System.out.println("\nexecute( )�޼ҵ峡 ���强��!!!!");
		}catch(Exception ex) {  System.out.println( "InsertAction.java ����:" + ex.toString()) ; }
		return  SUCCESS;
	} //end
} //class END
*/

//ù��° ����ó�� - ������ �ȵ�

package net.hb.day29;

import java.util.ArrayList;

import com.hanbit.dto.DBbean;
import com.opensymphony.xwork2.ActionSupport;

import dao.Dao;

public class  ListAction  extends  ActionSupport {
	private  ArrayList<DBbean>  list ; 
	public ArrayList<DBbean> getList() { 	return list;	}
	public void setList(ArrayList<DBbean> list) {		this.list = list;	}
	
	public String execute( ) throws Exception {
		System.out.println("\nListAction.java 3:08") ;
	    list=Dao.dbSelect( ); //list�ʵ尡 twoList.jsp���� <c:forEach items="${list}" >
		return  SUCCESS;
	} //end

} //class END

////////////////////////////////////////////////////////////////////////////////////////////




