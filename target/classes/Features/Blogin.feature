@login @chilternoak
Feature: Login Functionality 

  Scenario Outline: User login with different credentials by using excel
    Given user navigates to the login page
    When user enters username and password by giving "<sheetname>" and <row>
    And clicks the login button
    Then verify user is able to login checking "<loginResult>"
    
     Examples: 
      | sheetname | row       | loginResult                |
      | login     |         1 | https://www.chilternoakfurniture.co.uk/account/login?return_url=%2Faccount |
      | login     |         2 | https://www.chilternoakfurniture.co.uk/account/login?return_url=%2Faccount |
      | login     |         3 | https://www.chilternoakfurniture.co.uk/account/login?return_url=%2Faccount | 
      | login     |         4 | https://www.chilternoakfurniture.co.uk/account                             |
      | login     |         5 | https://www.chilternoakfurniture.co.uk/account/login?return_url=%2Faccount |
      | login     |         6 | https://www.chilternoakfurniture.co.uk/account/login?return_url=%2Faccount |
      | login     |         7 | https://www.chilternoakfurniture.co.uk/account/login?return_url=%2Faccount |