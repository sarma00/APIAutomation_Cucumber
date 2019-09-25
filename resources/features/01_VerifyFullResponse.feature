#Author: 
Feature: Verify the response for API use cases

## Case 1
Scenario: Verify the status code and category count
Given the user calls the valid API endpoint with GET method
Then the reponse code should be 200
And the category count should be equal to 16

## Case 2
Scenario: Verify the response for all the categories
Given the user submits the API with all category from response
Then the result matches the category with request
But when the user submits API with invalid category
Then the user gets 404 error code

## Case 3
Scenario: Verify the value of text in response body
Given the user submits the API with valid url
When the user receives a 200 status code
Then the response contains the text "entire song"
And the icon url is a valid url

## Case 4

Scenario: Verify the status code with invalid url
Given the user submits the API with an invalid url
Then the user receives a 404 error code in the response
