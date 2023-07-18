@DBUpdate
Feature:  Databasede Teacher Update

  Background:    Login
    Given Kullanici  "ViceDean" olarak giriş yapar

  Scenario Outline: DatabaseTesti Teacher Update
    Given Kayıtlamasi yapilan son data yeni "<name>" ve "<surname>" ve"<email>" "<phone>" ve "<ssn>" ve "<username>" ve "<dersismi>" ve  "<creditScore>" ile update edilir
    Then Cagırılan teacher update edilen "<username>", "<surname>", "<phone>" bilgilerini icerir
    Examples:
      | name | surname | email           | phone        | ssn         | username   | dersismi | compulsory | creditScore |
      | haz  | Celebi  | kcele@gmail.com | 552-161-1102 | 455-45-2668 | hızırreis4 | Selenium | t          | 20          |
