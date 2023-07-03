package stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class Api_Nuri {
    Response response;

    @Given("tum gestuserlar icin get request yap")
    public void tum_gestuserlar_icin_get_request_yap() {

//Set The Url

        //Set the url
        //https://managementonschools.com/app/guestUser/getAll?size=1000
        spec.pathParams("first", "guestUser", "second", "getAll")
                .queryParam("size", "1000");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
//https://managementonschools.com/app/guestUser/getAll?page=0&size=1000
    }

    @Then("body sunlari icermeli: {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}")
    public void body_sunlari_icermeli(String name, String surname, String birthplace, String phone, String gender, String dateOfBirth, String ssn, String username) {


        JsonPath jsonPath = response.jsonPath();

        String actSSN = jsonPath.getList("content.findAll{it.username=='" + username + "'}.ssn").get(0).toString();
        String actSurname = jsonPath.getList("content.findAll{it.username=='" + username + "'}.surname").get(0).toString();
        String actBirthPlace = jsonPath.getList("content.findAll{it.username=='" + username + "'}.birthPlace").get(0).toString();


        assertEquals(surname, actSurname);
        assertEquals(birthplace, actBirthPlace);
        assertEquals(ssn, actSSN);


    }
}
