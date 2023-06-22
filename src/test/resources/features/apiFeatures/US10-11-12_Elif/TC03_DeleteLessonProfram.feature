@lessonProgramDeleteId @api
Feature: Delete LessonProgram

  Scenario: Delete Lesson Program Validation
    Given send delete request to url by id
    Then Validate delete response body
