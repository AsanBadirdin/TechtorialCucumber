Feature: This is for web order all products
  Scenario: Validate of all product data;
    Given the user navigate to the web orders page
    When the user provide valid username
    And the user provide valid password
    Then the user click view all products menu
    And the user validates the products table