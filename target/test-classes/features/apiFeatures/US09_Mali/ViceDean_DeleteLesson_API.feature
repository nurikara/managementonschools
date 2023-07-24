@us09api
Feature: US09 Vice Dean Delete Lesson API Test
  Scenario: TC01_ViceDean Delete Lesson
    Given lesson with the name_"mtfjh5"_deletes by del request
    And Verify the deleted datas with response

