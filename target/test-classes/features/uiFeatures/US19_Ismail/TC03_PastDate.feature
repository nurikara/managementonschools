@us19
Feature: US19_Teacher öğrenciler ile toplantı düzenleyebilmeli

  Scenario: TC03_"Date Of Meet" toplantı zamanı Geçmiş tarih girilmemmeli.
    Given Kullanıcı adrese gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli  TEACHER OLARAK user name girer
    And Kullanıcı geçerli  TEACHER OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
    And Kullanıcı menuden Meet Management e tıklar
    And Kullanici Select Students kismina tiklar
    And Kullanici acilan  listeden bir ogrenci secer
    And Kullanici "1230" start time secer
    And Kullanici "1330" stop time secer
    And Kullanici "Description" girer
    And Kullanici gecmis bir tarih secer
    And Kullanici Submit butonuna tıklar
    Then Kullanici ileri bir tarih olmalı uyarısını alır