package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	private FortuneService fortuneService;
	
	
	
	public BasketballCoach(FortuneService fortuneService) {
		System.out.println("Basketball : constructor");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Dribble for half an hour";
	}
	
	@Override
	public String getFortune() {
		return fortuneService.returnFortune();
	}
	
	public void init() {
		System.out.println("Basketball init");
	}
	
	public void destroy() {
		System.out.println("Basketball destroy");
	}
}
