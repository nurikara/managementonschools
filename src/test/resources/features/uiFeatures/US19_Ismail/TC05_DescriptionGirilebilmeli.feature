@us19
Feature: US19_Teacher öğrenciler ile toplantı düzenleyebilmeli

  Scenario: TC05_Description girilebilmeli/Negatif

  Given Kullanıcı adrese gider
  When Kullanıcı LOG IN e tıklar
And Kullanıcı geçerli  TEACHER OLARAK user name girer
And Kullanıcı geçerli  TEACHER OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
And Kullanıcı menuden Meet Management e tıklar
And Kullanici Select Students kismina tiklar
And Kullanici acilan  listeden bir ogrenci secer
    And Kullanici "1240" start time secer
    And Kullanici "1340" stop time secer
And Kullanici "Description" girmez
And Kullanici bir tarih secer
And Kullanici Submit butonuna tıklar
Then Kullanici  Description altında Required uyarısını alır