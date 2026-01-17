Feature: login
  As a user login success

  Scenario Outline: login success
    Given the user enter the page
    When the user enters the "<email>" as email
    When the user enters the "<password>" as password
    Then the user looks at the home page

    Examples:
      | email         | password     |
      | standard_user | secret_sauce |