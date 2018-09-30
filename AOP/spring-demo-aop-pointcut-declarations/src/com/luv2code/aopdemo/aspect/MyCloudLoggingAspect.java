package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyCloudLoggingAspect {
	@Pointcut("com.luv2code.aopdemo.aspect.MyDemoLoggingAspect.forDaoPackage() && !(com.luv2code.aopdemo.aspect.MyDemoLoggingAspect.getter() || com.luv2code.aopdemo.aspect.MyDemoLoggingAspect.setter())")
	private void allButGetterSetter() {}
	
	@Before("allButGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("Before add account" + getClass());
	}
	
	@Before("com.luv2code.aopdemo.aspect.MyDemoLoggingAspect.forDaoPackage()")
	public void apiAnalytics() {
		System.out.println("Api analytics" + getClass());
	}
}
