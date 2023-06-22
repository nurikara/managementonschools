@lessonProgramGetNegative @api
Feature: Get Negative LessonProgram

  Scenario: Get Negative Lesson Program Validation
    Given send get negative request to url by id
    Then Validate get negative response body