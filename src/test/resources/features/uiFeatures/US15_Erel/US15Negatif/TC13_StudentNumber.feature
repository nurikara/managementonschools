Feature: Vice Dean, öğrenci oluşturabilme
  Scenario: Student number otomatik olarak gelmelidir.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    And Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı tüm bölümleri girdikten sonra submit e tıklar
    Then Kullanıcı STUDENT LIST bölümünde student number ı görür.
    And Sayfa kapatiliir