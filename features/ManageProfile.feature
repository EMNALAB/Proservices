#Author: Emna Labidi
@Manage_Profile
Feature: Manage profile
  As a user I want to change my profile picture

  Background: home page is launched
    Given open app
    And access my profile

  @UploadPicture_succes
  Scenario: UploadImage
    When I click to avatar icon
    And click to upload button
    And chose picture
    And click to save changes button
    Then profile picture will be updated
    And click on the delete button to delete the image
    And click to save changes button

  @change_personal_information
    Scenario Outline: update personnel information
      When I click to main icon
      And I fill the form with information "<sheetName>" and rownumber <rowNumber>
      And validation
      Then check confirmation "<message>"

    Examples:
      |sheetName|rowNumber|message|
      |personnel_info|0|Information du compte mis à jour avec succès.|
      |personnel_info|1|Information du compte mis à jour avec succès.|
      |personnel_info|2|Information du compte mis à jour avec succès.|

  @update_password
    Scenario Outline: update_password
      When I click to password icon
      And Fill "<SheetName>" and rownumber <RowNumber>
      And click to save button
      Then check "<validation>"

  Examples:
  |SheetName|RowNumber|validation|
  |change_password|0|L'ancien mot de passe est incorrect !|
  |change_password|1|Confirmation du mot de passe incorrecte !|
  |change_password|2|L'ancien mot de passe est incorrect !|
  |change_password|3|Confirmation du mot de passe incorrecte !|

