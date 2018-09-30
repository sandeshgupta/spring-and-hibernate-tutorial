package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String returnFortune() {
		String[] fortunes= {"Happy", "Sad", "Angry"};
		
		return fortunes[(int)(Math.random()*10%3)];
	}

}
