package com.hrms.practice;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StoringDataFromDB {

	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	String dbUsername = "syntax_hrm";

	String dbPassword = "syntaxhrm123";

	@Test
	public void getAndStoreData() throws SQLException {

		Connection c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		Statement s = c.createStatement();
		ResultSet rset = s.executeQuery("select id, name, country_code from ohrm_location;");
		//ResultSet rset = s.executeQuery("select * from ohrm_location;");  //--> you can use it
		
		
		List<Map<String, String>> listData = new ArrayList<>(); // we will be storing data in list

		while (rset.next()) {

			Map<String, String> map = new LinkedHashMap<>();
			map.put("id", rset.getObject("id").toString());
			map.put("name", rset.getObject("name").toString());
			map.put("country_code", rset.getObject("country_code").toString());

			listData.add(map);

		}

		System.out.println(listData);
		
		
	}
}
