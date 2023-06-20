package pojos.us10_11_12;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonNamePojo {

    private Integer lessonId;
    private String lessonName;
    private Integer creditScore;
    private Boolean compulsory;

    public LessonNamePojo() {
    }

    public LessonNamePojo(Integer lessonId, String lessonName, Integer creditScore, Boolean compulsory) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.compulsory = compulsory;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Boolean getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        this.compulsory = compulsory;
    }

    @Override
    public String toString() {
        return "LessonNamePojo{" +
                "lessonId=" + lessonId +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", compulsory=" + compulsory +
                '}';
    }

}
