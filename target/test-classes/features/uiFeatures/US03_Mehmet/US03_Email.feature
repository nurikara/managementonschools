@us03
Feature: Kullanicilar sayfadan mesaj gonderebilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_contact_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Email_Alani_Testi_Positive
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<email>", "<subject>", "<message>"
    Then kullanici_sendMessage_butonuna_tiklar
    And kullanici_basarili_sekilde_mesaj_gonderdigini_dogrular
    Examples:
      | name | email       | subject | message |
      # Kullanici email alanina gecerli bir email degeri girer, diger alanlari da gecerli degerlerle doldurur
      | name | a@gmail.com | subject | mesaj gonderebilmeliyim |

  Scenario Outline: TC02_Register_Sayfasi_Name_Alani_Testi_Bosluk
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<email>", "<subject>", "<message>"
    Then kullanici_sendMessage_butonuna_tiklar
    And kullanici_ilgili_alaninin_altinda_"Required"_yazisini_dogrular
    And  kullanici_emaili_bos_birakinca_mesaj_gonderemedigini_dogrular
    Examples:
      | name | email | subject | message |
      | abcd |       | subject | mesaj gonderebilmeliyim |

  Scenario Outline: TC02_Register_Sayfasi_Name_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<email>", "<subject>", "<message>"
    Then kullanici_ilgili_alaninin_altinda_"Required"_yazisini_dogrular
    And  kullanici_emaili_bos_birakinca_mesaj_gonderemedigini_dogrular
    Examples:
      | name | email      | subject | message |
      # Kullanici emaili "." olmadan girer
      | name | a@gmailcom | subject | mesaj gonderebilmeliyim |
      # Kullanici emaili "@" isareti olmadan girer
      | name | agmail.com | subject | mesaj gonderebilmeliyim |
      # Kullanici emaili hem "@" isareti, hem de "." olmadan girer
      | name | agmailcom  | subject | mesaj gonderebilmeliyim |
      # Kullanici emaili domain alanini yanlis girer
      | name | a@x.com  | subject | mesaj gonderebilmeliyim |
    # Kullanici emaili domain alanini yanlis girer
      | name | a@x.com  | subject | mesaj gonderebilmeliyim |
     # Kullanici emaili domain alanini yanlis girer
      | name | a@gmail.hk  | subject | mesaj gonderebilmeliyim |








