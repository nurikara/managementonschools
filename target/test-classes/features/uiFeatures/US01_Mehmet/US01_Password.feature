
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline:  TC01_Register_Sayfasi_Password_Alani_Testi
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
     # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular

    Examples:
      | name    | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username  | Password   |
      # Kullanici gecerli bir password girer (8 karakter)
      | fernand | musler  | adana      | 100-900-0037 | 30-08-2000  | 100-90-0030 | user900 | Pass900.   |
      # Kullanici gecerli bir password girer (8'den  fazla karakter)
      | oka     | kocu    | adana      | 100-900-0036 | 30-09-2000  | 100-90-0031 | user901 | Pass901. |

  Scenario Outline: TC02_Register_Sayfasi_Password_Alani_Testi_Bosluk
    # Kullanici name alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
    # Kayit basarili oldugunda tüm alanlar temizleniyor
    # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
    And kullanici_password_bos_biraktiginda_kayit_yaptiramadigini_dogrular

    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username  | Password |
      #kullanici password alanini bos birakir. Diger alanlari valid degerler ile doldurur
      | ali | sazan  | adana  | 100-900-0035 | 01.05.1987  | 100.90.0032 | user902 |          |

  Scenario Outline: TC03_Register_Sayfasi_Password_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username  | Password |
      # Kullanici sadece büyük harflerden olusan deger girer
      | hadi | haydi   | adana      | 100-900-0030 | 17-01-2000  | 100-90-0033 | user903 | EEEEEEEE |
    # Kullanici sadece kücük harflerden olusan deger girer
      | haki | haydi   | adana      | 100-900-0031 | 27-01-2000  | 100-90-0034 | user904 | eeeeeeee |
     # Kullanici sadece rakamlardan olusan deger girer
      | hali | haydi   | adana      | 100-900-0032 | 29-01-2000  | 100-90-0035 | user905 | 06345678 |

  Scenario Outline: TC04_Register_Sayfasi_Password_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_eksik_password_ile_kayit_olamayacagina_dair_"Minimum 8 character"_mesaji_alir
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username  | Password   |
      # Kullanici password degeri olarak 8 karakterden az girer
      | hadi | haydi   | adana      | 100-900-0033 | 17-01-2000  | 100-90-0036 | user906 | Pass90. |


  Scenario Outline: TC05_Kullanici_Kayitli_Passwort_Ile_Tekrar_Kayit_Yaptiramaz
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    # Kayitli bir ssn number ile tekrar kayit olamamali
    And kullanici_unique_olmasi_gereken_bilgi_ile_tekrar_kayit_yaptiramadigini_dogrular
    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      | ali  | sazan   | adana      | 100-400-0034 | 30.09.2010  | 100-40-0037 | user907  | Pass902. |