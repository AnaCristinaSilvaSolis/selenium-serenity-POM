Feature: login
  As a user login success

  Scenario: login success
    Given the user enter the page
    When the user enters the email
    And the user enters the password
    Then the user looks at the home page
