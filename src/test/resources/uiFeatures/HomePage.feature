Feature: Homepage functionality
Scenario: verify title of page
Given user is at the landing page
Then page title should contains "Amazon"

Scenario: verify cart icon is displaying
Given user is at the landing page
Then cart icon should get displayed

#Scenario: checkout the deal section
#Given user is at the landing page
#When user clicks on deals
#Then user should redirect to deal page
