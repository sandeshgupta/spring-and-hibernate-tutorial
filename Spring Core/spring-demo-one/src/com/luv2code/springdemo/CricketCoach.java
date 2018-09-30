package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl for 5 overs";
	}

	@Override
	public String getFortune() {
		return fortuneService.returnFortune();
	}

}
