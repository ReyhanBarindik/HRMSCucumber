package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;


public class login extends CommonMethods {
	
	@Then("I see Welcome {string} message")
	public void i_see_Welcome_message(String string) {
	   String expected = "Welcome "+string;
	   String actual = dashboard.welcome.getText();
	   Assert.assertEquals("Test Case is Failed", expected, actual);
	}

}
