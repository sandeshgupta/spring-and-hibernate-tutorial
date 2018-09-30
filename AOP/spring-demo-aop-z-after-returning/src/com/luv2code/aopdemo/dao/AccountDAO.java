package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(String id) {
		System.out.println("Performing Add account" + getClass());
	}
	
	public void setAccount() {
		System.out.println("Performing set account" + getClass());
	}
	
	public void doWork() {
		System.out.println("Performing Work" + getClass());
	}
	
	public List<Account> findAccounts(){
		List<Account> accs = new ArrayList<>();
		
		Account ac1 = new Account("dfn", "plat");
		Account ac2 = new Account("doe", "plat");
		Account ac3 = new Account("jow", "gold");
		
		accs.add(ac1);
		accs.add(ac2);
		accs.add(ac3);
		
		return accs;
	}
}
