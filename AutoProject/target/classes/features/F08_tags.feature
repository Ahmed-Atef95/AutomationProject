@regression
Feature: Logged user could select different tags
  Scenario: sc_08 | user could select different tags
    When user search using the name of the product
    And user could select "awesome" tag
    And user could select "book" tag
