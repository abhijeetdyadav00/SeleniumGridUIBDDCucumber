Feature: login functionality validation
Scenario: login with valid creds
Given I am on login page
When I enter username
And I enter password
And I click on login button
Then I should able to login 


Scenario: validation of title of page
#Given User should be at login page
Given I am on login page
Then Page title should be displayed
