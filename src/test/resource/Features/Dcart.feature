@cart @chilternoak
Feature: Test cart functionality

  Scenario: add to cart
    Given user search sofa
    Then add to cart
    Then validate with added product count
    Then remove from the cart
    Then validate product is removed

  Scenario: add 3 different products to cart1
    Given user search table
    Then add to cart and continue
    Then user search sofa
    Then add to cart and continue
    Then user search Tv unit
    Then add to cart
    Then validate multiple products are added
    
  Scenario: add to cart an invalid item
    Given user search NoteBook
    Then validate invalid item
    
  Scenario: Increasing the quantity of item
    Given user search table
    Then add to cart
    Then incresing the quantity
    Then validate the item quantity increased