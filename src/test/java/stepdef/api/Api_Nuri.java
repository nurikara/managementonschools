package stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class Api_Nuri {

    @Given("tum gestuserlar icin get request yap")
    public void tum_gestuserlar_icin_get_request_yap() {
//Set The Url

        //Set the url
        //https://managementonschools.com/app/guestUser/getAll?size=1000
        spec.pathParams("first","guestUser","second","getAll")
                .queryParam("size","1000");

        //Send the request and get the response
        Response response = given(spec).get("{first}/{second}");
        response.prettyPrint();
//https://managementonschools.com/app/guestUser/getAll?page=0&size=1000
    }
    @Then("body sunlari icermeli: {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}")
    public void body_sunlari_icermeli(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

    }
}
