package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;

public class InvalidCredentialsSteps extends CommonMethods {
	@Given("user navigated to HRMS")
	public void user_navigated_to_HRMS() {
	   setUp(); 
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
	   sendText(login.username, "Admin");
	   sendText(login.password, "Hhhhh");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   waitAndClick(login.loginBtn);
	}

	@Then("user see {string} error message")
	public void user_see_error_message(String string) {
		
		String actualErrMes= login.errorMessage.getText();
		Assert.assertEquals("Test Case failed.", string, actualErrMes);
	}

	@When("user enters empty username and valid password")
	public void user_enters_empty_username_and_valid_password() {
	    sendText(login.username, "");
	    sendText(login.password, "Hum@nhrm123");
	}
}
