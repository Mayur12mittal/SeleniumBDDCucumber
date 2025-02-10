Feature: Test Google Search Functionality

  Scenario: Validate Google Search

    Given browser is open
    And user is on search page
    When user enters a text
    And press enter
    Then user lands on result page