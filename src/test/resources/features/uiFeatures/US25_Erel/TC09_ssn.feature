@adminerel @09tc
Feature: Vice Dean, öğrenci oluşturabilme
 Scenario Outline: SSN girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
   And Kullanıcı geçerli ADMİN OLARAK user name ve password u girer
   And Kullanıcı menuden sTudent management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
   And Kullanıcı SSN BÖLÜMÜNE; "<45678-7896>" ve dokuz rakamdan oluşan numarayı,diğer bölümler girdikten sonra submit e tıklar
   Then Kullanıcı Please enter valid SSN number uyarsını görür.
   And Sayfa kapatiliir
   Examples:
     | 45678-7896   |
     | 45678789611  |
     | 45678-789612 |
     | 456-788961   |



