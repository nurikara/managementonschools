
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Username_Alani_Testi
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
     # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username          | Password   |
      # Minimum karakter testi
      #Kullanici gecerli (3 karakterli) bir username girer
      | Vali | kan     | adana      | 100-800-0030 | 20-02-1977  | 100-80-0030 | use               | Passs30. |
      # Kullanici 4 karakterli bir username girer
      | Vali | kan     | adana      | 100-800-0031 | 20-02-1977  | 100-80-0031 | sdfa              | Passs31. |
      # Maksimum karakter testi
      # Kullanici 17 karakter girer
      | Vali | kan     | adana      | 100-800-0032 | 20-02-1977  | 100-80-0032 | onyedikaraktervar | Passs32. |

  Scenario Outline: TC02_Register_Sayfasi_username_Alani_Testi_Bosluk
    # Kullanici username alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
    # Kayit basarili oldugunda tüm alanlar temizleniyor
    # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      #kullanici username alanini bos birakir. Diger alanlari valid degerler ile doldurur
      | Vali | kan     | adana      | 100-800-0033 | 20-02-1977  | 100-80-0023 |          | Passs33. |



  Scenario Outline: TC04_Kullanici_Kayitli_Username_Ile_Tekrar_Kayit_Yaptiramaz
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    # Kayitli bir phone ile tekrar kayit olamamali
    And kullanici_unique_olmasi_gereken_bilgi_ile_tekrar_kayit_yaptiramadigini_dogrular
    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      | ali  | sazan   | adana      | 100-400-0035 | 30.09.2010  | 100-40-0035 | sdfa  | Passs34. |