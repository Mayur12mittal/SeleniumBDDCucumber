Feature: Check the functionality of Background Keyword
  Background: user login to website
    Given user lands on login page
    When user enter credentials and click login
    Then user lands on homepage

  Scenario: Check if user is logged in
#    Given user login to website
    When user click on profile button
    Then logout button is displayed

  Scenario: Check the home page
#    Given user login to website
    When user click on dashboard CTA
    Then dashboard page displayed