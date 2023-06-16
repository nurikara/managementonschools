@deneme
Feature: US08 Vice Dean Add Lesson
  Scenario:   Login
    Given Kullanici  "ViceDean" olarak giriş yapar


    Scenario:TC01 Lessons Add Lesson Alanı Pozitive
      Given Kullanici Lessons basligini tiklar
      Then LessonName alanina ders ismi girer
      Then Coppulsory checkbox kutusunu tiklar
      Then CreditScore input alanı int deger girer
      Then Submit butonunu tiklar
      Then Basarili kayıtlama mesaji goruntulenir



      Scenario: TC02 Add Lesson alanı LessonName space ile
        Given Kullanici Lessons basligini tiklar
        Then LessonName alanina space data girer
        Then Coppulsory checkbox kutusunu tiklar
        Then CreditScore input alanı int deger girer
        Then Submit butonunu tiklar
        Then Basarisiz giris mesaji goruntulenir