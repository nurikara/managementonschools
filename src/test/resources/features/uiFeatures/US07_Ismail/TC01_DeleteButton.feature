Feature: US07_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir_Testi
@us7
  Scenario:TC01_Dean silme butonunu gorebilmeli

    Given Kullanıcı adrese gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli  DEAN OLARAK user name girer
    And Kullanıcı geçerli  DEAN OLARAK password girer
    And Kullanıcı Menu buttonuna tiklar
    And Kullanıcı menuden Contact-getAll e tıklar
    Then Kullanici silme butonunu görür
    And Sayfa kapatilir
