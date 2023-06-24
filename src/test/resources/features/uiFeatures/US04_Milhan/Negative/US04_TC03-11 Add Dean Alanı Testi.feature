@US04_Negative
Feature: US04_Admin Dean ekleyebilmeli

    Background:
      Given Kullanıcı "url"ye gider
      Then Kullanıcı logine tıklar
      And Kullanıcı username ve password yazar
      And Kullanıcı Login butonuna tıklar
      Then Kullanıcı Menu'den Dean Management sayfasına gider


    Scenario: TC03 Dean Management Name Alanı Alanı Testi
      Given Kullanici Name bolumu hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı Name bölümünün altında Required yazısının olduğunu doğrular

    Scenario: TC04 Dean Management Surname Alanı Testi
      Given Kullanici Surname bolumu hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı Surname bölümünün altında Required yazısının olduğunu doğrular

    Scenario: TC05 Dean Management Birth Place Alanı Testi
      Given Kullanici Birth Place bolumu hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı Birth Place bölümünün altında Required yazısının olduğunu doğrular

    Scenario: TC06 Dean Management Cinsiyet Alanı Testi
      Given Kullanici Cinsiyet bolumu hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE yazısının çıktığını doğrular

    Scenario: TC07 Dean Management Date Of Birth Alanı Testi
      Given Kullanici Date Of Birth bolumu hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı Doğum Tarihi bölümünün altında Required yazısının olduğunu doğrular

    Scenario: TC08 Dean Management Phone Alanı Testi
      Given Kullanici Phone bölümü hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı Phone alanın boş bırakır ve Submit Butonuna Tıklar
      And Kullanıcı Phone bölümünün altında Required yazısının olduğunu doğrular
      And Kullanıcı Phone alanına 12 karakterden az sayı girer
      And Kullanıcı Phone bölümünün altında Minimum 12 character (XXX-XXX-XXXX)  yazısının çıktığını doğrular
      And Kullanıcı Phone alanına 12 karakterden fazla sayı girer ve Submit Butonuna Tıklar
      And Kullanıcı hata mesajını doğrular

    Scenario: TC09 Dean Management SSN Alanı Testi
      Given Kullanici SSN bolumu hariç hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı SSN alanın boş bırakır ve Submit Butonuna Tıklar
      And Kullanıcı SSN bölümünün altında Required yazısının olduğunu doğrular
      And Kullanıcı SSN alanına 11 karakterden az bir rakam girer ve Submit Butonuna Tıklar
      And Kullanıcı SSN bölümünün altında Minimum 11 character (XXX-XX-XXXX) yazısının çıktığını doğrular
      And Kullanıcı SSN bölümüne 11 karakter bir rakam girer ve Submit Butonuna Tıklar
      And Kullanıcı Please enter valid SSN number yazısının çıktığını doğrular
      And Kullanıcı SSN bölümüne 11 tane harf girer ve Submit Butonuna Tıklar
      And Kullanıcı Please enter valid SSN number yazısının çıktığını doğrular

    Scenario: TC10 Dean Management User Name Alanı Testi
      Given Kullanici User Name bolumu hariç diğer bilgileri eksiksiz doldurulur
      And Kullanıcı user name bölümünün altında Required yazısının olduğunu doğrular


    Scenario:TC11 Dean Management Password Alanı Testi
      Given Kullanici bilgileri eksiksiz doldurulur
      And Password alanın boş bırakır ve Submit Butonuna Tıklar
      And Kullanıcı password bölümünün altında Required yazısının olduğunu doğrular
      And Password alanına 8 kararterden az bir password girer ve Submit Butonuna Tıklar
      And Kullanıcı Password bölümünün altında Minimum 8 character yazısının çıktığını doğrular
      And Password alanına 8 sayı içeren bir password girer ve Submit Butonuna Tıklar
      And Kullanıcı kayıt edilemediğine ilişkin hata mesajı çıktığını doğrular
      And Password alanına 8 harf içeren bir password girer ve Submit Butonuna Tıklar
      And Kullanıcı kayıt edilemediğine ilişkin hata mesajı çıktığını doğrular




