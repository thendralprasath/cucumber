Feature: Validating the adactin hotel website

 Scenario Outline: Validating the login page of adactin website by giving all data
    Given User is on the adactin website
    When  User should enter the "<username>" and "<password>"
    Then user  click the login button
  
    
 Examples:
  |username       |password|   
  |thendralprasath|IWHO25|
  |thendralprasath|IWHO25|
  |thendralprasath|IWHO25|
  |thendralprasath|IWHO25|
  |thendralprasath|IWHO25|
  |thendralprasath|IWHO25|            
            
  Scenario Outline: Validating the search hotel webpage of adactin website by giving all data
    Given User is on the search hotel webpage
    When  User enter the "<location>"  "<hotels>" "<roomtype>" "<no_of_rooms>"  "<check_indate>" "<checkout_date>" "<adultsper_room>" "<childrenper_room>"
    Then user  click the search button
   
    
Examples:
|location|hotels|roomtype|no_of_rooms|check_indate|checkout_date|adultsper_room|childrenper_room|
|2|1|2|4|12/08/2021|14/08/2021|2|1|
|4|2|3|5|14/08/2021|20/08/2021|3|2|
|7|3|1|6|17/08/2021|19/08/2021|1|3|
|6|3|2|3|20/08/2021|23/08/2021|2|1|
|3|2|1|2|22/08/2021|24/08/2021|3|3|
|5|1|3|4|25/08/2021|27/08/2021|1|2|

Scenario: Validating the select hotel webpage of adactin website by giving all data
    Given User is on the select hotel webpage
    When  User should select the hotel by pressing the radio button
    Then user should click the continue button
    
    
    
Scenario Outline: Validating the Book a hotel webpage of adactin website by giving all data
    Given User is on the Book a hotel webpage
    When  User entries "<firstname>"  "<lastname>" "<address>" "<creditcardno>"  "<credit_type>" "<month>" "<year>" "<cvv>"
    Then user should click the book now button
    
        
Examples:
|firstname|lastname|address|creditcardno|credit_type|month|year|cvv|    
|aaa|BBB|CCCC|5432167895432567|3|8|2|465|
|DDD|EBB|HGCC|8752167895432567|2|4|3|065|
|aajbv|BhuBB|CCCivC|5432167899992567|1|9|4|499|
|xcuhaaa|bcvj|bxck|8762167895432567|3|8|5|534|
|asdvcuaa|zscf|njhuhg|9872167895432567|2|8|6|542|
|kjdbchsaaa|bgghn|vgbhh|4532167895432567|1|3|7|123|

Scenario: Validating the Booking confirmation webpage of adactin website by giving all data
    Given User is on the Booking confirmation webpage
    When  User should get the order no
    Then user should click the logout button
     
