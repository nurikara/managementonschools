
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_DateOfBirth_Alani_Testi_Positive
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular
    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      #Kullanici valid bir dogum tarihi girer
      | ali  | sazan  | adana    | 100-600-0030 | 01.08.1967  | 100-60-0030 | user502  | Pass502. |
      # Leap year kontrolü
      | ali | sazan  | adana      | 100-600-0031 | 29.02.2004  | 100-60-0031 | user503  | Pass503. |

  Scenario Outline: TC02_Register_Sayfasi_DateOfBirth_Alani_Testi_Bosluk
    # Kullanici DateOfBirth alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular
    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      | ali | sazan  | adana      | 100-600-0032 |             | 100-60-0013 | user502  | Pass507. |

  Scenario Outline: TC03_Register_Sayfasi_DateOfBirth_Alani_Testi_Negative
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    Then kullanici_register_butonuna_tiklar
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name  | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password   |
      # Kullanici dogum tarihi olarak gelecek tarih girer
      | ali | sazan  | adana      | 100-600-0033 | 01.01.2050  | 100-60-0032 | user503  | Pass500. |
      # Kullanici dogum tarihi olarak izin verilenden daha gecmis bir tarih girer
      | ali | sazan  | adana      | 100-600-0034 | 01.01.1500  | 100-60-0033 | user508  | Pass508. |
      # Subat ayi kontrolu
      | ali | sazan  | adana      | 100-600-0035 | 31.02.2000  | 100-60-0034 | user505  | Pass502. |
      # Leap year   kontrolu negativ
      | ali | sazan  | adana      | 100-600-0036 | 29.02.2001  | 100-60-0035 | user506  | Pass503. |


    Scenario Outline: TC03_Register_Sayfasi_DateOfBirth_Alani_Yil_Testi_Positive
      Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
      And kullanici_yil_kismina_sadece_4_karakter_girebildigini_dogrular

      Examples:
        | name | surname | BirthPlace | Phone | DateOfBirth | Ssn | Username | Password |
        | ali | sazan | adana | 100-600-0037 | 01-01-196402 | 100-60-0136 | user507 | Pass509. |



