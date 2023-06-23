Feature: Create Lesson Program By API
  Scenario Outline: TC01_CreateStudentbyVice

    Given send post request for student
    Then gelen bodyi dogrula "<birthDay>", "<birthPlace>", "<gender>", "<name>", "<password>", "<phoneNumber>", "<ssn>","<surname>","<username>"
    Examples:
      | birthDay | birthPlace | gender | name | password | phoneNumber | ssn | surname | username |
      | birthDay | alaska | Male | murtaza | 12345678 | 999-888-7700 | 111-22-3333 | yılmaz | tester |





