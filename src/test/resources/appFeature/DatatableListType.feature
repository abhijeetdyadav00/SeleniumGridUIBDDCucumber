Feature: Opening Bank Account

Scenario: Opening bank account by considering nominee info
Given User is at accounts page
When User enters the following data
|Jack|smith|jacksmit@gmail.com|09090909|
|dan|day|danday@abc.com|002849849|
|pan|masala|panmasala@lab.com|97423487|
And User clicks on submit button
Then User should get confirmation