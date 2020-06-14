package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class practice extends CommonMethods {

	@Given("I enter username {string}")
	public void i_enter_username(String string) {
	    sendText(login.username, string);
	}

	@Given("I enter password {string}")
	public void i_enter_password(String string) {
	    sendText(login.password, string);
	}

	@When("I click login button")
	public void i_click_login_button() {
	    waitAndClick(login.loginBtn);
	}

	@Then("I see {string}")
	public void i_see(String string) {
		
	    String actualErrorMsg = login.errorMessage.getText();
	    Assert.assertEquals("Test Case failed", string , actualErrorMsg );
	}
	
	@When("I enter invalid username and password and see error message")
	public void i_enter_invalid_username_and_password_and_see_error_message(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> errorMes= dataTable.asMaps();
	      for (Map<String, String> map: errorMes) {
	    	  sendText(login.username, map.get("UserName"));
	    	  sendText(login.password, map.get("Password"));
	    	  waitAndClick(login.loginBtn);
	    	  takeScreenshot("ErrorMessage");
	    	  String expectedMes = map.get("ErrorMessage");
	    	  String actualMes = login.errorMessage.getText();
	    	  Assert.assertEquals("Error message did Not match.Test Case failed", 
	    			  expectedMes, actualMes);
	    	  
	      }
	}
}
