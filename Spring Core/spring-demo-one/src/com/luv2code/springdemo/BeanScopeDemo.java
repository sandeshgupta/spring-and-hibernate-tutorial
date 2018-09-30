package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScopes-applicationContext.xml");

		Coach coach = ctx.getBean("Basketball", Coach.class);

		System.out.println(coach);

		Coach coach2 = ctx.getBean("Basketball", Coach.class);

		System.out.println(coach2);

		ctx.close();
	}
}
