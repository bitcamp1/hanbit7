package common;

import  java.sql.*;
public class DB {
	public static Connection  getConnection( ) {
		Connection CN = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle����̺�ε�
			String url="jdbc:oracle:thin:@127.0.0.1:15212:XE" ;
			CN=DriverManager.getConnection(url, "system","oracle") ;
			System.out.println("DB���Ἲ��!!!! ") ; 
		}catch(Exception ex) { System.out.println("����: " + ex  );  }
		return CN;
	} //end
} //class END
