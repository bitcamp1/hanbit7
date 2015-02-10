/*package net.hb.day29;

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

public class InsertAction  extends  ActionSupport {
	private  DBbean bean; //two.jsp문서  <input type=text  name="bean.sabun">
	public   DBbean getBean() { 		return bean;	}
	public   void setBean(DBbean bean) {		this.bean = bean;	}

	public String execute() throws Exception {
		try{
			Dao.dbInsert(bean);
			System.out.println("\nexecute( )메소드끝 저장성공!!!!");
		}catch(Exception ex) {  System.out.println( "InsertAction.java 실패:" + ex.toString()) ; }
		return  SUCCESS;
	} //end
} //class END
*/

//첫번째 저장처리 - 저장은 안됨

package net.hb.day29;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

public class  ListAction  extends  ActionSupport {
	private  ArrayList<DBbean>  list ; 
	public ArrayList<DBbean> getList() { 	return list;	}
	public void setList(ArrayList<DBbean> list) {		this.list = list;	}
	
	public String execute( ) throws Exception {
		System.out.println("\nListAction.java 3:08") ;
	    list=Dao.dbSelect( ); //list필드가 twoList.jsp문서 <c:forEach items="${list}" >
		return  SUCCESS;
	} //end

} //class END

////////////////////////////////////////////////////////////////////////////////////////////




