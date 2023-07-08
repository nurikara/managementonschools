@US06_Positive
Feature:Dean, Vice Dean hesabı oluşturabilmelidir.

  Background:
    Given Admin ilgili sitenin anasayfasina gider
    When Admin kullanici adi ve sifresini kullanarak Dean panaline giris yapar
    And Add ViseDean yazigi goruntulenir

  Scenario:Positive SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    Then SSN bolumune uygun sekilde giris yapilir
    And Sayfadan logout yapilarak cikilir