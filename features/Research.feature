@Research
Feature: look for training

  @Valid_research
  Scenario: TO LOOK FOR EXISTING TRAINING
    Given I open proservices application
    When I click  the search box 
    And I enter the desired training
    And validate the search
    Then have the search results related to the training sought