Feature: contact us forms

  @contactus
  Scenario Outline: fill out the contact us form
    Given I navigate to contact us page
    When I fill the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click on send button
    Then check the "<message>" that will be displayed

    Examples: 
      |SheetName|RowNumber|message|
      |ContactezNous |0|Votre message a bien été envoyé. Merci.|
      |ContactezNous |1|Votre message a bien été envoyé. Merci.|
      |ContactezNous |2|Des erreurs de validation se sont produites. Veuillez confirmer les champs et le soumettre à nouveau.|
      
      
    