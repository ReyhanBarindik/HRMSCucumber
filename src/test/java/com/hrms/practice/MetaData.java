package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getMetaData() throws SQLException {

		Connection c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		DatabaseMetaData dbData = c.getMetaData(); // --> to get all info about this method inside

		String dbName = dbData.getDatabaseProductName();
		String dbVersion = dbData.getDatabaseProductVersion();

		System.out.println(dbName + " " + dbVersion);

		Statement s = c.createStatement();
		ResultSet rset = s.executeQuery("select * from hs_hr_employees where employee_id = 12031;");

		ResultSetMetaData resultData = rset.getMetaData();

		int cols = resultData.getColumnCount(); // Number of Cols

		System.out.println(cols);

		String colName = resultData.getColumnName(1);

		System.out.println(colName);

		for (int i = 1; i <= cols; i++) { // it is not index numbers so we say equals and less than cols
			String cName = resultData.getColumnName(i);
			System.out.println(cName);
		}

		rset.close();
		s.close();
		c.close();

	}

}
