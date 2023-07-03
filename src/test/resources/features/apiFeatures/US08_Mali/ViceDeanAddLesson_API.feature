Feature: US08 Lesson Create API testi
  Scenario Outline: TC01 ViceDean Ders Olusturur
    Given post request yaparak "<lessonName>"_"<compulsory>"_"<creditScore>"  datalar ile ders olustur
    And response ile post edilen  datalarini dogrula
    Examples:
      | lessonName | compulsory | creditScore |
      | film2      | true       | 4           |