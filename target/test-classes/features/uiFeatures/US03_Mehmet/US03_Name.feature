@us03
Feature: Kullanicilar sayfadan mesaj gonderebilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_contact_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Name_Alani_Testi_Positive
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<email>", "<subject>", "<message>"
    Then kullanici_sendMessage_butonuna_tiklar
    And kullanici_basarili_sekilde_mesaj_gonderdigini_dogrular
    Examples:
      | name              | email         | subject | message |
      # Minimum karakter testi
      # Kullanici name alanina tek karakter girer, diger alanlari gecerli degerlerle doldurur
      | a                 | abc@gmail.com | abcd    | mesaj gonderebilmeliyim    |
      # Kullanici name alanina 4 karakter girer, diger alanlari gecerli degerlerle doldurur
      | abcd              | abc@gmail.com | abcd    | mesaj gonderebilmeliyim    |
      # Kullanici name alanina 17 karakter girer, diger alanlari gecerli degerlerle doldurur
      | onyedikaraktervar | abc@gmail.com | abcd    | mesaj gonderebilmeliyim    |

  Scenario Outline: TC02_Register_Sayfasi_Name_Alani_Testi_Bosluk
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<email>", "<subject>", "<message>"
    Then kullanici_sendMessage_butonuna_tiklar
    And kullanici_ilgili_alaninin_altinda_"Required"_yazisini_dogrular
    And  kullanici_mesaj_gonderemedigini_dogrular
    Examples:
      | name | email       | subject | message |
      |      | a@gmail.com | subject | mesaj gonderebilmeliyim |





