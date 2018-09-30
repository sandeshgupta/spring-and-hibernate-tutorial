package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void allButGetterSetter() {}
	
	@Before("allButGetterSetter()")
	public void beforeAddAccount(JoinPoint joinPoint) {
		
		MethodSignature sig = (MethodSignature) joinPoint.getSignature();
		
		System.out.println("Method sig" + sig);
		
		for(Object arg: joinPoint.getArgs())
			System.out.println(arg);
	}
	
	@Before("forDaoPackage()")
	public void apiAnalytics() {
		System.out.println("Api analytics" + getClass());
	}
}
