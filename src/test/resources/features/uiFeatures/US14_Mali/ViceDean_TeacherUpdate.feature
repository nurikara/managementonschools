Feature: US14 Vice Dean Teacher Update


  Scenario:     Login
    Given Kullanici  "ViceDean" olarak giriş yapar


  Scenario: TC01 ViceDean Ogretmen Eklemesi Yapma _POZİTİVE
    Given Kullanici AddTeacher alani inputlarini doldurarak gecerli bir giris yapar
    And gecerli giris mesaji goruntulenir

    #bu senerya üst senaryoya bağımlıdır

  Scenario: TC02 Girilen Ogretmen Bilgilerini Listede Dogrulama
    Given Kullanici Ogretmen Listesi Son Sayfaya Gider
    Then Liste son sirada bulunan ogretmen bilgileri girilen data ile dogrulanir

  @step2
  Scenario: TC03 Girilen Bilgilerin Guncellenmesi
    Given Kullanici Ogretmen Listesi Son Sayfaya Gider
    And Son siradaki ogretmen bilgileri edit butona basar
    Then Acilan pencerede tum input alanlarini gunceller ve submit butona basar
    And Basarili güncelleme mesaji goruntulenir
    And Liste son sırada guncellenen bilgiler goruntulenir


