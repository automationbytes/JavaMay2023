Feature: Google Search2
  @Regression
  Scenario Outline: To test the functionality of google search with Scenario outline
    Given the user launches the application
    Then the user verifies the google logo
    When the user enters "<SearchText>" in google search
    And the user clicks on search button
    Then the user verifies the google page result

    Examples:
    |SearchText|
    |Amazon   |
    |Microsoft|
    |Yahoo    |