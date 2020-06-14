@inProgress
Feature: Add Employee Details
  Admin should be able to modify employee personal details:

  @inProgress
  Scenario: Add employee personal details
    Given I am logged with valid admin credentials
    When I navigated to add employee page
    And I enter employee first name and last name and click save button
    And I click edit button after employee added
    Then I enter employee personal details information and save employee successfully
      | Driver s License Number | License Expiry Date | SSN Number | SIN Number | Gender | Marital Status | Nationality | Date of Birth | Nick Name | Military Service |
      |              7788995566 | 2027-Jun-02         |     112233 |     667788 | Female | Married        | Turkish     | 1992-Mar-07   | Mary      | Air Force        |
