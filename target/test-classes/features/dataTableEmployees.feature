Feature: Add new Employee

  Background: 

    Given user is logged with valid admin credentials

    And user navigates to AddEmployeePage


  #to perform DDT in cucumber we use Scenario Outline with Examples

  @regression
  Scenario Outline: Adding multiple employees

    When user enter employees "<FirstName>", "<MiddleName>" and "<LastName>"

    And user clicks save button

    Then "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully



    Examples: 

      | FirstName | MiddleName | LastName  |

      | James     | J          | Smith     |

      | Faisal    | F          | Sakhi     |

      | Sohil     | S          | Instuctor |

      | Yunus     | Emre       | Yakut     |



  #adding multiple employees using Cucumber DataTable

  @regression
  Scenario: Adding multiple employees

    When user enters employee details and click on save then employee is added

      | FirstName | MiddleName | LastName |

      | Semra     | Suzan      | Sezen    |

      | Serap     | S          | Smith    |

      | Amine     | Asya       | Ayla      |
      
     Then employee is added 
      
      
      
      
      