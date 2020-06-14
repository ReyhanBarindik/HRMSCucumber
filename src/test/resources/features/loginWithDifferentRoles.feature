@smoke
Feature: Login With Different Roles
  User with different roles should be able to login 
  into HRMS application

  @smoke
  Scenario: Login as an Admin using valid Admin credentials
   
    When user enters admin username and admin password
    And user click on login button
    Then user see Welcome Admin message

  @smoke
  Scenario: Login as an ESS using valid ESS credentials
  
    When user enters ESS username and ESS password
    And user click on login button
    Then user see Welcome ESS message
