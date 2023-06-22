

Feature: US-13 Vice Dean, Teacher oluşturabilmeli
  Background:Login
    Given Kullanici  "vicedean" olarak giriş yapar
    And Kullanıcı "menü" alanını tıklar
    And Kullanıcı "teacher management" alanını tıklar
    And Kullanıcı 2 saniye bekler
    And  Kullanıcı Vice Dean olarak Choose Lesson alanını tıklar




    Scenario: TC-01 Vice Dean öğretmenin gireceği dersi seçebilmeli
      And Kullanıcı 2 saniye bekler
      Then Kullanıcı Choose Lessons alanını tıklayarak çıkan listeden ders seçimini yapar
      And Kullanıcı 2 saniye bekler
      And Kullanıcı ders seçildiğini  doğrular
      And sayfa kapatılır



      Scenario Outline: TC-02 Vice Dean name girmelidir,boş bırakılamaz
      When Kullanıcı name alanını boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
        And Kullanıcı is Advisor Teacher alanını tıklar
        And Kullanıcı Gender alanından cinsiyet seçer
        Then Kullanıcı "submit" alanını tıklar
        And Kullanıcı requared yazısını görür
        And sayfa kapatılır
        Examples:
          | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
          |      | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123. |
          | Ali  |         | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123. |
          | Ali  | Can     |             | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123. |
          | Ali  | Can     | Izmir       |                    | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123. |
          | Ali  | Can     | Izmir       | AliC123!@gmail.com |              | 14021998      | Ali Can   | 125-52-1265 | AliC123. |



  Scenario Outline: TC-03 Vice Dean surname girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfa kapatılır

    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-04 Vice Dean Birth Place girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |      | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-05 Vice Dean email girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |   Izmir   |                    | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-06 Vice Dean phone girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |              | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-09 Vice Dean doğum tarihi girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 |               | Ali Can   | 125-52-1265 | AliC123. |


  Scenario Outline: TC-10 SSN girilmelidir.SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı Teacher saved succesfully yazısı görür
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 |      14021998         | Ali Can   | 125-52-1265 | AliC123. |


  Scenario Outline: TC-11 SSN girilmelidir.SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   |     | AliC123. |


  Scenario Outline: TC-11 SSN girilmelidir.SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Ssn bölümüne minimum onbir karakter girilmesi gerektiği uyarısı verir
    And sayfa kapatılır
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   |  125521265   | AliC123. |




