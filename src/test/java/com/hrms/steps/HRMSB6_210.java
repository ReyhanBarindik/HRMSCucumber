package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSB6_210 extends CommonMethods {

	@Given("user logged in into HRMS")
	public void user_logged_in_into_HRMS() {
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
		waitAndClick(login.loginBtn);
	}

	@Given("user navigate to add employee page")
	public void user_navigate_to_add_employee_page() {
		dashboard.navigateToAddEmp();
	}

	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {  // pass to here paremeter as a String firstname and lastname  
		addEmp.addEmployeeInHMR("Munisecim","Erennnn");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		waitAndClick(addEmp.saveEmp);
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
	    Assert.assertTrue("Employee is not added.Test Case Failed.", viewEmp.newEmp.isDisplayed());
	    takeScreenshot("HRMSB6_210");
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
	    addEmp.employeeId.sendKeys(Keys.DELETE);
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		waitAndClick (addEmp.createLoginDetails);
	}

	@When("user enters  login credentials")
	public void user_enters_login_credentials() {
		addEmp.createLoginDetails("MuniseEr","rtI260876##@@");
	}
}
