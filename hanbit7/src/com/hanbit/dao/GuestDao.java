package com.hanbit.dao;

import java.io.Reader;
import java.util.ArrayList;

import com.hanbit.dto.GuestDto;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class GuestDao {
	  private  static  SqlMapClient  sqlMap  ;  //sqlMap�ʵ�� Query.xml���� id���� 
	  
    static {
    	try{
	      String  path="./SqlMapConfig.xml";  //Query.xml�������� X
	      Reader reader=Resources.getResourceAsReader(path);  
	      sqlMap=SqlMapClientBuilder.buildSqlMapClient(reader);
    	}catch(Exception ex){  }
    }//static End
    
 	public static void dbInsert(GuestDto guest){
 		try{
 			System.out.println("\ndbInsert(DBbean)") ; 
 			sqlMap.insert("add", guest);  //Query.xml����  <insert id="add">
 		}catch(Exception ex) {  }
 	} //end
	
 	
 	public static ArrayList<GuestDto>  dbSelect( ){ //ListAction.java => execute( )�޼ҵ忡��ȣ��
 		System.out.println("\ndbSelect() 9:40 ") ; 
 		ArrayList<GuestDto>  alist = null;
 		try{
 			alist=(ArrayList<GuestDto>)sqlMap.queryForList("selectAll") ; //Query.xml <select id="selectAll">
 		}catch(Exception ex) {  }
 		return alist; 
 	} //end
 	
 	public static  GuestDto  dbDetail(int data ){
 		System.out.println("\ndbDetail(int) 11:45 ") ; 
 		GuestDto  bean = null;
 		try{
 			bean=(GuestDto)sqlMap.queryForObject("detail", data ); 
 		}catch(Exception ex) {  }
 		return bean; 
 	} //end


 	public static void dbEdit(GuestDto guest) {
		System.out.println("\ndbEdit(DBbean) 4:13 ") ; 
		try{
			sqlMap.update("edit",guest) ;
		}catch(Exception ex){ }
	} //end

 	public static void dbDelete(int sabun){
 		System.out.println("\ndbDelete(int) 5:00 ") ; 
		try{
			sqlMap.delete("delete",  sabun) ; //Query.xml <delete id="delete"
		}catch(Exception ex){ }
 	} //end
 	
} //class END








