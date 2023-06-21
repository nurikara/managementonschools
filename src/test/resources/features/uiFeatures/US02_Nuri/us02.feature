Feature: US02 Admin Guest User List

  Background:

    Given Admin ilgili sitenin anasayfasina gider
    When Admin kullanici adi ve sifresini kullanarak Admin panaline giris yapar
    And Acilan pencerenin sol ust kosesine gidilerek Menu butonuna tiklanir
    And Sayganin sol kisminda acilan main menu kisminin altindaki Guset User segmesi tiklanir

@dd
  Scenario:Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Given Acilan sayfada Gust User listesi goruntulenir
    Then Sayfadan logout yapilarak cikilir

  Scenario: Admin Guest User List bilgilerini silebilir
    Then Acilan sayfada Gust User listesindeki uyelerin yaninda bulunan silme buttonu tilanir
    Then Sayfadan logout yapilarak cikilir









