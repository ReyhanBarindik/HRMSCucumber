package com.hrms.utils;

public class Constants {

	// whole the value and we do not want to change

	

	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+ "\\src\\test\\resources\\configs\\configuration.properties";

	public static final String TEST_DATA_FILEPATH =System.getProperty("user.dir")+ "\\src\\test\\resources\\testdata\\Book1.xlsx";
	
	public static final int IMPLICIT_WAIT_TIME = 15;

	public static final int EXPLICIT_WAIT_TIME = 30;
	
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"\\target\\html-report\\HRMS.html";
	
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"\\screenshots\\";
}
