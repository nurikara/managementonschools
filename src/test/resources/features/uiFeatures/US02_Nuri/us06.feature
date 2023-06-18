Feature:Dean, Vice Dean hesabı oluşturabilmelidir.


  Background:

    Given Admin ilgili sitenin anasayfasina gider
    When Admin kullanici adi ve sifresini kullanarak Dean panaline giris yapar
    And Add ViseDean yazigi goruntulenir

  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken name kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken surnema kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario: "BirdPlace" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken brithPlace kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario: "Cinsiyet" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken Cinsiyet kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario: "DogumTarihi" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken DogumTarihi kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario: "Telefon" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken TelefonNumarasi kismi bos birakilir
    And Sayfadan logout yapilarak cikilir