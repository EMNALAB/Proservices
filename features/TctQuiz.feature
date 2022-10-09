@quiz_istqb
Feature: Test the quiz ISTQB foundation

  @quiz_istqb
  Scenario Outline: Test the quiz Test design technique
    Given I choose Istqb foundation quiz
    When I anserwer question number "<one>"
    And I anserwer question number "<two>"
    And I anserwer question number "<three>"
    And I anserwer question number "<four>"
    And I anserwer question number "<five>"
    And I anserwer question number "<six>"
    And I anserwer question number "<seven>"
    And I anserwer question number "<eight>"
    And I anserwer question number "<nine>"
    And I anserwer question number "<ten>"
    And I anserwer question number "<eleven>"
    And I anserwer question number "<twelve>"
    And I anserwer question number "<thirteen>"
    And I anserwer question number "<forten>"
    And I anserwer question number "<fiveten>"
    And I anserwer question number "<sixten>"
    Then result should be displayed "<expected>"
    
    Examples: 
      |one|two|three|four|five|six|seven|eight|nine|ten|eleven|twelve|thirteen|forten|fiveten|sixten|expected|
      |a|a|a|a|a|a|a|b|b|a|c|c|b|a|a|b|Your quiz grade failed. The result is 0% (the requirement is 65%).|
      |d|c|c|c|c|c|c|a|c|b|d|a|a|b|b|a|Your quiz grade passed. The result is 100% (the requirement is 65%).|
      |d|c|c|c|c|c|c|a|c|b|d|a|a|a|a|b|Your quiz grade passed. The result is 66.3% (the requirement is 65%).|
      |d|c|c|c|c|c|c|a|c|b|d|b|a|b|d|c|Your quiz grade passed. The result is 62.3% (the requirement is 65%).|
    
    
   
