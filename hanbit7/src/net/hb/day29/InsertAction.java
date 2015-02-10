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

import com.hanbit.dto.DBbean;
import com.opensymphony.xwork2.ActionSupport;

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




