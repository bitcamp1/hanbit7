package common;

import java.sql.*;
import java.util.Date;
import java.util.*;

public class DBSQL {  //일반자바 = POJO  상속X
	private  Connection CN; //DB서버연결및 id,pass 기억 ,  명령어생성
	private  Statement  ST; //정적인 컴파일 명령어
	private  PreparedStatement PST; //미리 컴파일 된 명령어
	private  ResultSet  RS;  //select결과데이타 기억,
	private  String sql;
	private  int Gsabun ;
	private  String Gname ;
	private  int  Gpay;
	private  int total ; //레코드전체갯수 
	
	public DBSQL( ){
		CN=DB.getConnection(); 
	} //생성자
	
	public void dbInsert( DBbean bean  ){ 
		try{                                           
			sql="insert into insa  values( ?, ? , sysdate, ?)" ;
			PST=CN.prepareStatement(sql);         //  
				PST.setInt(1,  bean.getSabun());    // num필드는 직접입력X,  
				PST.setString(2,  bean.getName()); //data1=>멤버필드 sabun => bean.getSabun( )기억 
				PST.setInt(3,  bean.getPay()); 
			PST.executeUpdate( );
			System.out.println("<a href=twolist>[list목록]</a>") ; //콘솔창
			System.out.println("저장성공 11:02 \n") ;
		}catch(Exception ex){ }
	} //dbInsert(1) end
	
	public ArrayList  dbSelect( ){ 
		ArrayList  AL = new ArrayList( ) ; 
		try{
			sql="select  * from insa order by  sabun" ;
			ST=CN.createStatement() ;
			RS=ST.executeQuery(sql);
			while(RS.next()==true){
				DBbean bean = new DBbean( );
					bean.setSabun( RS.getInt("sabun") );
					bean.setName( RS.getString("name") );
					bean.setNalja( RS.getDate("nalja") );
					bean.setPay( RS.getInt("pay") ); 
				AL.add( bean);
			} //while end
		}catch(Exception ex){ }
		return AL;
	} //dbSelect(X) end 
	
	public  DBbean  dbDetail(String data){ //DetailAction.java문서에서 호출
		DBbean  bean = new  DBbean( ); 
		try{
			sql="select  *  from  insa where sabun=" +data; 
			ST=CN.createStatement();
			RS=ST.executeQuery(sql) ;
			if(RS.next()==true){
				int data1= RS.getInt("sabun");
				bean.setSabun( data1 );
				bean.setName( RS.getString("name") ); //<%= RS.getString("name") %>
				bean.setNalja( RS.getDate("nalja") );
				bean.setPay( RS.getInt("pay") ); 
			}
		}catch(Exception ex){ }
		return  bean; 
	} //dbDetail(1) end 
	
	
	public void dbDelete(String data){
		try{
			sql="delete from insa where sabun=" +data ;
			ST=CN.createStatement();
			ST.executeUpdate(sql) ;
			System.out.println("dbDelete(1) 삭제성공 ") ;
		}catch(Exception ex){ System.out.println("실패 : " + ex.toString() ); }
	} //dbDelete(1) end

	public void  dbEdit(DBbean bean){
		try{
			sql="update insa set name=?, nalja=sysdate, pay=? where sabun=? " ;
			PST=CN.prepareStatement(sql);
				PST.setString(1, bean.getName() );
				PST.setInt(2, bean.getPay());
				PST.setInt(3, bean.getSabun());
			PST.executeUpdate() ; 
		}catch(Exception ex){ }
	}//end
} //class DB END













