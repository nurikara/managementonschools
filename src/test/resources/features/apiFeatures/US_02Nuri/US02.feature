
  Feature: Aday öğrenciler sisteme kayıt olabilmelidir. Api

    Scenario Outline: US01_GuestUser

      Given tum gestuserlar icin get request yap
      Then body sunlari icermeli: "<name>", "<surname>", "<birthplace>", "<phone>", "<gender>", "<Date Of Birth>", "<ssn>","<username>"
      Examples:
        | username | name | surname | birthplace | phone        | gender | Date Of Birth | ssn         |
        | john129  | John | Doe     | Ankara     | 333-555-1234 | 0      | 2023-06-01    | 333-66-0987 |
