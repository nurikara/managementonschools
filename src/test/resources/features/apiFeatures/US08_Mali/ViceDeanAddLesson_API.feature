Feature: Lesson Olusturma US08_API testi
  Scenario Outline: TC01_ViceDean Ders Olusturur
    Given post request yaparak "<lessonName>"_"<compulsory>"_"<creditScore>"  datalar ile ders olustur
    And response ile post edilen  datalarini dogrula
    Examples:
      | lessonName | compulsory | creditScore |
      | make_money | true       | 3           |