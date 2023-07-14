@ApiUS_06 @Api_Nuri
Feature: Dean, Vice Dean hesabı oluşturabilmelidir.

  Scenario Outline: : Kullanici bazi degerleri eksik yollar
    Then validate "<birthDay>", "<birthPlace>", "<gender>", "<name>", "<passsword>", "<phoneNumber>", "<ssn>","<surname>","<username>"
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