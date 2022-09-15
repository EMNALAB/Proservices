@Register
Feature: register
  As a user I want to create an account

  @Valid_Register
  Scenario: Valid Register
    Given open  website application
    When access the registration form
    And enter login
    And enter email
    And enter pwd
    And confirm password
    Then click to validate registration button
    And home should be displayed
    
  @Invalid_Register_with_username
  Scenario: register with a user that already exists
    Given open  website application
    When access the registration form
    And enter an existing user
    Then click to validate registration button
    And error msg is displayed
    
  @Invalid_Register_with_email
  Scenario: register with a email that already exists
    Given open  website application
    When access the registration form
     And enter new login
    And enter existing email
    And enter new pwd
    And confirm new password
    Then click to validate registration button
    And error msg is displayed