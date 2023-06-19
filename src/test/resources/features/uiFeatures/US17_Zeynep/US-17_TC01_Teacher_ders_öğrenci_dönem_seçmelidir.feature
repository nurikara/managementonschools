
  Feature: US-17 Teacher öğrencilere not verebilmeli
    Scenario: Login
      Given Kullanici  "teacher" olarak giriş yapar


      And  Kullanıcı "Choose Lesson" alanını tıklar
      And  Kullanıcı "Choose Lesson" alanında açılan derslerden birini seçer
      And  Kullanıcı "Choose Student" alanını tıklar
      And  Kullanıcı "Choose Student" alanında açılan öğrencilerden birini seçer
      And  Kullanıcı "Choose Education Term" alanını tıklar
      And  Kullanıcı "Choose Education Term" alanında açılan dönemlerden birini seçer
      And Kullanıcı "Absentee","Miditerm Exam","Final Exam","Info Note" alanlarını uygun şekilde doldurur
      Then Kullanıcı "Submit" alanını tıklar