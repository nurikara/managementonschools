@DBAddLesson @db
Feature: Databasede AddLesson

  Background:   Login
    Given Kullanici  "ViceDean" olarak giriş yapar

  Scenario Outline: DatabaseTesti Lesson ekleme
    Given Kayıtlamasi yapilan "<dersismi>" ve "<creditScore>" ile ders bilgileri cagırılır
    Then Cagırılan ders "<dersismi>", "<compulsory>", "<creditScore>" bilgilerini icerir
    Examples:
      | dersismi | compulsory | creditScore |
      | kkhm     | t          | 7           |