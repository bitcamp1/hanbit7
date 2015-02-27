package com.hanbit.web.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
	@Before(value = "execution(public * com.hanbit.web.controller..*(..)")
	public void open(){
		
	}
	@After(value = "execution(public * com.hanbit.web.dao..*(..)")
	public void close(){
		
	}
}
