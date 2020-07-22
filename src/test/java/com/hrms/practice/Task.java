package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

public class Task {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";    
	
	@Test 
	public void getDataFromDatabase () throws SQLException {
		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("Connection is created.");
		
		Statement st = connection.createStatement();
		
		ResultSet rset = st.executeQuery("select * from ohrm_job_title");
		
		ArrayList <String> arr = new ArrayList<>();
		while (rset.next()) {
			arr.add(rset.getString("job_title"));
		}
		
		for (String a : arr) {
			System.out.println(a);
		}
		
		rset.close();
		st.close();
		connection.close();
	}
	
	
	
	
	
}
