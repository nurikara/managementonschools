Feature: US19_Teacher öğrenciler ile toplantı düzenleyebilmeli

  Scenario: TC04_"Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmeli

Given Kullanıcı adrese gider
When Kullanıcı LOG IN e tıklar
And Kullanıcı geçerli  TEACHER OLARAK user name girer
And Kullanıcı geçerli  TEACHER OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
And Kullanıcı menuden Meet Management e tıklar
And Kullanici Select Students kismina tiklar
And Kullanici acilan  listeden bir ogrenci secer
    And Kullanici "1530" start time secer
    And Kullanici "1735" stop time secer
And Kullanici "Description" girer
And Kullanici bir tarih secer
And Kullanici Submit butonuna tıklar
Then Kullanıcı meet olusturur