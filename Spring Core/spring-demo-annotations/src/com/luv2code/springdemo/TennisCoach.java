package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Tennis")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("sadFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
