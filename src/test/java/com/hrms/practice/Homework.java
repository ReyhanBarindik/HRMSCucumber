package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Homework {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getMetaData() throws SQLException {

		Connection c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		Statement s = c.createStatement();

		ResultSet rset = s.executeQuery("select * from hs_hr_employees where nation_code = 182;");

		ResultSetMetaData resultData = rset.getMetaData();

		String colTypeName = resultData.getColumnTypeName(5).toString();

		System.out.println(colTypeName);

		String tableName = resultData.getTableName(5).toString();

		System.out.println(tableName);

		List<String> dataList = new ArrayList<>();

		while (rset.next()) {
			dataList.add(rset.getObject("emp_firstname").toString());
		}

		for (Object dl : dataList) {
			System.out.println(dl);
		}

		rset.close();
		s.close();
		c.close();

	}

}
