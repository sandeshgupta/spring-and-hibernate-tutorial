package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {


	private String fortunes;
	
	public String getFortunes() {
		return fortunes;
	}

	@Autowired
	@Value("${fortunes}")
	public void setFortunes(String fortunes) {
		this.fortunes = fortunes;
	}

	@Override
	public String getFortune() {
		String[] arrFortune = fortunes.split(",");
		
		return arrFortune[(int)(Math.random()*10)%arrFortune.length];
		
	}

}
