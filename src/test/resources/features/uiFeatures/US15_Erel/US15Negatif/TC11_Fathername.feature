Feature: Vice Dean, öğrenci oluşturabilme
  Scenario: Father Name girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı father name İ boş bırakıp NAME,surname,Birth Place,email,Date Of Birth,Ssn,User name,cinsiyet,mother name,geçerli password,Telefon numarası girdikten sonra submit e tıklar
    Then Kullanıcı Father Name in altında Required yazısını görür.