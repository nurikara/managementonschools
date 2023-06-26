@erell @tc001
Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir
  Scenario: Vice Dean silme butonunu gorebilmeli
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanici Menu buttonuna tiklar
    And Kullanici Menu icersinde Contact Get All secnegine tiklar
    Then Silme butonu gorur
    And Sayfa kapatiliir