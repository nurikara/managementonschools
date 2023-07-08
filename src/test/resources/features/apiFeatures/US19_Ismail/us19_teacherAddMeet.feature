Feature: Teacher öğrenciler ile toplantı düzenleyebilmeli ve bu toplantilari edit edip silebilmeli

  Scenario: US19 Meeting olusturma
    Given  post request gonderilir
    Then body sunlari icermeli: "<date>","<description>","<startTime>","<stopTime>","<studentId>"

  Scenario: us19 get the request
    Given get request gonderilir
    Then dogrulama yapilir





