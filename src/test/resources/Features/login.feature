Feature: Test Login Functionality

  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

#  Scenario Outline: Check login is successful with valid credentials
#
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the home page
#    Examples:
#      | username | password |
#      | user1 | pass1 |