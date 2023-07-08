package stepdef.api;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US19.Pojo19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class Api_ismail {

    Response response;
    Random random;

    @Given("send post request for creating meet do")
    public void sendPostRequestForCreatingMeetDo() {
        List<Integer> studentIds = new ArrayList<>();

        studentIds.add(33);

        String date = "2023-09-20";
        String description = "EgitimVadisi";
        String startTime = "22:00";
        String stopTime = "23:00";

        Pojo19 payLoad = new Pojo19(date, description, startTime, stopTime, studentIds);

        spec.pathParams("pp1", "meet", "pp2", "save");
        response = given(spec).
                body(payLoad).
                post("/{pp1}/{pp2}");

        response.prettyPrint();
    }

    @Then("get the response and validate meet")
    public void getTheResponseAndValidateMeet() {
    }
}
