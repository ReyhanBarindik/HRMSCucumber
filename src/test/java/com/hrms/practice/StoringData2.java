package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StoringData2 {

	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	String dbUsername = "syntax_hrm";

	String dbPassword = "syntaxhrm123";

	@Test
	public void getAndStoreDataEnhanced() throws SQLException {

		Connection c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement s = c.createStatement();
		ResultSet rset = s.executeQuery("select emp_firstname, emp_lastname from hs_hr_employees;");

		ResultSetMetaData rsetMetaData = rset.getMetaData();
		int cols = rsetMetaData.getColumnCount();

		List<Map<String, String>> listData = new ArrayList<>();

		Map<String, String> rowMap;

		while (rset.next()) {
			rowMap = new LinkedHashMap<>();

			for (int i = 1; i <= cols; i++) { // it starts with one
				rowMap.put(rsetMetaData.getColumnName(i), rset.getObject(i).toString());

				listData.add(rowMap);

			}

		}
		System.out.println(listData);

	}
}
