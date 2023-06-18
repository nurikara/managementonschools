Feature: Vice Dean, öğrenci oluşturabilme
  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı SurNAME i boş bırakıp diğer alanlar doldurulup sonra submit e tıklar
    Then Kullanıcı surname in altında Required yazısını görür.