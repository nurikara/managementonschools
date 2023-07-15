
Feature: Aday ogrenciler sisteme kayit olabilmelidir

  Background: Kullanici_Managementon_Sayfasina_Gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    Given kullanici_ilgili_sitenin_sayfasina_gider
    And kullanici_homeRegister_butonuna_tiklar

  Scenario Outline: TC01_Register_Sayfasi_BirthPlace_Alani_Testi_Positive
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_male_olarak_secer
    Then kullanici_register_butonuna_tiklar
     # Gelen mesajin "Guest User registered."'a esit  oldugunu dogruluyorum
    And kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular


    Examples:
      | name | surname | BirthPlace        | Phone        | DateOfBirth | Ssn         | Username | Password |
      #Minimum uzunluk testi
      # Kullanici birth place alanina tek karakter girer, diger alanlari gecerli degerlerle doldurur
      | ali | sazan | h                 | 100-300-0030 | 30.09.2010  | 100-30-0030 | user205  | Pass205. |
      # Kullanici birth place alanina 2 karakter girer, diger alanlari gecerli degerlerle doldurur
      | ali | sazan | ha                | 100-300-0031 | 30.09.2010  | 100-30-0031 | user206  | Pass206. |
      # Maksimum uzunluk testi
      # AC'ye göre minimum karakter sinirlamasi yok.Dolayisi ile kullanici istenilen sayida karakterle kayit olabilmeli
      | ali | sazan | onyedikaraktervar | 100-300-0022 | 09.05.2010  | 100-30-0032 | user207  | Pass207. |
      # Kullanici  kayitli bir birth place ile tekrar kayit olabilmelidir
      | ali | sazan | ha           | 100-300-0033 | 30.06.2010  | 100-10-0033 | user208  | Pass208. |


  Scenario Outline: TC02_Register_Sayfasi_BirthPlace_Alani_Testi_Bosluk
   # Kullanici birth place alanini bos birakir, diger alanlari gecerli bilgilerle doldurur
    When kullanici_cikan_pencerede_verilen_bilgileri_girer "<name>", "<surname>", "<BirthPlace>", "<Phone>", "<DateOfBirth>", "<Ssn>", "<Username>", "<Password>"
    Then kullanici_cinsiyetini_female_olarak_secer
    And kullanici_ilgili_alanin_altinda_"Required"_uyarisini_dogrular
    Then kullanici_register_butonuna_tiklar
      # Kayit basarili oldugunda tüm alanlar temizleniyor
    # Dolayisi ile name haric, herhangi bir alanin hiclige "" esit olmadigini assert ettim
    And kullanici_kayit_yaptiramadigini_dogrular

    Examples:
      | name | surname | BirthPlace | Phone        | DateOfBirth | Ssn         | Username | Password |
       #kullanici birth place alanini bos birakir. Diger alanlari valid degerler ile doldurur
      | ali | sazan |            | 100-300-0034 | 01.05.1987  | 100.30.0034 | user209  | Pass209. |