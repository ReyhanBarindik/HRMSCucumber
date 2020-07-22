package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JdbcDemo {

	// instance variables
	String dbUsername = "syntax_hrm";
	
	String dbPassword = "syntaxhrm123";
	
	// Url should be unique for each database // jdbc : type driver : host : port/ name of the database 
	
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";    
	
	
	@Test   // jUnit annotation not TestNg
	public void getDataFromDatabase () throws SQLException {
		
		Connection connection=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);   // to build Connection --> First step 
		// it possible sql acception actual
		
		System.out.println("Conncetion is created.");
		
		// Second step : Build the statement Object --> will send Query to DataBase
		
		Statement st=connection.createStatement();
		
		
		//After execute Query we will send it to DB then we will get ResultSet
		
		ResultSet rset = st.executeQuery("select * from ohrm_nationality");   // lets retrieve all nationality 
		// we got object of resultset 
		// ResultSet returns entry set 
		// which query you send it returns thet Query data 
		
		rset.next();  // this method returns you next row (like Iterator) // 0 --> 1 
		String firstRowData =rset.getString("name"); // it return you first data that String type one and you can get index of it or name of it
		System.out.println(firstRowData);
		
		rset.next();
		String secondRowData=rset.getObject("name").toString(); // If your rows are different like first one is Stirng second one is int. 
		                                                        // You can use this method
		System.out.println(secondRowData);
		
		String data;
		while (rset.next()) {
			
			data=rset.getObject("name").toString();
			System.out.println(data);
			
		}
		// Always close all connection resources
		
		rset.close();
		st.close();
		connection.close();
		
		
		
		
	}
	
	
	
	
	
}
