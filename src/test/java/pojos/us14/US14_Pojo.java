package pojos.us14;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US14_Pojo {
    /*
        {
  "birthDay": "yyyy-MM-dd",
  "birthPlace": "string",
  "email": "string",
  "gender": "MALE",
  "isAdvisorTeacher": true,
  "lessonsIdList": [
    1
  ],
  "name": "string",
  "password": "string",
  "phoneNumber": "string",
  "ssn": "string",
  "surname": "string",
  "username": "string"
}
         */
    private String birthDay;
    private String birthPlace;
    private String email;
    private String gender;
    private Boolean isAdviserTeacher;
    private List<Integer> lessonsIdList;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public US14_Pojo() {

    }

    @Override
    public String toString() {
        return "US14_Pojo{" +
                "userId=" + userId +
                '}';
    }

    public US14_Pojo(String birthDay, String birthPlace, String email, String gender, Boolean isAdviserTeacher, List<Integer> lessonsIdList, String name, String password, String phoneNumber, String ssn, String surname, String username) {
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.email = email;
        this.gender = gender;
        this.isAdviserTeacher = isAdviserTeacher;
        this.lessonsIdList = lessonsIdList;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getAdviserTeacher() {
        return isAdviserTeacher;
    }

    public void setAdviserTeacher(Boolean adviserTeacher) {
        isAdviserTeacher = adviserTeacher;
    }

    public List<Integer> getLessonIdList() {
        return lessonsIdList;
    }

    public void setLessonIdList(List<Integer> lessonIdList) {
        this.lessonsIdList = lessonsIdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
