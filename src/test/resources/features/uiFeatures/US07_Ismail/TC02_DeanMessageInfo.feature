Feature: US07_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir_Testi
  @us7
  Scenario:TC02_Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir

    Given Kullanıcı adrese gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli  DEAN OLARAK user name girer
    And Kullanıcı geçerli  DEAN OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
    And Kullanıcı menuden Contact-getAll e tıklar
    Then Kullanici mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görür
    And Sayfa kapatilir
