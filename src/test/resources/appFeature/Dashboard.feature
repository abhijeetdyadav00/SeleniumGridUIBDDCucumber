Feature: Dashboard Creation
Scenario: Create  one default dashboard
Given I am loggen in 
When I click on create dashboard button
And give the details
And I click on Create dashboard button
Then Dashboard should be created 
