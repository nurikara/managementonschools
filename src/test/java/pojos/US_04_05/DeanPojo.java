package pojos.US_04_05;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;


@Data
@NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)

public class DeanPojo {
    private Integer userId;

    private String birthDay;
    private String birthPlace;
    private String gender;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;


    public DeanPojo(Integer userId, String birthDay, String birthPlace, String gender, String name, String password, String phone, String ssn, String surname, String username) {
        this.userId = userId;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.name = name;
        this.password = password;
        this.phoneNumber = phone;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;


    }

    public DeanPojo(int userId) {
        this.userId = userId;

    }



    public DeanPojo(String birthDay, String birthPlace, String gender, String name, String phone, String ssn, String surname, String username) {
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.name = name;
        this.phoneNumber = phone;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;

    }
}
