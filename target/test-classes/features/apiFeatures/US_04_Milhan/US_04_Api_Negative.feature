@US_04_Negative @api_mi
Feature: US04 Create Dean By API


  Scenario Outline: TC01_Create_Dean_Negative
    Given send post request for creating room "<birthDay>", "<birthPlace>", "<gender>", "<name>", "<passsword>", "<phoneNumber>", "<ssn>","<surname>","<username>"
    Examples:
      | birthDay | birthPlace | gender | name | passsword | phoneNumber | ssn | surname | username |
      |          | birthPlace | gender | name | passsword | phoneNumber | ssn | surname | username |
      | birthDay |            | gender | name | passsword | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace |        | name | passsword | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace | gender |      | passsword | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace | gender | name |           | phoneNumber | ssn | surname | username |
      | birthDay | birthPlace | gender | name | passsword |             | ssn | surname | username |
      | birthDay | birthPlace | gender | name | passsword | phoneNumber |     | surname | username |
      | birthDay | birthPlace | gender | name | passsword | phoneNumber | ssn |         | username |
      | birthDay | birthPlace | gender | name | passsword | phoneNumber | ssn | surname |          |






