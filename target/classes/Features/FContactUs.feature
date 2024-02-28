@contactus @chilternoak
Feature: Test Chilternoak Furniture contact us page 

  Background: 
    Given I am on Chilternoak Furniture Homepage

  Scenario Outline: Testing of ContactUs Page
    When I click on ContactUs link
    Then I will be on ContactUs Page and Capture the title of the page
    And I entered name as '<name>' on the page
    And I entered email id as '<email>' on the page
    And I entered phone no as '<phone>' on the page
    And I entered message as '<message>' on the page
    Then I click on send button
    Then It shoulld be navigated to Expecteed Url

    Examples: 
      | name | email          | phone      | message                                                          | Status                                |
      | User | user@gmail.com | 1234567891 | Hi, This is excellent product looking forward for many like this | Thanks for contacting us              |
      | User |                | 1243567891 | Hi, This is excellent product looking forward for many like this | Please enter the valid email          |
      |      |                |            |                                                                  | It is mandontary to fill the fields   |
      |      | user@gmail.com | 1243567891 | Hi, This is excellent product looking forward for many like this | Please enter the valid name           |
      | User | user@gmail.com |            | Hi, This is excellent product looking forward for many like this | Please Enter the valid number format  |
