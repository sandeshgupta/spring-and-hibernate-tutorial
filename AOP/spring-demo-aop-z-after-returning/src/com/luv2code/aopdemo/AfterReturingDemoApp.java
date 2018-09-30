package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterReturingDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO account = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> accs =  account.findAccounts();
		
		System.out.println("\n\nMain : after ret \n" + accs);
		
		context.close();
	}
}	
