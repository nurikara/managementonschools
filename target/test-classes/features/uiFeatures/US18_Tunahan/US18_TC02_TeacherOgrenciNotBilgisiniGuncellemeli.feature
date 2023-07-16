@dmr @us18
Feature: US18_Teacher_ogrenci_notlarini_gorebilmeli_güncelleyebilmeli
  Scenario: TC02_Teacher_not_bilgisini_guncelleyebilmeli

    Given kullanici_url'e_gider
    When kullanici_home_page_sayfasindalogin_butonuna_tıklar
    And kullanici_"teacher"_password_girer
    And kullanici_login_butonuna_tıklar
    And kullanici_ogrenci_edit_butonuna_tıklar
    And kullanici_ogrenci_bilgilerini_gunceller_ve_submit_butonuna_tıklar
    And kullanici_edit_ekranini_kapatir_
    Then kullanici_ogrenci_not_bilgisinin_guncellendigini_dogrular



