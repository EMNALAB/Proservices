#Author: Emna Labidi
@UploadPicture
Feature: UploadImage
  As a user I want to change my profile picture

  @UploadPicture_succes
  Scenario: UploadImage
    Given open app
    And access my profile
    When click to upload button
    And chose picture
    And click to save changes button
    Then profile picture will be updated