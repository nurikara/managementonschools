@US16_DBTestMessage
Feature: Aday öğrenciler sisteme kayıt olabilmelidir.

  Scenario Outline: US16_MessageManagement

    Given "<id>" ile message cagir
    Then messaj body sunlari icermeli: "<email>", "<message>", "<name>", "<subject>"
    Examples:
      | id | email          | message      | name | subject |
      | 1  | emre@gmail.com | denemedeneme | Emre | deneme  |








