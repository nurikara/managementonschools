Feature: US08 Vice Dean Add Lesson
  @ilk @iki @uc
  Scenario:   Login
    Given Kullanici  "ViceDean" olarak giriş yapar

  Scenario:   TC01 are List datas  Display
    Given Kullanici Lessons basligini tiklar
    Then LessonName alanina ders ismi girer
    Then Coppulsory checkbox kutusunu tiklar
    Then CreditScore input alanı int deger girer
    Then Submit butonunu tiklar
    And sayfa iceriginde LessonList goruntulenir
    And LessonList son sayfaya gidilir
    And kayıtlanan son data isim compulsory creditscore kontrol edilir
