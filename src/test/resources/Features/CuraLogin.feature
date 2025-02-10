Feature: Test CURA Healthcare Login Functionality

  Scenario Outline: Check Login with Parameterized Data

    Given user lands on cura login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user gets logged in
    Examples:
      | username | password |
      | John Doe | ThisIsNotAPassword |