package pojos.us10_11_12;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonPostPojo {

    private String day;

    private Integer educationTermId;

    private List<Integer> lessonIdList;

    private String startTime;

    private String stopTime;


}
