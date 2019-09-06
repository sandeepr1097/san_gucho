Feature: case_4

  Scenario Outline: add to cart without login
    Given user  in login page
    When user search prod "<product>" 
    Then user click search button
    And click add to cart
    Then login page should display

    Examples: 
      | product | 
      | head | 
