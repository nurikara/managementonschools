@US15ApiPost @Api
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario: US15_StudentManagement

    Given student icin post request yap
    Then bodyi dogrula