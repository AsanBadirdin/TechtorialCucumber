Feature: web order
  @positive @smoke
Scenario:  Web Order login negative testing
Given the user navigate to the web orders page
When the user provider userName "Test"
And the user provided password "admin"
Then the user validate text "Invalid Login or Password."
@negative
Scenario:  Web Order login negative testing with numbers
Given the user navigate to the web orders page
When the user provider userName 1234
And the user provided password 4567
Then the user validate text "Invalid Login or Password."
@negatibe
Scenario:  Web Order login negative testing2
Given the user navigate to the web orders page
When the user provide userName "Test" and password "tt"
Then the user validate text "Invalid Login or Password"



