@a @Api_ismail
Feature: Meet_Cotroller

  Scenario: TC01_Create_Meet
    Given  send post request for creating meet do
    Then get the response and validate meet
@b @Api_ismail
  Scenario: Meet_Cotroller  Validation
    Given send get request to url by id_
    Then Validate response body_

  @c @Api_ismail
  Scenario: Delete  Meet_Cotroller Validation
    Given send delete request to url by id_
    Then Validate delete response body_