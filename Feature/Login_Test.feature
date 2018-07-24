Feature: Login Test

  Scenario: Verify the login
    Given Open the url
    When I Login  
    And user enter valid id and pwd
     Then user should successfully login
     
   Scenario: Create New customer
    Given I am HomePage
    When I click on Newcustomer
    And I fill the form
    Then New customer is created


