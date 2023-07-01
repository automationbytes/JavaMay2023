@Sanity
Feature: Google Search

  Background: Google Launch
    Given the user launches the application
    Then the user verifies the google logo

  Scenario: To test the functionality of google search
    When the user enters "Cucumber" in google search
    And the user clicks on search button
    Then the user verifies the google page result



  Scenario: To test the functionality of google search
    When the user enters "selenium" in google search
    And the user clicks on search button
    Then the user verifies the google page result