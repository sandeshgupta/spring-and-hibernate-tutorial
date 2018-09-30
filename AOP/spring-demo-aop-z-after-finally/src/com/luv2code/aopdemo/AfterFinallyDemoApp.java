package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO account = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> accs =  null;
		
		try{
			boolean generateException = true;
			accs = account.findAccounts(generateException);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\n\nMain : after ret \n" + accs);
		
		context.close();
	}
}	
