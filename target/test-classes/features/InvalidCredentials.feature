Feature: Invalid Credentials
  User should see error message when login 
  with invalid credentials

  @smoke
  Scenario: Login with valid username and invalid password
    Given user navigated to HRMS
    When user enters valid username and invalid password
    And user click on login button
    Then user see "Invalid credentials" error message

  @smoke
  Scenario Outline: Login with valid username and without password
    Given user navigated to HRMS
    When user enters valid username and empty password
    And user click on login button
    Then user see "Password cannot be empty" error message

  @smoke
  Scenario: Login without username and valid password
    Given user navigated to HRMS
    When user enters empty username and valid password
    And user click on login button
    Then user see "Username cannot be empty" error message
