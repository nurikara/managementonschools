package pojos.erel;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class US15_Pojo {

    private int advisorTeacherId;

    private String birthDay;
    private String birthPlace;
    private String email;
    private String fatherName;
    private String gender;


    private String motherName;
    private String name;
    private String surname;

    private String phoneNumber;
    private String ssn;
    private String username;
    private String password;
   @JsonIgnore
    private int userId;
    @JsonIgnore
    private int studentNumber;
    @JsonIgnore
    private String active;



//    "advisorTeacherId": 1,
//            "birthDay": "1999-06-27",
//            "birthPlace": "ankara",
//            "email": "asdf@gmail.com",
//            "fatherName": "string",
//            "gender": "MALE",
//            "motherName": "string",
//            "name": "str",
//            "password": "str00123g",
//            "phoneNumber": "567-365-7423",
//            "ssn": "294-65-9866",
//            "surname": "string",
//            "username
}
