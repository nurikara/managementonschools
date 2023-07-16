@erel @tc09
Feature: Vice Dean, öğrenci oluşturabilme

  Scenario Outline: SSN girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı SSN BÖLÜMÜNE; "<Ssn number>" ve dokuz rakamdan oluşan numarayı,diğer bölümler girdikten sonra submit e tıklar
    Then Kullanıcı Please enter valid SSN number uyarsını görür.
    And Sayfa kapatiliir
    Examples:
      | Ssn number   |
      | 45678789611  |
      | 45678-789612 |
      | 456-788961   |



