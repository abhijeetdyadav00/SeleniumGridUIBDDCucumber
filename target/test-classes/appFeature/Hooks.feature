Feature: Sending email campaign
Scenario: create campaign
Given user should be at campaign page
When user clicks on create campaign
And user enters the information
Then campaign should get created

Scenario: update campaign
Given user should be at campaign page
When user update the details
Then campaign should get updated

Scenario: delete campaign
Given user should be at campaign page
When user click on delete button
Then campaign should get deleted
