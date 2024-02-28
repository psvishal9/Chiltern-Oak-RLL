@search @chilternoak
Feature: Product Search Functionality

  Scenario Outline: Enter  search term and verify  results
    Given I open the browser and enter the URL
    When I enter a  product name as '<productName>' in the search bar
    And I click on the search button
    Then validate '<results>' are found or not

    Examples: 
      | productName                            						 | results                         |
      | Mirror                                   					 | 84 results found                |
      |                                        						 | Search – Chiltern Oak Furniture |
      | Pencil                               							 | 0 results found                 |
      | Kabinats                                  				 | 0 results found                 |
      | Banbury White Painted 2 Door Wardrobe with Drawers | 1 result found                  |
