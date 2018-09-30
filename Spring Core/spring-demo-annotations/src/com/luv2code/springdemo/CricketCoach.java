package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Cricket")
@Scope("singleton")
public class CricketCoach implements Coach {
	private FortuneService fortuneService;

	@Autowired
	public CricketCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl for 5 overs";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}
