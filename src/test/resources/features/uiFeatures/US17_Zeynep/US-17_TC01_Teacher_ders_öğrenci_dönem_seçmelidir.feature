
  Feature: US-17 Teacher öğrencilere not verebilmeli
    Background:Login
      Given Kullanici  "teacher" olarak giriş yapar
      And  Kullanıcı "Choose Lesson" alanını tıklar
      And Kullanıcı 2 saniye bekler
      And  Kullanıcı Choose Lesson alanında açılan derslerden birini seçer
      And  Kullanıcı "Choose Student" alanını tıklar
      And  Kullanıcı "166" alanında açılan öğrencilerden birini seçer
      And  Kullanıcı "Choose Education Term" alanını tıklar
      And  Kullanıcı "10" alanında açılan dönemlerden birini seçer
      And Kullanıcı 2 saniye bekler




@teacher01
Scenario Outline:Teacher ,ders,öğrenci ve dönem seçebilmelidir
      And Kullanıcı ders öğrenci ve dönem seçebildiğini görür
      When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
      Then Kullanıcı "Submit" alanını tıklar
      And Kullanıcı sayfayı kapatır
  Examples:
    | absentee | miditerm exam | final exam | info note |
    | 8        |    85          |    75     |Basarilar Dilerim|


    @teacher02
    Scenario Outline:Teacher,Devamsızlık girebilmelidir
      When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
      And Kullanıcı "<absentee>" alanına girilen değeri doğrular
      Then Kullanıcı "Submit" alanını tıklar
      And Kullanıcı sayfayı kapatır
      Examples:
        | absentee | miditerm exam | final exam | info note |
        |      6   |    85          |    75     |Basarilar Dilerim|


    @teacher03
    Scenario Outline:Teacher,Midterm ve Final Exam notu girebilmelidir
      When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
      And Kullanıcı "<miditerm exam>" alanına girilen değeri doğrular
      And Kullanıcı "<final exam>" alanına girilen değeri doğrular
      Then Kullanıcı "Submit" alanını tıklar
      And Kullanıcı sayfayı kapatır

      Examples:
        | absentee | miditerm exam | final exam | info note |
        |      6   |    85          |    75     |Basarilar Dilerim|

    @teacher04
    Scenario Outline:Teacher,Öğrenci hakkında info notu girebilmelidir
      When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
      And Kullanıcı "<info note>" alanına girilen değeri doğrular
      Then Kullanıcı "Submit" alanını tıklar
      And Kullanıcı sayfayı kapatır

      Examples:
        | absentee | miditerm exam | final exam | info note |
        |      6   |    85          |    75     |Basarilar Dilerim|


    @teacher05
    Scenario Outline:Teacher,Öğrenci hakkında info notu girebilmelidir
      When Kullanıcı gerekli alanları doldurur "<absentee>","<miditerm exam>","<final exam>","<info note>"
      Then Kullanıcı "Submit" alanını tıklar
      And Kullanıcı başarılı bir şekilde not girişi yapar
      And Kullanıcı sayfayı kapatır

      Examples:
        | absentee | miditerm exam | final exam | info note |
        |      6   |    85          |    75     |Tebrikler|



