#Author: EMNA LABIDI
@Review_quiz
Feature: Review_quiz
  As a user I want to consult the quiz review

  @Review_quiz
  Scenario: Access to Review quiz and use next button 
    Given authenticate
    And Access the profile
    When Click on the quiz link
    And Quiz description  is displayed 
    And Access quiz details
    And click on review quiz button
    Then First question should be displayed
    When Click on the next button
    Then Second question should be displayed
    When Click on the next button
    Then Third question should be displayed
    When Click on the next button
    Then Forth question should be displayed
    When Click on the next button
    Then Fifth question should be displayed
    When Click on the next button
    Then Sixth question should be displayed
    When Click on the next button
    Then Seventh question should be displayed
    When Click on the next button
    Then Eighth question should be displayed
    When Click on the next button
    Then Nineth question should be displayed
    When Click on the next button
    Then Tenth question should be displayed
    When Click on the next button
    Then Eleventh question should be displayed
    When Click on the next button
    Then Twelfth question should be displayed
    When Click on the next button
    Then Thirteenth question should be displayed
    When Click on the next button
    Then Fourteenth question should be displayed
    When Click on the next button
    Then Fifteenth question should be displayed
    When Click on the next button
    Then Sixteenth question should be displayed
    When Click on the summary button
    Then Result should be displayed
    When Click on the the cross
    Then the quiz page disappear
