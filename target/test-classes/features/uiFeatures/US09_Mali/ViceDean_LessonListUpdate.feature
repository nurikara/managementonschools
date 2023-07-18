@all
Feature: US09 Vice Dean Update Lesson
  @first @second @third
  Scenario:   Login
    Given Kullanici  "ViceDean" olarak giriş yapar
  @first
  Scenario:   TC01 are List datas  Display
    Given Kullanici Lessons basligini tiklar
    Then LessonName alanina "vğg" ismi girer
    Then Coppulsory checkbox kutusunu tiklar
    Then CreditScore input alanı "8" int deger girer
    Then Submit butonunu tiklar
    And sayfa iceriginde LessonList goruntulenir
    And LessonList son sayfaya gidilir
    And kayıtlanan son data isim compulsory creditscore kontrol edilir

  @second
  Scenario:   TC02 Lesson data delete
    Given Kullanici Lessons basligini tiklar
    Then LessonName alanina "rhf" ismi girer
    Then Coppulsory checkbox kutusunu tiklar
    Then CreditScore input alanı "7" int deger girer
    Then Submit butonunu tiklar
    And LessonList son sayfaya gidilir
    And Son kayıtlanan data satirinda bulunan delete ikonuna tiklar
    And Ekranda basarili silme mesaji goruntulenir

  @third
  Scenario:   TC03 Lesson data update
    Given Kullanici Lessons basligini tiklar
    And sayfa iceriginde LessonList goruntulenir
    And UPDATE BUTTON yok fail durumu için sayfa resmini alır



