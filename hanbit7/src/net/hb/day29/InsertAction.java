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

import com.opensymphony.xwork2.ActionSupport;
import common.DBbean;
import dao.Dao;

//class  ActionSupport  implements  Action{  public static  String SUCCSS="success" ;}
public class InsertAction  extends  ActionSupport {
	private  DBbean  bean ; 
	public DBbean getBean() { return bean;	}
	public void setBean(DBbean bean) {	this.bean = bean;	}

	public String execute() throws Exception {
      Dao.dbInsert(bean) ;
	  return SUCCESS ; 
	} //end
} //class END

////////////////////////////////////////////////////////////////////////////////////////////




