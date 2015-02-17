package com.hanbit.web.util;

public class PagingUtil {
	
	public static int getStart(int pageNo, int PAGESIZE) {
		return (pageNo-1)*PAGESIZE+1;
	}
	public static int getEnd(int pageNo, int PAGESIZE) {
		return pageNo*PAGESIZE;
	}
	
	
}
