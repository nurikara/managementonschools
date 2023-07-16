
Feature: TC01 : Toplantıların, Date, Start Time, Stop Time ve Description görülmeli

  Background:
    Given Kullanici_"https://managementonschools.com/"_sitesine gider
    When Kullanici_LOG_IN'e_tiklar
    And Kullanici_gecerli_Teacher_olarak_Username_ve_Password'u_girer
    And Sag_ustteki_Menu_butonuna_tiklar
    And Menu'de_Meet_Management'a_tiklar


  @us20tc01
  Scenario: Teacher Toplantıların, Date, Start Time, Stop Time ve Description görebilmeli
    Then Meet_Management_bolumunde_Toplantıların_Date_Start_Time_Stop_Time_ve_Description'larin_oldugunu_kontrol_eder
    Then sayfa kapatilir

  @us20tc02
    Scenario: Toplantilari Gunceleyebilmeli
      And Olusturulan bir toplanti bulunur ve edit’e tiklanir
      And Acilan bolumde Choose Student, Date Of Meet, Start Time, Stop Time ve Description guncellenir
      Then Submit butonuna tiklanir degisiklikler kaydedilir
      Then sayfa kapatilir


  @us20tc03
    Scenario: Toplantilari silebilmeli
    Then Sayfa’da sag altta bulunan cop tenekesine tiklar.
    Then sayfa kapatilir





