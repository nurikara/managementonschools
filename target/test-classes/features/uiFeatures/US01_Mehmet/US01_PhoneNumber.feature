
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Phone_Alani_Testi_Positive
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
     # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone         | DateOfBirth | Ssn         | Username | Password   |
      # Formata uygun ve 12 karakterli phone number ile test
      | ali  | sazan   | adana      | 100-400-0030  | 30.09.2010  | 100-40-0030 | user309   | Pass300. |
      # Phone number alanina 13 karakter girilir
      | ali  | sazan   | adana      | 100-400-00011 | 30.09.2010  | 100-40-0012 | user301  | Pass301.   |

  Scenario Outline: TC02_Register_Sayfasi_Phone_Alani_Testi_Bosluk
    # Kullanici name alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
     # Kayit basarili oldugunda tüm alanlar temizleniyor
    # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone | DateOfBirth | Ssn         | Username | Password |
      | ali  | sazan   | adana      |       | 01.05.1987  | 100.40.0013 | user303  | Pass302. |

  Scenario Outline: TC03_Register_Sayfasi_Phone_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    # Gelen mesajin, "Please enter valid phone number"'a esit oldugunu dogruladim
    And kullanici_yanlis_girdi_ile_kayit_olamadigina_dair_"Please enter valid phone number"_mesaji_alir

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
      # Phone number icin rakam yerine harf girilir
      | ali  | sazan   | adana      | abc-def-ghij | 11.01.2000  | 100-40-0014 | user303  | Pass303. |
      # Phone number icin rakam arasinda cizgi kullanmadan 12 karakter girilir
      | ali  | sazan   | adana      | 012345678914 | 11.01.2000  | 100-40-0015 | user304  | Pass304. |
      # Phone number icin rakamlar arasinda "-" yerine "*" kullanilir
      | ali  | sazan   | adana      | 012*520*6714 | 11.01.2000  | 100-40-0017 | user305  | Pass305. |
      # Phone number icin rakamlar arasinda "-" yerine "." kullanilir
      | ali  | sazan   | adana      | 064.518.6204 | 11.01.2001  | 100-40-0018 | user310  | Pass306. |


  Scenario Outline: TC04_Register_Sayfasi_Phone_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_eksik_phone_ile_kayit_olamayacagina_dair_"Minimum 12 character (XXX-XXX-XXXX)"_mesaji_alir
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular
    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
      # Phone number alanina 11 karakter girilir
      | ali  | sazan   | adana      | 100-400-0013 | 11.01.2001 | 100-40-0019 | user307  | Pass307. |

  Scenario Outline: TC05_Kullanici_Kayitli_Email_Ile_Tekrar_Kayit_Yaptiramaz
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    # Kayitli bir phone ile tekrar kayit olamamali
    And kullanici_unique_olmasi_gereken_bilgi_ile_tekrar_kayit_yaptiramadigini_dogrular
    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      | ali  | sazan   | adana      | 100-400-0030 | 30.09.2010  | 100-40-0012 | user307  | Pass306. |

