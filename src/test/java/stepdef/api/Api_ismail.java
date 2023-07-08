package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.MeetList;

import java.util.ArrayList;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api_ismail {
    public static Response response;
    MeetList payLoad;
    public static MeetList expectedData;
    @Given("kullanici mesajlar icin get request yapar")
    public void kullaniciMesajlarIcinGetRequestYapar() {
//Set the url
        //https://managementonschools.com/app/contactMessages/getAll
        spec.pathParams("first", "contactMessages", "second", "getAll");
        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("kullanici gelen bodyi validate eder {string}, {string}, {string}, {string}, {string}")
    public void kullaniciGelenBodyiValidateEder(String name, String email, String subject, String message, String date) {
        JsonPath jsonPath=response.jsonPath();
        Object actualName = jsonPath.getList("content.findAll{it.email=='" + email + "'}.name").get(0);
        Object actualEmail = jsonPath.getList("content.findAll{it.email=='" + email + "'}.email").get(0);
        Object actualSubject = jsonPath.getList("content.findAll{it.email=='" + email + "'}.subject").get(0);
        Object actualMessage = jsonPath.getList("content.findAll{it.email=='" + email + "'}.message").get(0);
        Object actualDate = jsonPath.getList("content.findAll{it.email=='" + email + "'}.date").get(0);
        assertEquals(name, actualName);
        assertEquals(email, actualEmail);
        assertEquals(subject, actualSubject);
        assertEquals(message, actualMessage);
        assertEquals(date, actualDate);
    }


    @Given("post request gonderilir")
    public void postRequestGonderilir() {

        //Set the url==>https://managementonschools.com/app/meet/save
        spec.pathParams("first", "meet", "second", "save");
        //Set the expected data
        ArrayList<Integer> studentId = new ArrayList<>();
        studentId.add(28);
        String date ="2027-05-21";
        String description ="EgitimVadisi";
        String startTime ="22:00";
        String stopTime ="23:00";

        payLoad = new MeetList(date, description, startTime, stopTime,studentId);
        response = given(spec).body(payLoad).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("body sunlari icermeli: {string},{string},{string},{string},{string}")
    public void bodySunlariIcermeli(String date, String description, String startTime, String stopTime, String studentIds) {
        //Do assertion

       JsonPath jsonPath = response.jsonPath();

        System.out.println("jsonPath = " + jsonPath.prettyPrint());

       /* assertEquals(payLoad.getDate(), jsonPath.getString("object.date"));
        assertEquals(payLoad.getStartTime(), jsonPath.getString("object.startTime").substring(0, 5));
        assertEquals(payLoad.getStopTime(), jsonPath.getString("object.stopTime").substring(0, 5));
        assertEquals(payLoad.getDescription(), jsonPath.getString("object.description"));
        assertEquals(payLoad.getStudentIds().get(0), jsonPath.getList("object.students.id").get(0));
         Integer id = jsonPath.getInt("object.id");//meetingid
        System.out.println(id);*/
    }
    /*{
  "date": "{{randomdate}}",
  "description": "{{description}}",
  "startTime": "22:00",
  "stopTime": "23:00",
  "studentIds": [
    3
  ]
}*/

    /* "object": {
        "id": 338,
        "description": "{{description}}",
        "date": "2024-04-09",
        "startTime": "22:00:00",
        "stopTime": "23:00:00",
        "advisorTeacherId": 6,
        "teacherName": "Kemal",
        "teacherSsn": "888-99-6969",
        "students": []
        */
}
