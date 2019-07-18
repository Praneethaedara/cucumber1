#Addcustomer
Feature: To test add customer functionality
  
  Scenario: To test the generate customer Id  functionality
    Given the user is in add customer page
    When the user fill in valid customer details
    |firstName|test|
    |lastName|selenium|
    |emailAddress|test@gmail.com|
    |address|chennai|
    |phoneNumber|8686757644|
    And the user clicks the submit button
    Then the user should see the customer id generated
    
  Scenario: To test reset form functionality
    Given the user is in add customer page
    When the user fill in valid customer details.
    |firstName|test|
    |lastName|selenium|
    |emailAddress|test@gmail.com|
    |address|chennai|
    |phoneNumber|8686757644|
    And the user click reset button.
    Then all the user details should be deleted.
    
  Scenario: To test error message functionality
     Given the user is in add customer page
     When the user has mentioned gmail address wrong notation
     |firstName|test|
     |lastName|selenium|
     |emailAddress|testgmail.com|
     |address|chennai|
     |phoneNumber|8686757644|
     And the user clicks the submit button
     Then error message should display stating that email address is wrong.
     
  Scenario: To test popup message functionality
     Given the user is in add customer page
     When the user left last name textbox empty
      |firstName|test|
      |lastName|selenium|
      |emailAddress|testgmail.com|
      |address|chennai|
      |phoneNumber| |
     And the user clicks the submit button
     Then popup message should display stating that please fill all fields.
     