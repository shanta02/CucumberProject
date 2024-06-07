Feature: Homepage
This feature verifies the functionality on ESPNCricinfo Homepage

Scenario: verify Night/Day Mode option on home page
Given I launch Chrome browser
When I open ESPNCricinfo Homepage
Then I verify that the ESPNCricinfo homepage displays
When I click on Night mode
Then I verfiy that ESPNCricinfo homepage displays in Night mode