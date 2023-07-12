@US_04_05_Positive @api_mi
Feature: US04_US05 Create Dean By API

  Scenario: TC01_Create_Dean
    Given send post request for creating room
    Then get the response and validate.


  Scenario: TC01_Edit_Dean
    Given send put request for edit dean

  Scenario: TC02_Delete_Dean
    Given send delete request for delete dean
    Then delete the response and validate.



