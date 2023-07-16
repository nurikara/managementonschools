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
public class US14_Pojo_Outer {
    private String message;
    private String httpStatus;
    private US14_Pojo object;


}
