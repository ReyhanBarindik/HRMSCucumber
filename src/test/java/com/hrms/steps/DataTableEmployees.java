package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableEmployees extends CommonMethods {

	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmp();
	}

	@When("user enter employees {string}, {string} and {string}")
	public void user_enter_employees_and(String string, String string2, String string3) {
		sendText(addEmp.empFirstName, string);
		sendText(addEmp.empMiddleName, string2);
		sendText(addEmp.empLastName, string3);
	}

	@Then("{string}, {string} and {string} is added successfully")
	public void and_is_added_successfully(String string, String string2, String string3) {
		System.out.println("I added the employee !!!!!!!!!!!!!!!!!!!!!!!");
		wait(2);
	}

	@When("user enters employee details and click on save then employee is added")
	public void user_enters_employee_details_and_click_on_save_then_employee_is_added(
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> addEmployeeList = dataTable.asMaps(); // get me the data as maps
                                                              
		for (Map<String, String> map : addEmployeeList) {
			// System.out.println(map.get("FistName")); //--> it gives us : all values of
			// FirstName

			sendText(addEmp.empFirstName, map.get("FirstName"));
			sendText(addEmp.empMiddleName, map.get("MiddleName"));  
			sendText(addEmp.empLastName, map.get("LastName"));

			waitAndClick(addEmp.saveEmp);

			String expected = map.get("FirstName") + " " + map.get("MiddleName") + " " + map.get("LastName");
			String actual = addEmp.addedEmployee.getText();
			Assert.assertEquals("Employee did not add successfully", expected, actual);

			waitAndClick(dashboard.addEmp); // after 1 employee save you should click again to add Employee
		}

	}
    @Then ("employee is added")
	public void employee_is_added() {
		System.out.println("-------Employee is added using datatable");
	}
	
	
	
	
	
	
}
