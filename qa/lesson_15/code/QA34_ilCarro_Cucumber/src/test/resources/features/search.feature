Feature: Search

@search
Scenario: Search car by date
Given User launches Chrome browser
When User opens ilCarro HomePage
And User enters city
And User enters dates
And User clicks on search button
Then User verifies search results are displayed
And User quites browser