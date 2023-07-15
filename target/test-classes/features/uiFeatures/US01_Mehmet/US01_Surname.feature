
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_Surname_Alani_Testi_Positive
    Then kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
     # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    Then kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular

    Examples:
      | name | surname           | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
      #Minimum uzunluk testi
      # Kullanici surname alanina tek karakter girer, diger alanlari gecerli degerlerle doldurur
      | ali | x                 | adana      | 100-200-0030 | 30.09.2010  | 100-20-0030 | user105  | Pass105. |
      # Kullanici surname alanina 2 karakter girer, diger alanlari gecerli degerlerle doldurur
      | ali | xy                | adana      | 100-200-0031 | 30.11.2010  | 100-20-0031 | user106  | Pass106. |
      # Maksimum uzunluk testi
      # Karakter sinirlamasi AC'de yok. Dolayisi ile kullanici istenilen sayida karakterle kayit olabilmeli
      | ali | onyedikaraktervar | adana      | 100-200-0032 | 09.05.2010  | 100-20-0032 | user107  | Pass107. |
      # Kullanici  kayitli bir surname ile tekrar kayit olabilmelidir
      | ali | xy                | adana      | 100-100-0033 | 30.06.2010  | 100-10-0033 | user108  | Pass108. |

  Scenario Outline: TC02_Register_Sayfasi_Surname_Alani_Testi_Bosluk
    # Kullanici surname alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
      # Kayit basarili oldugunda tüm alanlar temizleniyor
    # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
       #kullanici surname alanini bos birakir. Diger alanlari valid degerler ile doldurur
      | ali |         | adana      | 100-200-0034 | 01.05.1987  | 100.10.0034 | user109  | Pass109. |





