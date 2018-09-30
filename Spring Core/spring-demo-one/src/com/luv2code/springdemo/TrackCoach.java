package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	private String team;
	private String email;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter");
		this.fortuneService = fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter: team");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside setter: email");
		this.email = email;
	}

	public TrackCoach() {
		System.out.println("Inside cons");
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5km";
	}

	@Override
	public String getFortune() {
		return fortuneService.returnFortune();
	}

}
