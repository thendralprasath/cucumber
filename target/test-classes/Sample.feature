Feature: Validating Adacting Webpage

  Scenario Outline: Generating order Id of Adacting webpage
    Given user is Adacting home page
    When user enter "<username>" and "<password>"
    And user should click login button
    When User enter the "<location>"  "<hotels>" "<roomtype>" "<no_of_rooms>"  "<check_indate>" "<checkout_date>" "<adultsper_room>" "<childrenper_room>"
    And user  click the search button
    And user should selec hotel and continue for booking
    When User entries "<firstname>"  "<lastname>" "<address>" "<creditcardno>"  "<credit_type>" "<month>" "<year>" "<cvv>"
    Then user should click the book now button

    Examples: 
      | username        | password | location | hotels | roomtype | no_of_rooms | check_indate | checkout_date | adultsper_room | childrenper_room | firstname  | lastname | address | creditcardno     | credit_type | month | year | cvv |
      | thendralprasath | IWHO25   |        2 |      1 |        2 |           4 | 12/08/2021   | 14/08/2021    |              2 |                1 | aaa        | BBB      | CCCC    | 5432167895432567 |           3 |     8 |    2 | 465 |
      | thendralprasath | IWHO25   |        4 |      2 |        3 |           5 | 14/08/2021   | 20/08/2021    |              3 |                2 | DDD        | EBB      | HGCC    | 8752167895432567 |           2 |     4 |    3 | 065 |
     