@us21
Feature: US21-Students, choose lesson, grades and announcement

  Background:
    Given Kullanici_"https://managementonschools.com/"_sitesine gider
    When Kullanici_LOG_IN'e_tiklar
    And Kullanici_gecerli_Student_olarak_Username_ve_Password'u_girer



  @us21tc01
    Scenario:
    Then Karsisina cikan sayfada Lesson Teacher Day Start time ve Stop time bilgilerini gorur
    Then sayfa kapatilir


  @us21tc02positive
    Scenario:
    And Karsisina cikan sayfada Choose Lesson altindaki istedigi bir kutucuga basar
    Then Istedigi dersleri sectikten sonra en altta bulunan submit butonuna tiklar
    Then sayfa kapatilir

  @us21tc02negative
  Scenario:
    And Karsisina cikan sayfada Choose Lesson altindaki herhangi bir kutucuga basmaz
    Then Istedigi dersleri sectikten sonra en altta bulunan submit butonuna tiklar negative
    Then sayfa kapatilir

  @us21tc03
    Scenario:
    And Student istedigi iki dersi secer
    Then Student Submit’e tiklar
    Then sayfa kapatilir

  @us21tc04
    Scenario:
    And kullanici sayfanin en altina iner

  @us21tc05
  Scenario:
    And kullanici sayfanin en altina iner
    Then Lesson Program List’te ekledigi dersleri gorur

  @us21tc06
  Scenario:
    And kullanici Menu'ye tiklar
    And Grades and Announcements'e tiklar
    Then cikan sayfada midterm exam ve final exami gorur

  @us21tc07
  Scenario:
    And kullanici Menu'ye tiklar
    And Grades and Announcements'e tiklar
    Then cikan sayfada Start Time ve Stop Time'i gorur



