
Feature: US-17 Teacher öğrencilere not verebilmeli
  Scenario: Login
    Given Kullanici  "teacher" olarak giriş yapar

  @teacher02
  Scenario Outline:Teacher,Devamsızlık girebilmelidir
    And  Kullanıcı "Choose Lesson" alanını tıklar
    And Kullanıcı 2 saniye bekler
    And  Kullanıcı Choose Lesson alanında açılan derslerden birini seçer
    And  Kullanıcı "Choose Student" alanını tıklar
    And  Kullanıcı "9" alanında açılan öğrencilerden birini seçer
    And  Kullanıcı "Choose Education Term" alanını tıklar
    And  Kullanıcı "3" alanında açılan dönemlerden birini seçer
    And Kullanıcı 2 saniye bekler
    When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
    And Kullanıcı "<absentee>" alanına girilen değeri doğrular
    Then Kullanıcı "Submit" alanını tıklar
    And Kullanıcı sayfayı kapatır
    Examples:
      | absentee | miditerm exam | final exam | info note |
      |      6   |    85          |    75     |Basarilar Dilerim|


