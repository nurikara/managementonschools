@us06
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

  Scenario:Positive SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    Then SSN bolumune uygun sekilde giris yapilir
    And Sayfadan logout yapilarak cikilir

  Scenario:Negative SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    Then SSN bolumune uygun olmayan sekilde giris yapilir
    And Sayfadan logout yapilarak cikilir

  Scenario: "UserName" girilmelidir. Boş bırakılamaz.
    Then Add ViseDean bolumu doldurulurken UserName kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario: Password girilebilmelidir.
    Then Add ViseDean bolumu doldurulurken PassWord kismi bos birakilir
    And Sayfadan logout yapilarak cikilir

  Scenario:Password en az 8 karakterden oluşmalıdır.
    Then Add ViseDean bolumu doldurulurken PassWord EnAz 8 karakterden oluşmalıdır
    And Sayfadan logout yapilarak cikilir

  Scenario:Password; büyük harf, küçük harf ve bir rakam içermelidir.
    Then Add ViseDean bolumu doldurulurken Password; büyük harf, küçük harf ve bir rakam içermelidir.
    And Sayfadan logout yapilarak cikilir
