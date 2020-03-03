Feature: Validate List of All Orders
  Scenario: web order list of all verification
Given the user navigate to the web orders page
When the user provider userName "Tester"
And the user provided password "test"
Then the user validate the header text "List of All Orders"
