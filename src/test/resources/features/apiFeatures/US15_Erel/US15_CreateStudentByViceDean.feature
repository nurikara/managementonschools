@US15Api
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario Outline: US15_StudentManagement

    Given Vice Dean olarak tum students icin get request yap
    Then gelen bodyi dogrula "<name>", "<surname>", "<birthplace>", "<phone>", "<gender>", "<Date Of Birth>", "<ssn>","<username>","<fathername>","<mothername>","<password>"
    Examples:
      | username | name  | surname | birthplace | phone        | gender | Date Of Birth | ssn         | password | fathername | mothername |
      | bionic   | cemil | cem     | ankara     | 532-321-0023 | FEMALE | 2000-04-23    | 392-81-6745 | 12345678 | demir       | bade      |

