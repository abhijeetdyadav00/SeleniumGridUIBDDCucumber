Feature: search functionality

@functional
Scenario: search on homepage
Given user is at the landing page
When user searches the "Iphone 16 pro" in text box
Then mobile search results should display