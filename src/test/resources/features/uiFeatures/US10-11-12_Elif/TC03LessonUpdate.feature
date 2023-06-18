@us11
Feature: US11 Vice dean lesson program must be see and update

  Background:
    Given Kullanici belirtilen url adresine gider
    When Kullanıcı login butonuna basar
    And Kullaınıcı username ve password text box ını doldurur
    And Kullanıcı login butonuna tıklar

  @lessonProgramListSee
  Scenario: TC01 Lesson Program must be see
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı sagda acılan bolumden Lesson Managementa  tıklar
    And Kullanıcı Lesson Programa  tıklar
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1045" start time secer
    And Kullanıcı "1245" stop time secer
    And Kullanıcı Submit butonuna tıklar
    Then Kullanıcı Lesson Program List te secilen optionlara gore dersini programda gorundugunu dogrular.
    And Sayfayi kapatilir

  @LessonProgramUpdate
  Scenario: TC02 Lesson Program must be update
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı sagda acılan bolumden Lesson Managementa  tıklar
    And Kullanıcı Lesson Programa  tıklar
    And Kullanıcı Choose Lesson bolumunden ders secer
    And Kullanıcı Choose Education Term dropdown bolumunden donem secer
    And Kullanıcı Choose Day drpodown bolumunden secer
    And Kullanıcı "1045" start time secer
    And Kullanıcı "1245" stop time secer
    And Kullanıcı update butonuna tıklar.
    #Update butonu ile ilgili herhengi birsey yoktur.ScreenShot ile ekran goruntusu alındı.BUG
    And Sayfayi kapatilir