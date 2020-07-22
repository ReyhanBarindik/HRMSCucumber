package com.hrms.utils;

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

public class DataBaseUtils {

	public static Connection conn;

	public static Statement st;

	public static ResultSet rset;

	public static List<Map<String, String>> listData;

	public static void createConnection() {
		/**
		 * Method will create a conncetion to DB
		 */
		try {
			conn = DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),
					ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Retrieve data and stored inside List<Map>
	 * 
	 * @return List<Map<String, String>
	 *
	 */

	public static List<Map<String, String>> storedDataFromDB(String sqlQuery) {

		try {
			st = conn.createStatement();
			rset = st.executeQuery(sqlQuery);
			ResultSetMetaData rsetMetaData = rset.getMetaData();
			listData = new ArrayList<>();

			while (rset.next()) {
				Map<String, String> rowMap = new LinkedHashMap<>();

				for (int i = 1; i < rsetMetaData.getColumnCount(); i++) {

					rowMap.put(rsetMetaData.getColumnName(i), rset.getObject(i).toString()); // before put elements in
																								// your map then add
																								// them in List

				}
				listData.add(rowMap);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listData;
	}

	public static void closeResources() {

		try {

			if (rset != null) {
				rset.close();
			}

			if (st != null) {
				st.close();
			}

			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
