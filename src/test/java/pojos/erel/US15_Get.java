package pojos.erel;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = false)
public class US15_Get {




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

}
