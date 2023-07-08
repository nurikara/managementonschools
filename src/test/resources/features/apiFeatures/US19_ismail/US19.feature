@Api_ismail
Feature: Teacher öğrenciler ile toplantı düzenleyebilmeli (Add Meet)

  Scenario: TC01_Create_Meet
    Given  send post request for creating meet do
    Then get the response and validate meet