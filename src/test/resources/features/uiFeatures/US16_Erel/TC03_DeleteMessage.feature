@erell @tc003
Feature: Vice Dean mesajları silebilmelidir.
  Scenario: Vice Dean silme butonunu gorebilmeli
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanici Menu buttonuna tiklar
    And Kullanici Menu icersinde Contact Get All secnegine tiklar
    Then Kullanici Silme butonuna tiklar
    And Sayfa kapatiliir