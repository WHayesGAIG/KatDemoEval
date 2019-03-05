Feature: Register a new user

  Scenario: Register with mandatory data
    Given Open Demo Site
    When User click on Make Appoint Link
    And User enter valid LoginID
    And User enter valid password
    And User click on login button
