package pojos.us08;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonPojo {


     private String lessonName;
     private String compulsory;
     private String creditScore;
     private Integer lessonId;



}
