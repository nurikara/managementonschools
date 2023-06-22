@DBUpdate
Feature:  Databasede Teacher Update

  Background:    Login
    Given Kullanici  "ViceDean" olarak giriş yapar

  Scenario Outline: DatabaseTesti Teacher Update
    Given Kayıtlamasi yapilan son data yeni "<name>" ve "<surname>" ve"<email>" "<phone>" ve "<ssn>" ve "<username>" ve "<dersismi>" ve  "<creditScore>" ile update edilir
    Then Cagırılan teacher update edilen "<username>", "<surname>", "<phone>" bilgilerini icerir
    Examples:
      | name  | surname | email             | phone        | ssn         | username  | dersismi | compulsory | creditScore |
      | Katip | Celebi  | kcelebi@gmail.com | 553-161-0101 | 456-45-9669 | hızırreis | Selenium | t          | 20          |
