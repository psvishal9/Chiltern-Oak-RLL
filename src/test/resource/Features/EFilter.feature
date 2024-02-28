@chilternoak @filter
Feature: Filter functionality

  Scenario: Filter Functionality search the product
    Given user navigates to the website chilternoakfurniture.co.uk
    And search the product
    Then added filter successfully

  Scenario: Filter Functionality for choose style
    Given user navigates to the website chilternoakfurniture.co.uk
    And search the product
    And choose the style
    Then added filter successfully

  Scenario: Filter Functionality for drag the price
    Given user navigates to the website chilternoakfurniture.co.uk
    And search the product
    And drag the price element
    And choose the style
    Then added filter successfully

  Scenario: Filter Functionality for choose color
    Given user navigates to the website chilternoakfurniture.co.uk
    And search the product
    And drag the price element
    And choose the color
    Then added filter successfully
