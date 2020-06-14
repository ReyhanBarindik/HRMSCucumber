@addEmployee @excel
Feature: Add Employee
 

  @excel
  Scenario: Add multiple Employee with Excel file
    
    Given I am logged with valid admin credentials
    When I navigated to add employee page
    Then I enter employee information from excel file and save employee successfully
   

 