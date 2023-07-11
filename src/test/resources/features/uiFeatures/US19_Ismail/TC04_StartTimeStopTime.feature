@us19
Feature: US19_Teacher öğrenciler ile toplantı düzenleyebilmeliGiven Kullanıcı adrese gider
Scenario: TC04_"Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmeli
  Given Kullanıcı adrese gider
When Kullanıcı LOG IN e tıklar
And Kullanıcı geçerli  TEACHER OLARAK user name girer
And Kullanıcı geçerli  TEACHER OLARAK password girer
  And Kullanıcı Menu buttonuna tiklar
And Kullanıcı menuden Meet Management e tıklar
And Kullanici Select Students kismina tiklar
And Kullanici acilan  listeden bir ogrenci secer
And Kullanici "Start Time" secmez
And Kullanici "StopTime" secmez
And Kullanici "Description" girer
And Kullanici bir tarih secer
And Kullanici Submit butonuna tıklar
Then Kullanici Start Time  ve Stop Time altında Required uyarısını alır

