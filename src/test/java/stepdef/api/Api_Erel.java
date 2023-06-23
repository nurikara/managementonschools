package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.us10_11_12.ExpectedDataPojo;
import pojos.us10_11_12.LessonNamePojo;
import pojos.us10_11_12.LessonPostPojo;
import pojos.us10_11_12.ObjectPojo;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Api_Erel extends ManagementSchoolBaseUrl {
    @Given("send post request for student")
    public void send_post_request_for_student() {
        //Set the url-->https://managementonschools.com/app/lessonPrograms/save

        spec.pathParams("first", "vicedean", "second", "save");
        //Set the expected Data
        //1.
//        lessonNamePojo = new LessonNamePojo(2, "Java", 10, true);
//        ArrayList<LessonNamePojo> lessonName = new ArrayList<>();
//        lessonName.add(lessonNamePojo);
//        System.out.println("lessonNamePojo = " + lessonNamePojo);
//
//        objectPojo = new ObjectPojo(lessonId, "10:30:00", "12:30:00", lessonName, "MONDAY");
//
//        List<Integer> lessonIdList = new ArrayList<>();
//        lessonIdList.add(2);
//        payload = new LessonPostPojo("MONDAY", 1, lessonIdList, "10:30", "12:30");
//
//        expectedPojo = new ExpectedDataPojo(objectPojo, "Created Lesson Program", "CREATED");
//
//
//        // Send the request and get the response
//        response = given(spec).body(payload).post("{first}/{second}");
//        response.prettyPrint();
    }
    @Then("gelen bodyi dogrula {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void gelen_bodyi_dogrula(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username) {

    }
}
