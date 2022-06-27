Feature: Login Validation

  Scenario: Login Validation with Valid username and password
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to homepage
