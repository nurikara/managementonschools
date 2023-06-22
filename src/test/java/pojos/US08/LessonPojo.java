package pojos.US08;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonPojo {


     private String lessonName;
     private String compulsory;
     private String creditScore;
     private String lessonId;

    public LessonPojo() {
    }

    public LessonPojo(String lessonName, String compulsory, String creditScore, String lessonId) {
        this.lessonName = lessonName;
        this.compulsory = compulsory;
        this.creditScore = creditScore;
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(String compulsory) {
        this.compulsory = compulsory;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    @Override
    public String toString() {
        return "LessonPojo{" +
                "lessonName='" + lessonName + '\'' +
                ", compulsory='" + compulsory + '\'' +
                ", creditScore='" + creditScore + '\'' +
                ", lessonId='" + lessonId + '\'' +
                '}';
    }
}
