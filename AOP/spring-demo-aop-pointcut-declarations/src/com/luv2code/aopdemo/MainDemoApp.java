package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO account = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO memeber = context.getBean("membershipDAO", MembershipDAO.class);
		
		account.addAccount();
		account.doWork();
		account.setAccount();
		memeber.addAccount();
		
		context.close();
	}
}	
