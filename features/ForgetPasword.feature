@Forget_password
Feature: Reset my forgotten password
  I want to reset my forgotten password

  @Reset_Forget_password
  Scenario: Enter a valid email address to reset a password
    Given I access the password reset page
    When I enter an existing email address
    And I click to Reset password button
    And A sending confirmation message is displayed
    Then I access to my mailbox
    And I check if I have received an email to reset my password
   

  @Reset_Forgetpassword
  Scenario Outline: Enter an invalid email address to try reset a password
    Given I access the password reset page
    When I enter an <email> address that does not exist or with an incorrect format
    Then An error message should be displayed

    Examples: 
      | email |
      | email1@yahoo.fr | 
      | abc1.com |  
      | automation@ |
