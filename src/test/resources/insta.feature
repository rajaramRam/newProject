Feature: Validating instagram page

  Scenario Outline: Valiating the login funtionality with username and password
    Given User should in login page
    When User enter valid "<username>" and valid "<password>"
    And user click login button
    Then Next page should be open

    Examples: 
      | username | password |
      | raja     | hello123 |
