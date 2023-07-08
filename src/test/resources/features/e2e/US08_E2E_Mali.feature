@e2e_us08
Feature: US08 E2E Test (Positive)
  Scenario: ViceDean Add Lesson UI Test
    Given Kullanici  "ViceDean" olarak giriş yapar
    Then Kullanici Lessons basligini tiklar
    Then LessonName alanina "heartgv" ismi girer
    Then Coppulsory checkbox kutusunu tiklar
    Then CreditScore input alanı "11"  deger girer
    Then Submit butonunu tiklar
    Then Basarili kayıtlama mesaji goruntulenir


  Scenario: DataBase Test
    Given DataBase Connection saglanir ve kayitlamasi yapilan dersismi ile ders bilgileri cagrilir
    Then Ders datalarının dogrulugu test edilir


  #post ile olusturulacak data ui da olustu. Dolayısıyla get ile cagırıp doglulayacagız
  Scenario: API Test GetRequest
    Given get request ile olusturulan ders bilgilerini cagirilir
    And gonderilen data ile gelen response datanin dogrulamasi yapilir

  Scenario: API Test DelRequest
    Given LessonId ile DelRequest gonderilir
    And Silinen derse ait datalarin dogrulamasi yapilir
