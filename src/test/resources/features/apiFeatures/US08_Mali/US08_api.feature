@Api
Feature: Lesson Olusturma API testi
  Scenario Outline: TC01_ViceDean Ders Olusturur
    Given  post request yaparak  "<lessonName>" ve "<compulsory>" ve "<CreditScore>" dataları ile ders olustur
    Then  response ile post edilen "<lessonName>" ve "<compulsory>" ve "<CreditScore>" datalarini dogrula
    Examples:
      | lessonName | compulsory | CreditScore |
      | HSNSJ      | false      | 3           |