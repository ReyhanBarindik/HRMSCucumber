@login
Feature: Login With Different Roles
  User with different roles should be able to login 
  into HRMS application


  @login
  Scenario Outline: Login with different roles
    Given I enter username "<username>"
    And I enter password "<password>"
    When I click login button
    Then I see Welcome "<username>" message

    Examples: 
     | username  | password    |  username   |
     | Admin     | Hum@nhrm123 |  Admin      |
     | Reyhane   | rtI260091@  |  Reyhane    |
     