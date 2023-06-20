package pojos.us10_11_12;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectPojo {

    private Integer lessonProgramId;
    private String startTime;
    private String stopTime;
    private ArrayList<LessonNamePojo> lessonName;
    private String day;

    public ObjectPojo() {
    }

    public ObjectPojo(Integer lessonProgramId, String startTime, String stopTime, ArrayList<LessonNamePojo> lessonName, String day) {
        this.lessonProgramId = lessonProgramId;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
        this.day = day;
    }

    public Integer getLessonProgramId() {
        return lessonProgramId;
    }

    public void setLessonProgramId(Integer lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
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

    public ArrayList<LessonNamePojo> getLessonName() {
        return lessonName;
    }

    public void setLessonName(ArrayList<LessonNamePojo> lessonName) {
        this.lessonName = lessonName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ObjectPojo{" +
                "lessonProgramId=" + lessonProgramId +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", lessonName=" + lessonName +
                ", day='" + day + '\'' +
                '}';
    }
}
