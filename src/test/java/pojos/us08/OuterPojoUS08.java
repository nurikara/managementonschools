package pojos.us08;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OuterPojoUS08 {
     /*
         "object": {
        "lessonId": 509,
        "lessonName": "hukukgukuk",
        "creditScore": 1,
        "compulsory": true
    },
    "message": "Lesson Created",
    "httpStatus": "OK"
}
         */
    private LessonPojo  object;
    private String  message;
    private String  httpStatus;


}
