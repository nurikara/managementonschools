Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir
  Scenario:Vice Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanici Menu buttonuna tiklar
    And Kullanici Menu icersinde Contact Get All secnegine tiklar
    * Yazarin name'i gorur
    * Yazarin emailini gorur
    * Mesaj gonderilme tarihini gorur
    * Mesaj subject textini gorur
    * Message textini gorur