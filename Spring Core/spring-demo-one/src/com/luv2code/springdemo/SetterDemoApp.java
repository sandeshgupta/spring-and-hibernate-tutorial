package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TrackCoach coach = ctx.getBean("Track", TrackCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmail());
		
		ctx.close();

	}

}
