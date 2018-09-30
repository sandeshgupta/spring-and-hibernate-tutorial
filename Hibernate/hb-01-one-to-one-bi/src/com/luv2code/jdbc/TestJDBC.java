package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		final String jdbcURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		final String user = "hbstudent";
		final String pass = "hbstudent";
		
		try {
			Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);
			
			System.out.println("Connection successful!");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
