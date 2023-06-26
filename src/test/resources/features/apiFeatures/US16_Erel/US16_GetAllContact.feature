@US16Api
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario Outline: US01_GuestUser

    Given tum mesajlar icin get request yap
    Then gelen bodyi dogrula "<name>", "<email>", "<subject>", "<message>", "<date>"
    Examples:
      | name     | email           | subject   | message           | date       |
      | john doe | johndoe@testcom | important | This is a Message | 2023-06-24 |