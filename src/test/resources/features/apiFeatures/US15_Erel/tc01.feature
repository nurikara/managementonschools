@US01Apii
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario Outline: US01_GuestUser

    Given tum guest userlar icin get request yap
    Then gelen bodyi dogrula "<name>", "<surname>", "<birthplace>", "<phone>", "<gender>", "<Date Of Birth>", "<ssn>","<username>","<fathername>","<mothername>","<password>"
    Examples:
      | username | name  | surname | birthplace | phone        | gender | Date Of Birth | ssn         | password | fathername | mothername |
      | bionic   | cemil | cem     | ankara     | 532-321-0023 | 1      | 2000-04-23    | 392-81-6745 | 12345678 | bade      | demir       |