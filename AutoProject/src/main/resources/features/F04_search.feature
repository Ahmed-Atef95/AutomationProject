@regression
Feature: Search | Logged User could search for any product

  Scenario: sc_04 | user could search for product using fullName
#    Given user is logged in with "email@gmail.com" and "111111"
    When user search using the name
    Then user could find camera


