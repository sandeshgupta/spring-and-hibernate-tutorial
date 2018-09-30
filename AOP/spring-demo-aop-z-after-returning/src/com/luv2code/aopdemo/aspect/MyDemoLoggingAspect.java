package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter() {
	}

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {
	}

	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void allButGetterSetter() {
	}

	@Before("allButGetterSetter()")
	public void beforeAddAccount(JoinPoint joinPoint) {

		MethodSignature sig = (MethodSignature) joinPoint.getSignature();

		System.out.println("Method sig" + sig);

		for (Object arg : joinPoint.getArgs())
			System.out.println(arg);
	}

	@Before("forDaoPackage()")
	public void apiAnalytics() {
		System.out.println("Api analytics" + getClass());
	}

	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.*.findAccounts(..))", returning = "result")
	public void afterReturningFindAcco(JoinPoint joinPoint, List<Account> result) {
		System.out.println("\n\nin aspect " + result);
	}
}
