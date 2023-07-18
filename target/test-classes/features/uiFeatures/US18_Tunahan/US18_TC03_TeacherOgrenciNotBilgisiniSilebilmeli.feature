@dmr @us18
Feature: US18_Teacher_ogrenci_notlarini_gorebilmeli_güncelleyebilmeli

  Scenario: TC03_Teacher_ogrenci_not_bilgisin_silebilmeli
    Given kullanici_url'e_gider
    When kullanici_home_page_sayfasindalogin_butonuna_tıklar
    And kullanici_"teacher"_password_girer
    And kullanici_login_butonuna_tıklar
    And kullanici_StudentInfoLıstdeki_delete_butonunun_gorunurlugunu_dogrular
    And kullanici_delete_butonuna_basar
    Then kullanici_ogrencinin_not_bilgilerinin_silindigini_dogrular
