@US16_DBTestMessage
Feature: Aday öğrenciler sisteme kayıt olabilmelidir.

  Scenario Outline: US16_MessageManagement

    Given "<id>" ile message cagir
    Then messaj body sunlari icermeli: "<email>", "<message>", "<name>", "<subject>"
    Examples:
      | id | email          | message      | name | subject |
      | 1  | emre@gmail.com | denemedeneme | Emre | deneme  |




    #Loop deneme senaryosu
 # @LoopDB
  #Scenario:
   # Given birthplace "batch129" ile guest useri cagir
    #Then kac tane user oldugunu bul


  #@DBNegative
  #Scenario: Silinen guest useri dogrula
   # Given silinen "alican129" ile guest useri cagir
    #Then tablein bos oldugunu dogrula



