Feature: test for google application

  Scenario: Test for google title
    Given Open the google application
    When User capture current page title
    Then Title should match
