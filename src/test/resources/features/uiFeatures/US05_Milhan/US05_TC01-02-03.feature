@US05_ED
Feature: US05_Admin Dean'leri görebilmeli ve silebilmeli

  Background:
    Given Kullanıcı "url"ye gider
    Then Kullanıcı logine tıklar
    And Kullanıcı username ve password yazar
    And Kullanıcı Login butonuna tıklar
    Then Kullanıcı Menu'den Dean Management sayfasına gider

  Scenario: TC01 Admin Dean'leri Silebilmeli
    And Kullanıcı açılan sayfada silme butonuna tıklar

  Scenario: TC02 Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeli
    And Açılan Dean Management Sayfasında Dean Listin altında Deanlerin Name, Gender, Phone Number, SSN, User Name bilgilerinin olduğunu görebilmeli

  Scenario: TC03 Admin Dean'leri günceleyebilmeli
    And Oluşturulan Dean List'ten bir tanesin yanındaki Edit Butonuna tıklar
    And Seçilen Deanın  Name, Surname, Birth Place,  Gender, Date Of Birth,  Phone Number, SSN, User Name ve Password'unu değiştirir ve Submit butonuna tıklar
    And Kullanıcı Dean updated Successful yazısının cıktığını görür