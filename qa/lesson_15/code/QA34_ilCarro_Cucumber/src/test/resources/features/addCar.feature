Feature: Add car

  @rent
  Scenario: Add a car with positive data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on OK button
    And User clicks on Let the car work link
    And User enters valid data about car
    And User clicks on Submit button
    Then User verifies message Car was added
    And User quites browser