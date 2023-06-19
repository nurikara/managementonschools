
Feature: US08 Vice Dean Add Lesson

  @ilk @iki @uc
  Scenario:   Login
    Given Kullanici  "ViceDean" olarak giriş yapar

    @ilk
    Scenario:TC01 Lessons Add Lesson Alanı Pozitive
      Given Kullanici Lessons basligini tiklar
      Then LessonName alanina ders ismi girer
      Then Coppulsory checkbox kutusunu tiklar
      Then CreditScore input alanı int deger girer
      Then Submit butonunu tiklar
      Then Basarili kayıtlama mesaji goruntulenir


      @iki
      Scenario: TC02 Add Lesson alanı LessonName space ile
        Given Kullanici Lessons basligini tiklar
        Then LessonName alanina space data girer
        Then Coppulsory checkbox kutusunu tiklar
        Then CreditScore input alanı int deger girer
        Then Submit butonunu tiklar
        Then Basarisiz giris mesaji goruntulenir

      Scenario: TC03 Compulsory Checkbox
          Given Kullanici Lessons basligini tiklar
          And Compulsory Checkbox kutusunu isaretler
          Then checkbox kutusunun isaretle oldugunu test eder
          And Compulsory Checkbox kutusunu isaretler
          Then checkbox kutusunun isaretin kalkdigini test eder

      @uc
      Scenario Outline: TC04 CreditScore Negative Test
        Given Kullanici Lessons basligini tiklar
        Then LessonName alanina ders ismi girer
        And Compulsory Checkbox kutusunu isaretler
        Then CreditScore input alanına gecersiz "<bir>" deger girer
        Then Submit butonunu tiklar
        And  Girilen degerin kabul edilmedigi dogrulanir
        And input alanlarını temizler
        Examples:
          | bir          |
          | 18.75        |
          | successfully |
          | 15000        |
          | -15          |

