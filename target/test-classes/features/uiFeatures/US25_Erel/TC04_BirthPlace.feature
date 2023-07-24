@adminerel @04tc
Feature: Vice Dean, öğrenci oluşturabilme
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli ADMİN OLARAK user name ve password u girer
    And Kullanıcı menuden sTudent management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı BIRTH PLACE İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar
    Then Kullanıcı Birth Place in altında Required yazısını görür.
    And Sayfa kapatiliir