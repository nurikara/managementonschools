package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api_ismail extends ManagementSchoolBaseUrl {
    Response response;
    @Given("kullanici mesajlar icin get request yapar")
    public void kullaniciMesajlarIcinGetRequestYapar() {

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
}
