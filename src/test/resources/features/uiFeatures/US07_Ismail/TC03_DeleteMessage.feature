@us7
Feature: US07_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir_Testi


  Scenario: TC03_Dean mesajları silebilmelidir
    Given Kullanıcı adrese gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli  DEAN OLARAK user name girer
    And Kullanıcı geçerli  DEAN OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
    And Kullanıcı menuden Contact-getAll e tıklar
    And Kullanici silme butonunu görür
    Then Kullanici mesajları siler
    And Sayfa kapatilir
