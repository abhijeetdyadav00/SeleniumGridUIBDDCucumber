Feature: login with data inside file
Scenario: Login with correct creds Entered
Given User is at login Page
And User enters username as "abyadav"
And User enters password as 1234
And User clicks on login button 
Then User logged in is validated with "abyadav" and 1234
Then user is verifies for "Abhijeet" and "Yadav"