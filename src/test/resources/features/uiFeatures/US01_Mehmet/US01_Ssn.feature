
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Ssn_Alani_Testi
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular
    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username   | Password    |
      # Kullanici formata uygun ssn numarasi girer
      | ali | sazan  | adana      | 100-700-0011 | 01-09-2001  | 100-70-0030 | user709 | Pass709. |
      # Kullanici 12 karakter girer
      | ali | sazan  | adana      | 100-700-0012 | 01-09-2011  | 100-70-00031 | user701 | Pass701. |

  Scenario Outline: TC02_Register_Sayfasi_SSN_Alani_Testi_Bosluk
    # Kullanici ssn alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular
    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn | Username   | Password    |
      | ali | sazan  | adana      | 100-700-0013 | 01.06.2008  |     | user702 | Pass702. |


  Scenario Outline: TC03_Register_Sayfasi_Ssn_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username   | Password    |
      # Kullanici "-" yerine "." kullanir
      | ali | sazan  | adana      | 100-700-0030 | 01-09-2011  | 100.70.0013 | user703 | Pass703. |
      # Kullanici "-" i yanlis yerde kullanir
      | ali | sazan  | adana      | 100-700-0031 | 01-09-2011  | 10-0700-014 | user704 | Pass704. |
      # Kullanici harf girer
      | ali | sazan  | adana      | 100-700-0032 | 01-09-2011  | aaa-bb-cccc | user705 | Pass705. |


  Scenario Outline: TC04_Register_Sayfasi_Ssn_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_eksik_ssn_ile_kayit_olamayacagina_dair_"Minimum 11 character (XXX-XX-XXXX)"_mesaji_alir
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular
    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username   | Password    |
      # Kullanici 10 karakter girer
      | ali | sazan  | adana      | 100-700-0034 | 01-09-2011  | 100-70-005 | user707 | Pass707. |

  Scenario Outline: TC05_Kullanici_Kayitli_Ssn_Ile_Tekrar_Kayit_Yaptiramaz
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    # Kayitli bir ssn number ile tekrar kayit olamamali
    And kullanici_unique_olmasi_gereken_bilgi_ile_tekrar_kayit_yaptiramadigini_dogrular
    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      | ali  | sazan   | adana      | 100-700-0035 | 30.09.2010  | 100-70-0030 | user708  | Pass708. |