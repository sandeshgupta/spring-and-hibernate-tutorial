package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		String game = "Cricket";
		Coach coach = ctx.getBean(game, Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		game = "Basketball";
		coach = ctx.getBean(game, Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		game = "Track";
		coach = ctx.getBean(game, Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		ctx.close();
		
	}

}
