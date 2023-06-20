package pojos.us10_11_12;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonPostPojo {

    private String day;
    private Integer educationTermId;
    private List<Integer> lessonIdList;
    private String startTime;
    private String stopTime;

    public LessonPostPojo() {
    }

    public LessonPostPojo(String day, Integer educationTermId, List<Integer> lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(Integer educationTermId) {
        this.educationTermId = educationTermId;
    }

    public List<Integer> getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(List<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public String toString() {
        return "LessonPostPojo{" +
                "day='" + day + '\'' +
                ", educationTermId=" + educationTermId +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                '}';
    }

}
