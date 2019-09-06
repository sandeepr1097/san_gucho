Feature: Registration
 
  Scenario: Register in TestMeApp
    Given I want to register in TestMeApp
    And user clicks signup page
    When user enters username "sandeepr1097" 
    And  user enters firstname "sandeep" 
    And  user enters lastname "san" 
    And  user enters password "oneplus" 
    And  user enters confirm password "oneplus" 
    And  user clicks gender male
    And  user enters email "sandeepr1097@gmail.com" 
    And  user enters mobile number "7358261153"
    And  user enters DOB "09/11/1997"
    And  user enters address "11/116,annai satya nagar 3rd street"
    And  user chooses security question 
    And  user enters answer "rj"
    Then user clicks the register button
