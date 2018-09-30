package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService thefortuneService;
	
	@Value("${email}")
	private String email;
	
	public SwimCoach(FortuneService fortuneService) {
		this.thefortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim for 1 hr";
	}

	@Override
	public String getFortune() {
		return thefortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
