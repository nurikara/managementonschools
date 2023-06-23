
Feature: US-13 Admin, Teacher oluşturabilmeli
  Background:Login
    Given Kullanici  "admin" olarak giriş yapar
    And Kullanıcı "menü" alanını tıklar
    And Kullanıcı "teacher management" alanını tıklar
    And Kullanıcı 2 saniye bekler
    And  Kullanıcı  Choose Lesson alanını tıklar
    And Kullanıcı 2 saniye bekler
    Then Kullanıcı Choose Lessons alanında çıkan listeden ders seçimini yapar



  Scenario: TC-01 Admin öğretmenin gireceği dersi seçebilmeli
    And Kullanıcı ders seçildiğini  doğrular
    And sayfayi kapatir