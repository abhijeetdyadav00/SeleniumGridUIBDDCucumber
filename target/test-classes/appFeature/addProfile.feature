

Feature: Manage profile functionality
Background:
Given I have logged into application
And I am on home page 

Scenario: Addition of profile
When I clicked on add button
And I I enter details
Then profile should get created

Scenario: Updation of Profile
When I clicked on edit button 
And Update data
Then Profile should be updated 

Scenario: Deletion of profile
When I clicked on Delete button
Then Profile should be deleted


