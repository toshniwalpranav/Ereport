Feature: Print

Scenario: Print
Given user is on webpage
When user print
Then close the page

Scenario: location
Given user is on webpage to find location
When user findout location
Then close the page

