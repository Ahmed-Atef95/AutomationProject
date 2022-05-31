@regression
Feature: Logged user could add different products to Wishlist

  Scenario:sc_10 | user could add different products to Wishlist
Given user could select a category
And user can select sub category if found
And user click add to Wishlist
Then added successfully to Wishlist
