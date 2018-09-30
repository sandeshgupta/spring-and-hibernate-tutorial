package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@Before("execution(* add*())")
	public void beforeAddAccount() {
		System.out.println("Before add account" + getClass());
	}
}
