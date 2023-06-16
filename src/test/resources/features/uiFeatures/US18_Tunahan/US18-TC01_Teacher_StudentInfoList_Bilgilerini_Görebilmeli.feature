
Feature: US18_Teacher_ogrenci_notlarini_gorebilmeli_güncelleyebilmeli

  Scenario: TC01_Teacher_StudentInfoList_Bilgilerini_Görebilmeli

    Given kullanici_url'e_gider
    When kullanici_home_page_sayfasindalogin_butonuna_tıklar
    And kullanici_"teacher"_password_girer
    And kullanici_login_butonuna_tıklar
    Then kullanici_Student_Info_List_gorunurlugunu_dogrular
    And kullanici_sayfayi_kapatır




