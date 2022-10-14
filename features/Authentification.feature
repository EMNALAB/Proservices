@Auth
Feature: Authentification
  Description: Try to sign in with invalid data

  @authentification
    Scenario Outline: check invalid authentication
    Given access the authentication page
    When enter data "<SheetName>" and rownumber <RowNumber>
    And I click on connection button
    Then check the "<result>"

    Examples:
    |SheetName|RowNumber|result|
    |logininvalid|0|The password is incorrect|
    |logininvalid|1|Invalid username or incorrect password!|
    |logininvalid|2|Invalid username or incorrect password!|