
  Feature: US-17 Teacher öğrencilere not verebilmeli
    Scenario: Login
      Given Kullanici  "teacher" olarak giriş yapar
@teacher01
Scenario Outline:Teacher ,ders,öğrenci ve dönem seçebilmelidir
      And  Kullanıcı "Choose Lesson" alanını tıklar
      And Kullanıcı 2 saniye bekler
      And  Kullanıcı Choose Lesson alanında açılan derslerden birini seçer
      And  Kullanıcı "Choose Student" alanını tıklar
      And  Kullanıcı "Choose Student" alanında açılan öğrencilerden birini seçer
      And  Kullanıcı "Choose Education Term" alanını tıklar
      And  Kullanıcı "Choose Education Term" alanında açılan dönemlerden birini seçer
      And Kullanıcı 2 saniye bekler
      When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
      Then Kullanıcı "Submit" alanını tıklar
      And Kullanıcı sayfayı kapatır
  Examples:
    | absentee | miditerm exam | final exam | info note |
    | 8        |    85          |    75     |Basarilar Dilerim|











Scenario Outline:
  And Kullanıcı "Absentee"  alanına devamsızlık girer
  And Kullanıcı "Choose Lesson","Choose Student","Choose Education Term","Miditerm Exam","Final Exam","Info Note" alanlarını uygun şekilde doldurur
  Then Kullanıcı "Submit" alanını tıklar
  And Kullanıcı sayfayı kapatır