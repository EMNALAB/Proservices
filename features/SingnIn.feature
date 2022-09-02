@SignIn
Feature: Sign in
  I want to sign in  on  proservices website

  @Valid_signIn
  Scenario: valid authentication
    Given open application
    When click on Login button
    And enter username
    And enter password
    And click on connection button
    Then home page should be displayed

    
  @Invalid_username
  Scenario: invalid authentication
    Given open application
    When click on Login button
    And enter invalidusername
    And enter invalidpassword
    And click on connection button
    Then error msg should be displayed
    
    
  @Invalid_password
  Scenario: invalid authentication
    Given open application
    When click on Login button
    And enter username
    And enter invalidpassword
    And click on connection button
    Then error msg should be displayed