@us19
Feature: US19_Teacher öğrenciler ile toplantı düzenleyebilmeli

  Scenario:TC01_"Choose Students" öğrenci seçilebilmeli
    Given Kullanıcı adrese gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli  TEACHER OLARAK user name girer
    And Kullanıcı geçerli  TEACHER OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
    And Kullanıcı menuden Meet Management e tıklar
    And Kullanici Select Students kismina tiklar
    Then Kullanici acilan  listeden bir ogrenci secer