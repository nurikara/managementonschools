package pojos.us14;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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



}
