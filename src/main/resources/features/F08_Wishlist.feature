@smoke
Feature: F08_Wishlist | As a User I want to add products to wishlist so that I can keep track of items I'm interested in purchasing later
  Scenario: User can add any product to wishlist
    When User clicks on wishlist button to add any product
    Then User will see success message The product has been added to your wishlist

    Scenario: After adding the products to wishlist User should get Qty value and verify it's bigger than 0
       When User clicks on wishlist button to add any product
       And  After User add products to wishlist wait until this success message with green color to disappear and clicks on Wishlist Tab on the top of the page
       Then User verify if the product added to wishlist and check qty value it's bigger than Zero


