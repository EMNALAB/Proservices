Feature: contact us forms

  @contactus
  Scenario Outline: fill out the contact us form
    Given I nagigate to contact us page
    When I fill the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click on send button
    Then successufull message should be displayed

    Examples: 
      |SheetName|RowNumber|
      |ContactezNous |0|
      |ContactezNous |1|
      |ContactezNous |2|
      
      
    