@e2e_Nuri
Feature:Dean, Vice Dean hesabı oluşturabilmelidir.

  Scenario:giris yapilir
    Given Admin ilgili sitenin anasayfasina gider
    When Admin kullanici adi ve sifresini kullanarak Dean panaline giris yapar
    And Add ViseDean yazigi goruntulenir

  Scenario:Admin gerekli bilgileri uygun sekilde girer.
    Then SSN bolumune uygun sekilde giris yapilir
    And Sayfadan logout yapilarak cikilir

  Scenario:Admin ui da kayit ettigi visedean Api testini yapar.
    Given Admin butun visedeanleri cagirarak kayit ettigi visedean in id sine ulasir
    Then id sine ulastigi Visedean in assertion yapar

    Scenario: Admin ui ile olusturulan vise dean in database testini yapar
      Given Admin connetion olusturur
      Then Admin database icin assertion islemlerini yapar.