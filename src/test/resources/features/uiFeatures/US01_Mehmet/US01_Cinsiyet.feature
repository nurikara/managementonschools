
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    Then kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Gender_Alani_Testi_Female_Male_Butonu
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_female_butonunun_secilebildigini_dogrular
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_male_butonunun_secilebildigini_dogrular
    Then kullanici_register_butonuna_tiklar
      # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    Then kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular

    # git

    Examples:
      | name | surname | BirthPlace | Phone | DateOfBirth | Ssn | Username | Password |
      | diga | yildiz | adana | 100-500-0003 | 01-01-1950 | 100-50-0003 | username35 | Password16. |

    Scenario Outline: TC01_Register_Sayfasi_Gender_Alani_Testi_Bosluk
      When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
      Then kullanici_register_butonuna_tiklar
       # Kayit basarili oldugunda tüm alanlar temizleniyor
       # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
      And kullanici_kayit_yaptiramadigini_dogrular
      Examples:
        | name | surname | BirthPlace | Phone | DateOfBirth | Ssn | Username | Password |
        | osman | yildiz | adana | 100-500-0004 | 01-01-1951 | 100-50-0004 | username36 | Password17. |

