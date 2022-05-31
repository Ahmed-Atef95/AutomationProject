@regression
Feature: Login | users could login to open their accounts

  Scenario:sc_02 | user could login with valid email and password
    Given user should go to login page
    When user login with valid "email@gmail.com" and "asdf@1234"
    And user press on login button
    Then user login to the system successfully


