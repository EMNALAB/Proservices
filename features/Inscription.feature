Feature: Register

@RegisterForm
  Scenario Outline: fill out the register form
    Given I nagigate to home page
    When I fill the form  "<SheetName>" and rownumber <RowNumber>
    And validatation
    Then  message is displayed

    Examples: 
      |SheetName|RowNumber|
      |Register|0|
      |Register|1|
      |Register|2| 
      |Register|4| 

      