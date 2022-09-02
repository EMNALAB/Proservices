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
    
  @Invalid_Register
  Scenario: register with a user that already exists
    Given open  website application
    When access the registration form
    And enter an existing user
    Then click to validate registration button
    And error msg is displayed