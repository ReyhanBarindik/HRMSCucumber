@sprint210, @smoke
Feature: Admin user should be able to
  create an employee and login credentials for an employee

  Background: 
    Given user logged in into HRMS
    Given user navigate to add employee page

  @smoke
  Scenario: Create new Employee
    When user enters employees first name and last name
    And user clicks save button
    Then employee is added successfully

  @smoke
  Scenario: Add Employee without employee id
    When user enters employees first name and last name
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

  @smoke
  Scenario: Add Employee and create Login Credentials
    When user enters employees first name and last name
    And user clicks on create login checkbox
    And user enters  login credentials
    And user clicks save button
    Then employee is added successfully
