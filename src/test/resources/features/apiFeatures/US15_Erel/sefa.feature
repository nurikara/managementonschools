@US18_APITest
Feature:Teacher ogrenciye verdigi notlari gorebilmelidir

  Scenario Outline: US18_Verilen notlari goruntuleme
    Given student info icin post request yap "<absentee>","<educationTermId>","<finalExam>","<infoNote>","<lessonId>","<midtermExam>","<studentId>"
    Then student info bodyi dogrula
    Examples:
      | absentee | educationTermId | finalExam | infoNote    | lessonId | midtermExam | studentId |
      | absentee | educationTermId | finalExam | infoNote    | lessonId | midtermExam | studentId |