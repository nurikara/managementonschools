@deneme
Feature: US08 Vice Dean Add Lesson
  Background: Vice Dean Login
    Given Kullanici  url adresine gider
    Then HomePage login button tiklar
    Then Login username alanina "ViveDean" gecerli username girilir
    Then Login password alanina  gecerli password girilir
    And Login sayfasi login button tiklar

    Scenario:Lessons Add Lesson Alanı
      Given Kullanici Lessons basligini tiklar
