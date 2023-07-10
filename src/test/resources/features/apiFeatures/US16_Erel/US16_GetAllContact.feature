@US16Api
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario : US16_GetAllContact

    Given tum mesajlar icin get request yap
    Then GetAllContact gelen bodyi dogrula
