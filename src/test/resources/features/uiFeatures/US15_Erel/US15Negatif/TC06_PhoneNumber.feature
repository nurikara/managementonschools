Feature: Vice Dean, öğrenci oluşturabilme
  Scenario: E-mail girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar
    Then Kullanıcı Telefon numarası in altında Required yazısını görür.