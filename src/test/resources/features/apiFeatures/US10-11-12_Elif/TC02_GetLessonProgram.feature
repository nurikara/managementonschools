
@lessonProgramId @api
Feature: Get LessonProgram

  Scenario: Get Lesson Program Validation
    Given send get request to url by id
    Then Validate response body

