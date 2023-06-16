@deneme
Feature: US08 Vice Dean Add Lesson
  Background: Login
    Given Kullanici  "ViceDean" olarak giriş yapar


    Scenario:TC01 Lessons Add Lesson Alanı
      Given Kullanici Lessons basligini tiklar
      Then LessonName alanina ders ismi girer
      Then Coppulsory checkbox kutusunu tiklar
      Then CreditScore input alanı int deger girer
      Then Submit butonunu tiklar
      Then Basarili kayıtlama mesaji goruntulenir
