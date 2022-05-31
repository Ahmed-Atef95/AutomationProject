@regression
Feature: Logged User could switch between currencies US-Euro

  Scenario: sc_05 | user could switch between currencies US-Euro
When user select Euro currency
Then user could see product with Euro currency
