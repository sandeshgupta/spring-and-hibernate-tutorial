package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeAppDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = ctx.getBean("Cricket", Coach.class);
		Coach coach2 = ctx.getBean("Cricket", Coach.class);
		
		System.out.println(coach +" "+coach2);

		ctx.close();
	}
}
