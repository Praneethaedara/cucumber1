#Author: your.email@your.domain.com
@tag
Feature: To test add tariff plan functionality

  @tag2
  Scenario Outline: To verify the sucess message
    Given the user is in add tariff plan page
    When the user fill in valid tariff plan details "<monthlyRental>","<freeLocal>","<freeInternational>","<freeSMS>","<local>","<international>","<SMS>"
    And the user clicks submit button
    Then the user should see the sucess message

    Examples: 
      | monthlyRental | freeLocal | freeInternational | freeSMS | local | international | SMS |
      | 500           | 100       | 300               | 100     | 200   | 100           | 300 |
    
  Scenario Outline: To verify the error popup message
    Given the user is in add tariff plan page
    When the user fills in valid tariff plan details "<monthlyRental>","<freeLocal>","<freeInternational>","<freeSMS>","<local>","<international>","<SMS>"
   # And the user click submit button
    Then should get popup message displayed like fill all fields
    

    Examples: 
      | monthlyRental | freeLocal | freeInternational | freeSMS | local | international | SMS |
      | 500           | 100       | 300               | 100     | 200   |               | 300 |           
