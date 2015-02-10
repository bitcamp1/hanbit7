package common;

import java.sql.*;
import java.util.Date;

public class DBbean {  // .jsp/.java    .java/.java
	private int sabun;
	private  String name;
	private  java.util.Date  nalja;
	private  int pay ;   //¿À.¹ö => source => Generate  Getter and Setter
	
	public int getSabun() { 	return sabun; }
	public void setSabun(int sabun) {	this.sabun = sabun;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public java.util.Date getNalja() {		return nalja;	}
	public void setNalja(java.util.Date nalja) {		this.nalja = nalja;	}
	public int getPay() {		return pay;	}
	public void setPay(int pay) {		this.pay = pay;	}
} //class DB END
