@chilternoak  @subscribe
Feature: Subscribe Feature

  @subscriber
  Scenario Outline: Subscribe scenario with differe set of data
    Given user in homepage
    When user click Subscribe email text box
    When user fills the email as "<Email>" 
    And user clicks on subscribe button
    Then it shows sucess message "<url>"
 
    Examples: 
      | Email             | url                                      |
      | saif              |  https://www.chilternoakfurniture.co.uk/ |
      | saif.             |  https://www.chilternoakfurniture.co.uk/ |
      |                   |  https://www.chilternoakfurniture.co.uk/ | 
      | saif@gmail.com    |  https://www.chilternoakfurniture.co.uk/challenge#footer_signup_form  |
