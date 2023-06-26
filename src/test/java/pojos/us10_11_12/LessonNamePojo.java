package pojos.us10_11_12;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonNamePojo {

    private Integer lessonId;

    private String lessonName;

    private Integer creditScore;

    private Boolean compulsory;

}
