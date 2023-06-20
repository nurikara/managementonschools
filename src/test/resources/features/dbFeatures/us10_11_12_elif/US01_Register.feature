@US01DBTest
Feature: Aday ogrenciler sisteme kayıt olabilmelidir.

  Scenario Outline: US01_GuestUser

    Given "<username>" ile guest useri cagir
    Then body sunlari icermeli :"<name>", "<surname>" ,"<birthplace>","<phone>","<gender>","<Date Of Birth>","<ssn>","<username>","<password>"
    Examples:
      | username | name | surname | birthplace | phone        | gender | Date Of Birth | ssn         | password |
      | john129  | John | Doe     | Ankara     | 333-555-1234 | 0      | 2023-06-01    | 333-66-0987 | John.123 |


    #Loop Deneme Scenariosu

  @LoopDBTest
  Scenario: Loop Deneme Scenariosu
    Given birthplace "batch129" ile guest useri cagır
    Then kac tane user oldugunu bul.

    @DBNegatifTest
    Scenario: Silinen guest useri dogrula
      Given Silinen "johndoe11" ile guest useri cagir
      Then table nın bos oldugunu dogrula.