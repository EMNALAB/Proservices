Feature: Demandez un devis

@Devis
  Scenario Outline: fill out the quote form
    Given I nagigate to quote page
    When fill in the form name "<SheetName>" and rownumber <RowNumber>
    And click to send button
    Then show message

    Examples: 
      |SheetName|RowNumber|
      |DemandezUnDevis|0|
      |DemandezUnDevis|1|
      |DemandezUnDevis|2| 
      |DemandezUnDevis|4| 