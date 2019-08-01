Feature: Add item to cart
  
@TestngScenario
  Scenario: Amazon assignment
    Given I am in amazon homepage	
    When I search for  a product
    And I save the cost of the first result 
    And I click on the first Result
    Then Details cost matches with results cost
    When I add the product to cart
    And I go back to homepage
    And I click category in navigation bar
    Then Login page is displayed
    When I click on create your amazon account
    And I enter name in name field
    And I enter email in email field
    And I enter password in password field
    And I enter password in password confirmation field
    Then Create account text is displayed
