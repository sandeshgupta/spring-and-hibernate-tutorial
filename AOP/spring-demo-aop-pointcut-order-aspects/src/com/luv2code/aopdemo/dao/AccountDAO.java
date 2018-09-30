package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println("Performing Add account" + getClass());
	}
	
	public void setAccount() {
		System.out.println("Performing set account" + getClass());
	}
	
	public void doWork() {
		System.out.println("Performing Work" + getClass());
	}
}
