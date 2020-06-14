#Author: asel@syntaxtechs.com
Feature: Dashboard

  @dashborad
  Scenario: Dashboard menu view for Admin
    Given user is logged with valid admin credentials
    Then user see dashboard menu is displayed
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
