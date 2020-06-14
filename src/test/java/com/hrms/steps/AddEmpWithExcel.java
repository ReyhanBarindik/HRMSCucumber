package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmpWithExcel extends CommonMethods {

	@Given("I am logged with valid admin credentials")
	public void i_am_logged_with_valid_admin_credentials() {
	    sendText(login.username, "Admin");
	    sendText(login.password, "Hum@nhrm123");
	    waitAndClick(login.loginBtn);
	}
	
	@When("I navigated to add employee page")
	public void i_navigated_to_add_employee_page() {
		dashboard.navigateToAddEmp();
	}

	@Then("I enter employee information from excel file and save employee successfully")
	public void i_enter_employee_information_from_excel_file_and_save_employee_successfully() {
		
		
		
		List<Map<String, String>> dataSet = ExcelUtility.excelIntoListOfMaps(Constants.TEST_DATA_FILEPATH, "addEmp");  //Diffrences asMaps 
		                                                                                                      //only use Constants
		for (Map<String, String>  data : dataSet) {
			
			wait(3);
			waitAndClick(addEmp.createLoginDetails);
			
			sendText(addEmp.empFirstName, data.get("FirstName"));
			sendText(addEmp.empMiddleName, data.get("MiddleName"));
			sendText(addEmp.empLastName, data.get("LastName"));
			
			String expectedId= addEmp.employeeId.getAttribute("value"); 
			
			sendText(addEmp.empUsername, data.get("username"));
			sendText(addEmp.empPassword, data.get("password"));
			sendText(addEmp.empRePassword, data.get("password"));
			
			waitAndClick(addEmp.saveEmp);
			
			String actualId =addEmp.employeeId.getAttribute("value");
			
			Assert.assertEquals("Test Case failed.", expectedId, actualId);
			
			dashboard.navigateToAddEmp();
			
			wait(2);
		}
		
		System.out.println("Employee is added successfully.");
		
	}

}
