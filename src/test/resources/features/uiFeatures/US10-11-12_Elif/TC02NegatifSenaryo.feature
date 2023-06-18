@NegativeScenario
Feature: US10  vice dean create lesson program

  Background:
    Given Kullanici belirtilen url adresine gider
    When Kullanıcı login butonuna basar
    And Kullaınıcı username ve password text box ını doldurur
    And Kullanıcı login butonuna tıklar
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı sagda acılan bolumden Lesson Managementa  tıklar
    And Kullanıcı Lesson Programa  tıklar

  @chooseLesson
  Scenario: TC01 Choose Lesson
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1030" start time secer
    And Kullanıcı "1230" stop time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı  gerekli mesajı görür
    And Sayfayi kapatilir

  @chooseEducationTerm
  Scenario: TC02 Choose Education Term
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1030" start time secer
    And Kullanıcı "1230" stop time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı choose education term warning uyarısını görür
    And Sayfayi kapatilir

  @chooseDay
  Scenario: TC03 Choose Education Term
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı "1030" start time secer
    And Kullanıcı "1230" stop time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı choose day warning uyarısını görür
    And Sayfayi kapatilir


  @startTime
  Scenario: TC04 Start Time
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1230" stop time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı start time warning uyarısını görür
    And Sayfayi kapatilir

  @stopTime
  Scenario: TC05 Stop Time
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1030" start time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı stop time warning uyarısını görür
    And Sayfayi kapatilir