@mali
Feature: US08 Lesson Create API test
  Scenario Outline: TC01 ViceDean Create Lesson
    Given create lesson with_"<lessonName>"_"<compulsory>"_"<creditScore>"_datas_by post request
    And verify the response datas with posted
    Examples:
      | lessonName | compulsory | creditScore |
      | mtf01      | true       | 4           |
