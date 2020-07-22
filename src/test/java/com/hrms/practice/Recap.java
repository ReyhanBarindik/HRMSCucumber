package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap {

	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	String dbUsername = "syntax_hrm";

	String dbPassword = "syntaxhrm123";

	@Test
	public void gettingConnected() throws SQLException {

		Connection c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		DatabaseMetaData dbMetaData = c.getMetaData(); // it gives me info about database

		String dbName = dbMetaData.getDatabaseProductName();
		System.out.println(dbName);

		Statement s = c.createStatement();
		ResultSet rset = s.executeQuery("select * from ohrm_skill"); // id and name

		ResultSetMetaData rsetMetaData = rset.getMetaData();

		int cols = rsetMetaData.getColumnCount();
		System.out.println(cols);

		String colName;
		for (int i=1; i<=cols; i++) {
			colName= rsetMetaData.getColumnName(i);
			System.out.println("Column name = "+colName);
		}
		
		String id;
		String skill;

		while (rset.next()) {
			id = rset.getObject("id").toString();
			skill = rset.getObject("name").toString();
			System.out.println(id + " = " + skill);
		}

		rset.close();
		s.close();
		c.close();

	}

}
