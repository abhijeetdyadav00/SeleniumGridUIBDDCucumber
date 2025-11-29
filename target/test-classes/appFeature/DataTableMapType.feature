Feature: Opening bank account
Scenario: Opening bank account by considering nominee information
Given user is at the accounts page
When user enters the following data
| name | lastname | email | phone |
| Erin | Smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com | 9876543210 |
| Alex | johnson | alex.johnson@gmail.com | 2234453321 |
When user clicks on submit button
Then user should get confirmation