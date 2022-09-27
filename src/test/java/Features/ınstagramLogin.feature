Feature: Instagram login functionality test

  Scenario Outline: Check the ınstagram login page

    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page
    Examples:
      |username  | password|
    |testUser |testPassword|








