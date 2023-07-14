@ApiUS_23 @Api_Nuri
Feature: Admin, Vice Dean hesabı oluşturabilmelidir.

  Scenario Outline: : Admin bazi degerleri eksik yollar
    Then Admin validate "<birthDay>", "<birthPlace>", "<gender>", "<name>", "<passsword>", "<phoneNumber>", "<ssn>","<surname>","<username>"
    Examples:
      | birthDay | birthPlace | gender | name | passsword | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace | gender |      | passsword | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace | gender | name | passsword | phoneNumber | ssn |         | username |
      | birthDay |            | gender | name | passsword | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace |        | name | passsword | phoneNumber | ssn | surname | username |
      |          | birthPlace | gender | name | passsword |             | ssn | surname | username |
      | birthDay | birthPlace | gender | name | passsword | phoneNumber |     | surname | username |
      | birthDay | birthPlace | gender | name | passsword | phoneNumber | ssn | surname |          |
      | birthDay | birthPlace | gender | name |           | phoneNumber | ssn | surname | username |