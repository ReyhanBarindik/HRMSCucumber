package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeSearchSteps extends CommonMethods {
	@Given("user is navigeted to HRMS")
	public void user_is_navigeted_to_HRMS() {
		setUp();
	}

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		waitAndClick(login.loginBtn);
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		dashboard.navigateToEmployeeListPage();
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(viewEmp.empID, "10079");
	}

	@When("click on serch button")
	public void click_on_serch_button() {
        waitAndClick(viewEmp.searchBtn);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
        boolean expectedId=viewEmp.empID.isDisplayed();
        boolean actualId=viewEmp.afterSearchEmpId.isDisplayed();
        assertEquals(expectedId, actualId);
        tearDown();
	}

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
        sendText(viewEmp.empName,"Bishnu1");
	}
}
