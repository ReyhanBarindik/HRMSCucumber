package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSB6_340 extends CommonMethods {

	@When("I enter employee first name and last name and click save button")
	public void i_enter_employee_first_name_and_last_name_and_click_save_button() {
		sendText(addEmp.empFirstName,"Nur");
		sendText(addEmp.empMiddleName, "Nalan");  
		sendText(addEmp.empLastName, "Idizz");

		waitAndClick(addEmp.saveEmp);
	}

	@When("I click edit button after employee added")
	public void i_click_edit_button_after_employee_added() {
		waitAndClick(pdetails.edit);
	}

	@Then("I enter employee personal details information and save employee successfully")
	public void i_enter_employee_personal_details_information_and_save_employee_successfully(io.cucumber.datatable.DataTable dataTable) {
	      
		List<Map<String, String>> details = dataTable.asMaps();
		
		for (Map<String, String> map : details) {
			
			String expectedId= pdetails.EId.getAttribute("value");
			
			sendText(pdetails.driverLicenceNum, map.get("Driver s License Number"));
			sendText(pdetails.licenceExp, map.get("License Expiry Date"));
			pdetails.licenceExp.sendKeys(Keys.ENTER);
			sendText(pdetails.SSN, map.get("SSN Number"));
			sendText(pdetails.SIN, map.get("SIN Number"));
			//clickRadioOrCheckBox(pdetails.genderRadioGroup, "2");   //map.get("Gender")
			wait(3);
			waitAndClick(pdetails.FemaleRB);
			selectDdValue(pdetails.maritalStatus, map.get("Marital Status"));
			wait(2);
			selectDdValue(pdetails.nationalityDD, map.get("Nationality"));
			wait(2);
			sendText(pdetails.dateOfBirth, map.get("Date of Birth"));
			pdetails.dateOfBirth.sendKeys(Keys.ENTER);
			wait(2);
			sendText(pdetails.nickName, map.get("Nick Name"));
			wait(3);
			sendText(pdetails.militaryService, map.get("Military Service"));
			wait(2);
			//clickRadioOrCheckBox(pdetails.smokerBtn,"value");
			waitAndClick(pdetails.saveButton);
			takeScreenshot("HRMSB6_340");
			String actualId= pdetails.EId.getAttribute("value");
			Assert.assertTrue("Employee is Not added successfully.", expectedId.equals(actualId));
			
		}
		
		
		
	}
	
	
	
	
	
	
}
