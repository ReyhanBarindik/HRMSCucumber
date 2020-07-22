package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Homework_2 {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	
	@Test
	public void getMetaData () throws SQLException {
		
	  Connection c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);	
		
	  DatabaseMetaData dbData = c.getMetaData();
	  
	  String dbName = dbData.getDatabaseProductName();
	  System.out.println(dbName);
	  
	  String dbVersion = dbData.getDatabaseProductVersion();
	  System.out.println(dbVersion);
	  
	  
	  Statement s = c.createStatement();
		
	  ResultSet rset = s.executeQuery("select * from ohrm_language");
	  
	  ResultSetMetaData mData  = rset.getMetaData();
	  
	  String tableName = mData.getTableName(2);
	  
	  int colNum = mData.getColumnCount();
	  
	  System.out.println("Table :: "+tableName+" has "+colNum+" columns");
	  
	  
	}
	
	
	
}
