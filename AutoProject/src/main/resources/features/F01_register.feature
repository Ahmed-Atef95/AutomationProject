@regression
  Feature: Registration | User could signup with a new account
    Scenario: sc_01 | User could register with valid data
      Given user click on register link
      When user fills personal details with valid data
      And user fills pass with valid data
      And user click on register button
      Then success message displayed