package stepdef.api;


import baseUrl.ManagementSchoolBaseUrl;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.us10_11_12.LessonNamePojo;
import pojos.us10_11_12.LessonPostPojo;
import pojos.us10_11_12.ObjectPojo;
import pojos.us10_11_12.ExpectedDataPojo;


import java.util.ArrayList;

import java.util.List;

import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Api_LessonProgramController extends ManagementSchoolBaseUrl {

    Response response;
    ObjectPojo objectPojo;
    ExpectedDataPojo expectedPojo;
    LessonPostPojo payload;
    LessonNamePojo lessonNamePojo;
    JsonPath jsonPath;
    public static String message;
    public static String httpStatus;


    public static int lessonId;


    //1-POST
    @Given("send post request for lesson program")
    public void send_post_request_for_lesson_program() {

        //Set the url-->https://managementonschools.com/app/lessonPrograms/save

        spec.pathParams("first", "lessonPrograms", "second", "save");

        //Set the expected Data
        //1.
        lessonNamePojo = new LessonNamePojo(3, "Java", 10, true);
        ArrayList<LessonNamePojo> lessonName = new ArrayList<>();
        lessonName.add(lessonNamePojo);
        System.out.println("lessonNamePojo = " + lessonNamePojo);

        //2.
        objectPojo = new ObjectPojo(lessonId, "10:30:00", "12:30:00", lessonName, "MONDAY");

        //3.
        List<Integer> lessonIdList = new ArrayList<>();
        lessonIdList.add(3);
        payload = new LessonPostPojo("MONDAY", 1, lessonIdList, "10:30", "12:30");

        //4.
        expectedPojo = new ExpectedDataPojo(objectPojo, "Created Lesson Program", "CREATED");


        // Send the request and get the response
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();

    }


    @Then("get the response and validate")
    public void get_the_response_and_validate() {
        //Do Assertion
        ExpectedDataPojo actualData = new Gson().fromJson(response.asString(), ExpectedDataPojo.class);

        assertEquals(200, response.statusCode());
        assertEquals(expectedPojo.getObject().getStartTime(), actualData.getObject().getStartTime());
        assertEquals(expectedPojo.getObject().getStopTime(), actualData.getObject().getStopTime());
        assertEquals(expectedPojo.getObject().getDay(), actualData.getObject().getDay());


        lessonId = actualData.getObject().getLessonProgramId();

    }

    //2-GET
    @Given("send get request to url by id")
    public void sendGetRequestToUrlById() {
        //Set the url -->https://managementonschools.com/app/lessonPrograms/getById/lessonId
        spec.pathParams("first", "lessonPrograms", "second", "getById", "third", lessonId);

        //Set the expected data
        lessonNamePojo = new LessonNamePojo(2, "Java", 10, true);
        ArrayList<LessonNamePojo> lessonName = new ArrayList<>();
        lessonName.add(lessonNamePojo);
        objectPojo = new ObjectPojo(lessonId, "10:30:00", "12:30:00", lessonName, "MONDAY");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Validate response body")
    public void validateResponseBody() {
        //Do Assertion

        //Buradaki expected leesonName pojo,response body ise object pojodur.
        assertEquals(200, response.statusCode());
        assertEquals(lessonNamePojo.getLessonName(), objectPojo.getLessonName().get(0).getLessonName());
        assertEquals(lessonNamePojo.getLessonId(), objectPojo.getLessonName().get(0).getLessonId());
        assertEquals(lessonNamePojo.getCreditScore(), objectPojo.getLessonName().get(0).getCreditScore());
        assertEquals(lessonNamePojo.getCompulsory(), objectPojo.getLessonName().get(0).getCompulsory());

    }

    //3-DELETE
    @Given("send delete request to url by id")
    public void sendDeleteRequestToUrlById() {
        //Set the url
        spec.pathParams("first", "lessonPrograms", "second", "delete", "third", lessonId);

        //Set the expected Data
        message = "Lesson Program Deleted";
        httpStatus = "OK";

        //Send The request and get the response
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
     /*
     {
    "message": "Lesson Program Deleted",
    "httpStatus": "OK"
      }
      */


    }

    @Then("Validate delete response body")
    public void validateDeleteResponseBody() {
        //Do assertion

        assertEquals(200, response.statusCode());
        assertTrue(response.asString().contains(message));
        assertTrue(response.asString().contains(httpStatus));

    }

    //4-GET NEGATİVE

    @Given("send get negative request to url by id")
    public void sendGetNegativeRequestToUrlById() {
        //Set the url

       //  spec.pathParams("first", "lessonPrograms", "second","getById","third", lessonId);

        //-->https://managementonschools.com/app/lessonPrograms/getById/526
        //Set the expected Data

        //Send the request and get the response
//        response=given(spec).get("{first}/{second}/{third}");
//        response.prettyPrint();

        /*
     {
    "message": "Error: Lesson with lesson id 526 not found",
    "statusCode": 404,
    "path": "/app/lessonPrograms/getById/526",
    "timeStamp": 1687423891211
     }

         */
    }

    @Then("Validate get negative response body")
    public void validateGetNegativeResponseBody() {
        //Do assertion
//        jsonPath = response.jsonPath();
//        assertEquals(404, response.statusCode());
//        assertEquals("Error: Lesson with lesson id"+lessonId+" not found",jsonPath.getString("message"));
//        assertEquals("/app/lessonPrograms/getById/"+lessonId+"",jsonPath.getString("path"));

    }
}
