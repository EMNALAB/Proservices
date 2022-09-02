@Ask_for_a_quote
Feature: ask for a quote
  I want to ask for a quote

  @Demander_un_devis
  Scenario: fill in all the form data correctly
    Given I display the form
    When I enter full name
    And I enter email
    And I enter my phone number
    And I choose the training
    And I choose region
    And I answer question
    And I choose between compagny or particular 
    And I select my choice
    And I write a msg
    And I click to send button 
    Then Confirmation message should appear 
    
    
  @Demander_un_devis_Empty
  Scenario: request a quote while leaving the fields empty
    Given I display the form
    When I leave all fields blank
    And I click to send button
    Then Error message should appear 

  
    
    
    
