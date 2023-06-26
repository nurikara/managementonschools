@my
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Name_Alani_Testi_Positive
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
     # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular

    Examples:
      | name              | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
       #Minimum uzunluk testi
       # Kullanici name alanina tek karakter girer, diger alanlari gecerli degerlerle doldurur
      | x                 | sazan   | adana      | 101-102-0030 | 01.08.1997  | 104-12-0030 | usa005  | Passr005. |
      # Kullanici name alanina 2 karakter girer, diger alanlari gecerli degerlerle doldurur
      | xy                | sazan   | adana      | 102-102-0031 | 30.06.2010  | 104-12-0031 | usa006  | Passsr006. |
       # Karakter sinirlamasi AC'de yok. Dolayisi ile kullanici istenilen sayida karakterle kayit olabilmeli
      | onyedikaraktervar | sazan   | adana      | 103-102-0032 | 09.05.2010  | 104-12-0032 | usa007  | Passsr007. |
      # Kullanici  kayitli bir name ile tekrar kayit olabilmelidir
      | xy                | sazan   | adana      | 104-102-0033 | 30.06.2010  | 104-12-0033 | usa008  | Passsr008. |

  Scenario Outline: TC02_Register_Sayfasi_Name_Alani_Testi_Bosluk
    # Kullanici name alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
    # Kayit basarili oldugunda tüm alanlar temizleniyor
    # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
      #kullanici name alanini bos birakir. Diger alanlari valid degerler ile doldurur
      |      | sazan   | adana      | 104-101-0034 | 01.05.1987  | 104.11.0034 | usa009  | Passr009. |





