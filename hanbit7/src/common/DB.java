package common;

import  java.sql.*;
public class DB {
	public static Connection  getConnection( ) {
		Connection CN = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle드라이브로드
			String url="jdbc:oracle:thin:@127.0.0.1:15212:XE" ;
			CN=DriverManager.getConnection(url, "system","oracle") ;
			System.out.println("DB연결성공!!!! ") ; 
		}catch(Exception ex) { System.out.println("실패: " + ex  );  }
		return CN;
	} //end
} //class END
