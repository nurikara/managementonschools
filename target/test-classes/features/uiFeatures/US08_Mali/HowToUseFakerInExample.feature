Feature: How to use faker ın Example
  Scenario Outline: fill the inputs with faker
    Given user login as "viceDean"
    And fill all the inputs with faker "<lessonName>"_ "<creditScore>"
    Examples:
      | lessonName        | creditScore        |
      | <fake.lessonName> | <fake.creditScore> |
