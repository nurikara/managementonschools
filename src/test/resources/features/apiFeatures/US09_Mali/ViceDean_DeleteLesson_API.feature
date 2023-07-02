Feature: US09 Vice Dean Delete Lesson API Test
  Scenario: TC01_ViceDean Delete Lesson
    Given lesson with the name_"film12"_deletes by del request
    And validate the deleted datas with response

