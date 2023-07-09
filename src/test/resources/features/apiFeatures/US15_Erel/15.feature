@US15ApiPost @Api
Feature:  Aday öğrenciler sisteme kayıt olabilmelidir. API

  Scenario Outline: US15_StudentManagement

    Given student icin post request yap "<advisorTeacherId>", "<birthDay>", "<birthPlace>", "<email>", "<fatherName>", "<gender>", "<motherName>","<name>","<surname>","<phoneNumber>","<ssn>","<username>","<password>"
    Then bodyi dogrula
    Examples:
      | advisorTeacherId | birthDay | birthPlace | email | fatherName | gender | motherName | name | surname | phoneNumber | ssn | username | password |
      | advisorTeacherId | birthDay | birthPlace | email | fatherName | gender | motherName | name | surname | phoneNumber | ssn | username | password |






