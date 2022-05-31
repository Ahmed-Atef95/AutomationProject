@regression
Feature: User could reset his/her password successfully

  Scenario: sc_03 | User could reset his/her password successfully
    Given user is logged in with email and password
    When user should click on my account link then click on change password
    And user fills old pass "asdf@1234" and new pass
    And user click on Change password button
    Then user has changed his-her password successfully

