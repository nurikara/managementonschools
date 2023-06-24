@US04_Positive
Feature: US04_Admin Dean ekleyebilmeli


  Scenario: TC01_Kullanici Admin Olarak Siteye Girebilmeli

      Given Kullanıcı "url"ye gider
      Then Kullanıcı LOG IN e tıklar
      And Kullanıcı geçerli Admin olarak user name'i girer
      And Kullanıcı geçerli Admin olarak password'u girer
      And Kullanıcı Login butonuna tıklar
      And Kullanıcı Menu Butonuna tıklar
      And Açılan sayfadan Dean Management Butonuna tıklar
      And Dean Management sayfasının açıldığı doğrulanır


  Scenario: TC02_Admin Dean ekleyebilmeli

      Given Kullanıcı "url"ye gider
      Then Kullanıcı LOG IN e tıklar
      And Kullanıcı username ve password yazar
      And Kullanıcı Login butonuna tıklar
      Then Kullanıcı Menu'den Dean Management sayfasına gider
      And Dean Management  bilgilerini eksiksiz doldurulur.
      And Kullanici Submit butonuna tıklar
      And Kullanıcı yeni admin eklendigini doğrular









