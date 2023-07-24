@us19
Feature: US19_Teacher öğrenciler ile toplantı düzenleyebilmeli


  Scenario:TC02_"Date Of Meet" toplantı zamanı seçilebilmeli.
    Given Kullanıcı adrese gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli  TEACHER OLARAK user name girer
    And Kullanıcı geçerli  TEACHER OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
    And Kullanıcı menuden Meet Management e tıklar
    And Kullanici Date Of Meet  bolumunu  görür
    Then Kullanici bir tarih secer
