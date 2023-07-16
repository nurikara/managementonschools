@e2e_Nuri1
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

