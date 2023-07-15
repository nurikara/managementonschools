@us12
Feature: US12 Vice Dean appoint a teacher

  Background:
    Given Kullanici belirtilen url adresine gider
    When Kullanıcı login butonuna basar
    And Kullaınıcı username ve password text box ını doldurur
    And Kullanıcı login butonuna tıklar
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı sagda acılan bolumden Lesson Managementa  tıklar
    And Kullanıcı Lesson Programa  tıklar


  @PositiveAssignmentScenario
  Scenario:TC01 Assignment Teacher
    And Kullanıcı Lesson Assıgment List bolumunden ders secer
    And Kullanıcı Choose Teacher dan ogretmen ataması yapar
    And Kullanıcı Submit butonuna tıklar.
    And Kullanıcı secılen derse ogretmen ataması yapıldıgınına dair alert geldigini dogrular.
    And Sayfayi kapatilir

  @NegativeAssignmentScenario
  Scenario:TC02 Assignment Teacher
    And Kullanıcı Lesson Assıgment List bolumunden ders secer
    And Kullanıcı Submit butonuna tıklar.
    And Kullanıcı secılen derse ogretmen ataması yapılmadıgına dair uyarı alır
    And Sayfayi kapatilir


