Feature: type something

  Scenario Outline: something_buy
    Given user is in login page
    When user clicks signin key
    And user enter un "<username>"
    And user enter ps "<password>"
    And user clicks login page
    When user search product "<product>"
    Then click search button
     

    Examples: 
      | username  | password | product  |
      | Lalitha |    Password123 | hand |
      
