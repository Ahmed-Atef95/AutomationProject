
@regression
Feature: Create successful Order

  Scenario: sc_12 | user could create a successful Order
    Given user is logged in with email and password
    #    if not changed pass then pass= asdf@1234
    When user could select a category
    And user can select sub category if found
    #    When user could select
    And user click add item to cart

    When user click on shopping cart
    And user accept terms of service
    And user choose checkout
    And user fills all checkout data
    And user click on continue
    And user click on continue-shipping
    And user click on continue-payment-method
    And user click on continue-payment-info
    And user click on confirm-order
    Then user order products successfully

