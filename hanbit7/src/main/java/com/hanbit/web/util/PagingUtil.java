package com.hanbit.web.util;

public class PagingUtil {
	
	public static int getStart(int pageNo, int pageSize) {
		return (pageNo-1)*pageSize+1;
	}
	public static int getEnd(int pageNo, int pageSize) {
		return pageNo*pageSize;
	}
	
	
}
