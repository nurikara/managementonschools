package stepdef.api;


import baseUrl.ManagementSchoolBaseUrl;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.us10_11_12.LessonNamePojo;
import pojos.us10_11_12.LessonPostPojo;
import pojos.us10_11_12.ObjectPojo;
import pojos.us10_11_12.ExpectedDataPojo;
import utilities.ObjectMapperUtils;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api_Elif extends ManagementSchoolBaseUrl {

    Response response;
    ObjectPojo objectPojo;
    ExpectedDataPojo expectedPojo;
    LessonPostPojo payload;

    public static   int lessonId;

    @Given("send post request for lesson program")
    public void send_post_request_for_lesson_program() {

        //Set the url-->https://managementonschools.com/app/lessonPrograms/save

        spec.pathParams("first", "lessonPrograms", "second", "save");

        //Set the expected Data
      //1.
        LessonNamePojo lessonNamePojo = new LessonNamePojo(2, "Selenium", 15, true);
        ArrayList<LessonNamePojo> lessonName = new ArrayList<>();
        lessonName.add(lessonNamePojo);
        System.out.println("lessonNamePojo = " + lessonNamePojo);

        objectPojo = new ObjectPojo(394,"10:30:00", "12:30:00", lessonName, "MONDAY");

        List<Integer> lessonIdList = new ArrayList<>();
        lessonIdList.add(3);
        payload = new LessonPostPojo("MONDAY", 2, lessonIdList, "10:30", "12:30");

        expectedPojo = new ExpectedDataPojo(objectPojo, "Created Lesson Program", "CREATED");


        // Send the request and get the response
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();

    }


    @Then("get the response and validate")
    public void get_the_response_and_validate() {
        ExpectedDataPojo actualData =new Gson().fromJson(response.asString(), ExpectedDataPojo.class);

        assertEquals(200,response.statusCode());
        assertEquals(expectedPojo.getObject().getStartTime(),actualData.getObject().getStartTime());
        assertEquals(expectedPojo.getObject().getStopTime(),actualData.getObject().getStopTime());
        assertEquals(expectedPojo.getObject().getDay(),actualData.getObject().getDay());


        lessonId= actualData.getObject().getLessonProgramId();

    }


}
