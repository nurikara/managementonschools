@US15ApiPost @Api
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario Outline: US15_StudentManagement

    Given VİCE DEAN student icin post request yap "<advisorTeacherId>", "<birthDay>", "<birthPlace>", "<email>", "<fatherName>", "<gender>", "<motherName>","<name>","<surname>","<phoneNumber>","<ssn>","<username>","<password>"
    Then VİCE DEAN body i dogrula
    Examples:
      | advisorTeacherId | birthDay | birthPlace | email | fatherName | gender | motherName | name | surname | phoneNumber | ssn | username | password |
      | advisorTeacherId | birthDay | birthPlace | email | fatherName | gender | motherName | name | surname | phoneNumber | ssn | username | password |


  Scenario: US15_StudentManagement
    Given VİCE DEAN send get request to url by id_
    Then VİCE DEAN Validate response body_

  Scenario: US15_StudentManagement
    Given VİCE DEAN send DEL request to url by id_
    Then VİCE DEAN Validate DEL response body_



