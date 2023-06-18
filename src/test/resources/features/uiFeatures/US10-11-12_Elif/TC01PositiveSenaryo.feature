@PositiveScenario
Feature: US10 vice dean create lesson program

  Scenario: Lesson Program
    Given Kullanici belirtilen url adresine gider
    When Kullanıcı login butonuna basar
    And Kullaınıcı username ve password text box ını doldurur
    And Kullanıcı login butonuna tıklar
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı sagda acılan bolumden Lesson Managementa  tıklar
    And Kullanıcı Lesson Programa  tıklar
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1030" start time secer
    And Kullanıcı "1230" stop time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı Lesson Program List te secilen optionlara gore dersini programda gorundugunu dogrular.
    And Sayfayi kapatilir

