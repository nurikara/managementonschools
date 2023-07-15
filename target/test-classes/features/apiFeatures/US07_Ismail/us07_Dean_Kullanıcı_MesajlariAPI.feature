Feature:  US07_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir_API

  Scenario Outline: US01_GuestUser

    Given kullanici mesajlar icin get request yapar
    Then kullanici gelen bodyi validate eder "<name>", "<email>", "<subject>", "<message>", "<date>"
    Examples:
      | name    | email             | subject | message       | date       |
      | aliveli | aliveli@gmail.com | apitest   | merhaba | 2023-07-08 |

