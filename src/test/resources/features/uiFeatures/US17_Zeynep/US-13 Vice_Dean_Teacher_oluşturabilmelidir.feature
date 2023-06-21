

Feature: US-13 Vice Dean, Teacher oluşturabilmeli
  Background:Login
    Given Kullanici  "vicedean" olarak giriş yapar
    And Kullanıcı "menü" alanını tıklar
    And Kullanıcı "teacher management" alanını tıklar
    And  Kullanıcı Vice Dean olarak Choose Lesson alanını tıklar
    And Kullanıcı 2 saniye bekler



    Scenario: TC-01 Vice Dean öğretmenin gireceği dersi seçebilmeli
      Then Kullanıcı Choose Lessons alanını tıklayarak çıkan listeden ders seçimini yapar
      And Kullanıcı ders seçildiğini  doğrular
      And sayfa kapatılır



      Scenario Outline: TC-02 Vice Dean name girmelidir,boş bırakılamaz
When Kullanıcı name alanını boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ve "<Password>"
        And Kullanıcı is Advisor Teacher alanını tıklar
        And Kullanıcı Gender alanından cinsiyet seçer
        Then Kullanıcı "submit" alanını tıklar
        Examples:
          | Name | Surname | Birth Place | e-mail | phone | Date of Birth | User Name | Password |
          |       | Can    |   İzmir     |Ali11!@gmail.com|555-658-9874|24021998|Ali Can|Ali1234.|












