
#We can use Boolean operators as well to define the condition of tags e.g. "@sanity or @regression"


@campaign
Feature: Sending email campaign
Background:
Given user should be at campaign page

@sanity
Scenario: create campaign
When user clicks on create campaign
And user enters the information
Then campaign should get created

@regression
Scenario: update campaign
When user update the details
Then campaign should get updated

@functional
Scenario: delete campaign
When user click on delete button
Then campaign should get deleted
