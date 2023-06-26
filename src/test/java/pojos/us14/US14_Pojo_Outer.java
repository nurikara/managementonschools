package pojos.us14;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US14_Pojo_Outer {
    private String message;
    private String httpStatus;
    private US14_Pojo object;

    public US14_Pojo_Outer() {
    }

    public US14_Pojo_Outer(String message, String httpStatus, US14_Pojo object) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public US14_Pojo getObject() {
        return object;
    }

    public void setObject(US14_Pojo object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "US14_Pojo_Outer{" +
                "message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                ", object=" + object +
                '}';
    }
}
