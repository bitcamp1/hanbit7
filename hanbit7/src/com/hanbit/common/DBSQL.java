package com.hanbit.common;

import java.sql.*;
import java.util.Date;
import java.util.*;

import com.hanbit.dto.DBbean;

public class DBSQL {  //�Ϲ��ڹ� = POJO  ���X
	private  Connection CN; //DB��������� id,pass ��� ,  ��ɾ����
	private  Statement  ST; //������ ������ ��ɾ�
	private  PreparedStatement PST; //�̸� ������ �� ��ɾ�
	private  ResultSet  RS;  //select�������Ÿ ���,
	private  String sql;
	private  int Gsabun ;
	private  String Gname ;
	private  int  Gpay;
	private  int total ; //���ڵ���ü���� 
	
	public DBSQL( ){
		CN=DB.getConnection(); 
	} //������
	
	public void dbInsert( DBbean bean  ){ 
		try{                                           
			sql="insert into insa  values( ?, ? , sysdate, ?)" ;
			PST=CN.prepareStatement(sql);         //  
				PST.setInt(1,  bean.getSabun());    // num�ʵ�� �����Է�X,  
				PST.setString(2,  bean.getName()); //data1=>����ʵ� sabun => bean.getSabun( )��� 
				PST.setInt(3,  bean.getPay()); 
			PST.executeUpdate( );
			System.out.println("<a href=twolist>[list���]</a>") ; //�ܼ�â
			System.out.println("���强�� 11:02 \n") ;
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
	
	public  DBbean  dbDetail(String data){ //DetailAction.java�������� ȣ��
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
			System.out.println("dbDelete(1) �������� ") ;
		}catch(Exception ex){ System.out.println("���� : " + ex.toString() ); }
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













