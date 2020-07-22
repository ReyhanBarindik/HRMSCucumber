@login
Feature: Login

  @login
  Scenario Outline: Invalid login error message validation
    Given I enter username "<username>"
    And I enter password "<password>"
    When I click login button
    Then I see "<errorMsg>"

    Examples: 
      | username | password    | errorMsg                 |
      | Admin    | Hum@nhrm    | Invalid credentials      |
      | Admin    |             | Password cannot be empty |
      | Admin1   | Hum@nhrm123 | Invalid credentials      |
      |          | Hum@nhrm123 | Username cannot be empty |

  @login
  Scenario: Login with invalid credentials
    When I enter invalid username and password and see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |

      
      
     