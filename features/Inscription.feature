@Register
Feature: Register
  Description: As a user I want to register

  Background: home page is launched
    Given I navigate to home page
    And I access the registration form

  @Valid_Register_Form
    Scenario Outline: enter valid data
    When I fill the form  "<SheetName>" and rownumber <RowNumber>
    And validation
    Then  user space must be displayed


    Examples:
      |SheetName|RowNumber|
      |ValidRegister|0|

  @Invalid_Register_Form
    Scenario Outline: enter invalid data
      When I fill the form  "<SheetName>" and rownumber <RowNumber>
      And validation
      Then  "<errorMessage>" is displayed

      Examples:
        |SheetName|RowNumber|errorMessage|
        |Invalid_Register|0|Erreur : cet identifiant est déjà utilisé. Veuillez en choisir un autre.|
        |Invalid_Register|1|Erreur : cette adresse e-mail est déjà utilisée. Veuillez en choisir une autre.|
        |Invalid_Register|2|Erreur : l’adresse e-mail est incorrecte.|


      