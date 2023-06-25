@adminerel @06tc
Feature: Vice Dean, öğrenci oluşturabilme
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli ADMİN OLARAK user name ve password u girer
    And Kullanıcı menuden sTudent management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar
    Then Kullanıcı Telefon numarası in altında Required yazısını görür.
    And Sayfa kapatiliir