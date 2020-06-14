package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;

public class loginWithDifferentRoles extends CommonMethods {

	@When("user enters admin username and admin password")
	public void user_enters_admin_username_and_admin_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
	}

	@Then("user see Welcome Admin message")
	public void user_see_Welcome_Admin_message() {
		String expectedMessage="Welcome Admin";
		String actualMessage=dashboard.welcome.getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		takeScreenshot("WelcomeAdmin");
	}

	@When("user enters ESS username and ESS password")
	public void user_enters_ESS_username_and_ESS_password() {
		sendText(login.username, "Reyhane");
		sendText(login.password, "rtI260091@");
	}

	@Then("user see Welcome ESS message")
	public void user_see_Welcome_ESS_message() {
		String expectedMessage="Welcome Reyhane";
		String actualMessage=dashboard.welcome.getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		takeScreenshot("WelcomeReyhane");
	}

}
