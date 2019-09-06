Feature: Login

  Scenario Outline: Login_page
    Given user in the login page
    When user clicks signin button
    And user enters usernam "<username>"  
    And user enters passwor "<password>" 
    Then click login button

    Examples: 
      |		username    | password  | 
      |   Lalitha    |  password123  |

