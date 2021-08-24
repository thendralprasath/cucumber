Feature: Validating the login function of facebook

 Scenario: Validating the login with valid username and invalid password
    Given User is on the facebook website
    When  User should enter the username and password
    And user should click the login button
    Then user should validate the jhome page is present or not
    
 