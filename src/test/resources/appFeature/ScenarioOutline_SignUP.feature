Feature: Signup functionality

Background:
Given User is at login page 
Given User clicks on signup button

Scenario Outline: Signup to application
When user entering name as "<name>"
And User enters the gender as "<Gender>"
And User enters the age as <age>
And User enters weight as <Weight>
Then Account should be created

Examples:
|name|Gender|age|Weight|
|Abc|M|26|70.5|
|xyz|F|30|90|
|pqr|M|35|45.67|






