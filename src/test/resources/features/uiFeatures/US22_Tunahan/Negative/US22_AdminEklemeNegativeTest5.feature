@dmr @us22
Feature: US22_Admin_Ekleme
  Scenario: TC06_Kullanici "Doğum tarihi" girmeden Admin eklenmemelidir
    Given kullanici_url'e_gider
    When kullanici_home_page_sayfasindalogin_butonuna_tıklar
    And kullanici_"admin"_password_girer
    And kullanici_login_butonuna_tıklar
    And kullanici_AddAdmin_bölümünü_DogumTarihi_girmeden_doldurur
    And kullanici_AddAdmin_bölümünde_Submit_butonuna basar
    And kullanici_tablonun_son_sayfasina_gelir
    Then kullanici_admin_eklenmedigini_dogrular
