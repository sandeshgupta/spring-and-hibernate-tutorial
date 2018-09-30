package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAppDemo {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = ctx.getBean("Tennis", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		Coach coach2 = ctx.getBean("Cricket", Coach.class);
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getFortune());
		
		ctx.close();
	}
}
