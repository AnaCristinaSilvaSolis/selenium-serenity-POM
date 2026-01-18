Feature: login
  As a user login success

  Scenario Outline: login success
    Given the user enter the page
    When the user enters the email as email with the row=<row>
    And the user enters the password as password with the row=<row>
    Then the user looks at the home page
    Examples:
      | row |
      | 1   |
      | 2   |
      | 3   |
