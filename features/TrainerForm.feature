Feature: contact us forms

@TrainerForm
  Scenario Outline: fill out the recuitement of trainers form
    Given I nagigate to recuitement of trainers page
    When I fill the form through given sheet name "<SheetName>" and rownumber <RowNumber>
    And validate the sending
    Then a sending confirmation message is displayed

    Examples: 
      |SheetName|RowNumber|
      |Formateur|0|
      |Formateur|1|
      |Formateur|2| 
      |Formateur|4| 
