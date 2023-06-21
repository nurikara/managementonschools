package pojos.US08;

public class LessonPojo {
     private String lessonName;
     private Boolean compulsory;
     private String creditScore;

    public LessonPojo() {
    }

    public LessonPojo(String lessonName, Boolean compulsory, String creditScore) {
        this.lessonName = lessonName;
        this.compulsory = compulsory;
        this.creditScore = creditScore;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Boolean getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        this.compulsory = compulsory;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "LessonPojo{" +
                "lessonName='" + lessonName + '\'' +
                ", compulsory=" + compulsory +
                ", creditScore='" + creditScore + '\'' +
                '}';
    }
}
