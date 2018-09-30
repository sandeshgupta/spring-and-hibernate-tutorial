package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = ctx.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(coach.getEmail());
		
		ctx.close();

	}

}
