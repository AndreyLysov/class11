Feature: test

  Scenario: test
    Given i.ua is opened
    When log in with valid credentials
    Then user's email is displayed