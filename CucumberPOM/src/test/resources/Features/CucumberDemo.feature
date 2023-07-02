Feature: To perform a demo on cucumber pom

  Scenario: Login
    Given the user launches the NOPAdmin URL
    Then the user verifies the logo
    When the user enters the username and password
    And the user clicks on signin button
    Then the user verifies the homepage


    Scenario: Logout
      Given the user launches the NOPAdmin URL
      Then the user verifies the logo
      When the user enters the username and password
      And the user clicks on signin button
      Then the user verifies the homepage
      And the user performs logout