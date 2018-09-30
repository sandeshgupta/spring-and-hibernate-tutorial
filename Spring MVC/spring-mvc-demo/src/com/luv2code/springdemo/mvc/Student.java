package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String language1;
	private String[] os;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("IND", "INDIA");
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}


	public String getLanguage1() {
		return language1;
	}


	public void setLanguage1(String language1) {
		this.language1 = language1;
	}


	public String[] getOs() {
		return os;
	}


	public void setOs(String[] os) {
		this.os = os;
	}
	
}
