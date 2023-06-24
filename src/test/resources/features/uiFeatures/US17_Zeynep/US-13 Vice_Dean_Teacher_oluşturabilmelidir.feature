
@us13
Feature: US-13 Vice Dean, Teacher oluşturabilmeli
  Background:Login
    Given Kullanici  "vicedean" olarak giriş yapar
    And Kullanıcı "menü" alanını tıklar
    And Kullanıcı "teacher management" alanını tıklar
    And Kullanıcı 2 saniye bekler
    And  Kullanıcı Vice Dean olarak Choose Lesson alanını tıklar
    And Kullanıcı 2 saniye bekler
    Then Kullanıcı Choose Lessons alanını tıklayarak çıkan listeden ders seçimini yapar






    Scenario: TC-01 Vice Dean öğretmenin gireceği dersi seçebilmeli
      And Kullanıcı ders seçildiğini  doğrular
      And sayfayi kapatir



      Scenario Outline: TC-02 Vice Dean name girmelidir,boş bırakılamaz
      When Kullanıcı name alanını boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
        And Kullanıcı is Advisor Teacher alanını tıklar
        And Kullanıcı Gender alanından cinsiyet seçer
        Then Kullanıcı "submit" alanını tıklar
        And Kullanıcı requared yazısını görür
        And sayfayi kapatir
        Examples:
          | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
          |      |   Can  | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-03 Vice Dean surname girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir

    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-04 Vice Dean Birth Place girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |      | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-05 Vice Dean email girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |   Izmir   |                    | 357-598-5896 | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-06 Vice Dean phone girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |              | 14021998      | Ali Can   | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-09 Vice Dean doğum tarihi girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 |               | Ali Can   | 125-52-1265 | AliC123. |


  Scenario Outline: TC-10 SSN girilmelidir.SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz

    When Kullanıcı istenilen alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı Teacher saved succesfully yazısı görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 |      14021998         | Ali Can   | 125-52-1265 | AliC123. |


  Scenario Outline: TC-11 SSN girilmelidir.SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz
    When Kullanıcı istenilen alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   |     | AliC123. |


  Scenario Outline: TC-11-b SSN girilmelidir.SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz
    When Kullanıcı istenilen alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Ssn bölümüne minimum onbir karakter girilmesi gerektiği uyarısı verir
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn | Password |
      | Ali  | Can     | Izmir       | AliC123!@gmail.com | 357-598-5896 | 14021998      | Ali Can   |  125521265   | AliC123. |

  Scenario Outline: TC-12 Vice Dean User Name girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    And Kullanıcı requared yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |           | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-13 Vice Dean User Name girmelidir,boş bırakılamaz
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı Teacher saved succesfully yazısı görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali      | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-14 Vice Dean Password girebilmelidir. Password en az 8 karakterden oluşmalıdır
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı Teacher saved succesfully yazısı görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali  Can    | 125-52-1265 | AliC123.   |


  Scenario Outline: TC-14-b Vice Dean Password girebilmelidir. Password en az 8 karakterden oluşmalıdır
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı minimum sekiz karakter uyarısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali      | 125-52-1265 | AliC123   |

  Scenario Outline: TC-15 Password; büyük harf, küçük harf ve bir rakam içermelidir.
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı Teacher saved succesfully yazısı görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali Can     | 125-52-1265 | AliC123.   |

  Scenario Outline: TC-16 Password; büyük harf, küçük harf ve bir rakam içermelidir.
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı büyük harf girmeyince please enter valid email uyarı yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali Can     | 125-52-1265 | alic123.   |

  Scenario Outline: TC-17 Password; büyük harf, küçük harf ve bir rakam içermelidir.
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı küçük harf girmeyince please enter valid email uyarı yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali Can     | 125-52-1265 | ALİC123.   |


  Scenario Outline: TC-18 Password; büyük harf, küçük harf ve bir rakam içermelidir.
    When Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur "<Name>", "<Surname>", "<Birth Place>","<e-mail>", "<phone>","<Date of Birth>", "<User Name>" ,"<Ssn>"ve "<Password>"
    And Kullanıcı is Advisor Teacher alanını tıklar
    And Kullanıcı Gender alanından cinsiyet seçer
    Then Kullanıcı "submit" alanını tıklar
    Then Kullanıcı rakam girmeyince please enter valid email uyarı yazısını görür
    And sayfayi kapatir
    Examples:
      | Name | Surname | Birth Place | e-mail             | phone        | Date of Birth | User Name | Ssn         | Password |
      |  Ali    |   Can  |  Izmir    | AliC123!@gmail.com |   357-598-5896 | 14021998    |   Ali Can     | 125-52-1265 | alicanali.   |
