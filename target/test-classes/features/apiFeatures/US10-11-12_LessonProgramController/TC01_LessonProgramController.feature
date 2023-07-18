@lessonProgram @api
Feature: Create Lesson Program By API

  Scenario: TC01_Create_LessonProgram

    Given send post request for lesson program
    Then get the response and validate

  @lessonProgramId @api

  Scenario: Get Lesson Program Validation
    Given send get request to url by id
    Then Validate response body


  @lessonProgramDeleteId @api

  Scenario: Delete Lesson Program Validation
    Given send delete request to url by id
    Then Validate delete response body


  @lessonProgramGetNegative @api

  Scenario: Get Negative Lesson Program Validation
    Given send get negative request to url by id
    Then Validate get negative response body