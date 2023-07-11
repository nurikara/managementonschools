package stepdef.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import pojos.US19.MeetCotrollerPojo;
import utilities.ConfigReader;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

import static utilities.AuthenticationManagementonSchool.generateToken;

public class Api_MeetCotroller {
JsonPath jsonPath;
    Response response;
    public static LocalDate date;
   Faker faker;
    MeetCotrollerPojo payLoad;
public static int Id;
    @Given("send post request for creating meet do")
    public void sendPostRequestForCreatingMeetDo() {
        List<Integer> studentIds = new ArrayList<>();

        studentIds.add(33);

        Random random = new Random();
        int year = random.nextInt(10) + 2022; // 2022-2031 arasında rastgele bir yıl seçin
        int month = random.nextInt(12) + 1;   // 1-12 arasında rastgele bir ay seçin
        int day = random.nextInt(28) + 1;     // 1-28 arasında rastgele bir gün seçin

        // Tarihi oluşturmak için LocalDate sınıfını kullanın
        LocalDate futureDate = LocalDate.of(year, month, day);

        // Belirtilen formatta bir tarih dizesine dönüştürmek için DateTimeFormatter kullanın
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = futureDate.format(formatter);
        String description = "EgitimVadisi";
        String startTime = "22:00";
        String stopTime = "23:00";

      payLoad = new MeetCotrollerPojo(date, description, startTime, stopTime, studentIds);

        spec.pathParams("pp1", "meet", "pp2", "save");
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("teacher"), (String) ConfigReader.getProperty("psw")))
                .body(payLoad).
                post("/{pp1}/{pp2}");

        response.prettyPrint();

        jsonPath = response.jsonPath();

        Id = jsonPath.getInt("object.id");

    }

    @Then("get the response and validate meet")
    public void getTheResponseAndValidateMeet() {
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(payLoad.getDate(),jsonPath.getString("object.date"));
        Assert.assertEquals(payLoad.getDescription(),jsonPath.getString("object.description"));
        Assert.assertEquals(payLoad.getStartTime(),jsonPath.getString("object.startTime").substring(0, 5));
        Assert.assertEquals(payLoad.getStopTime(),jsonPath.getString("object.stopTime").substring(0, 5));

    }

    @Given("send get request to url by id_")
    public void sendGetRequestToUrlById_() {
        //get https://managementonschools.com/app/meet/getMeetById/5
        spec.pathParams("pp1", "meet", "pp2", "getMeetById","pp3",Id);
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("teacher"), (String) ConfigReader.getProperty("psw")))
                .get("/{pp1}/{pp2}/{pp3}");

        response.prettyPrint();
    }

    @Then("Validate response body_")
    public void validateResponseBody_() {
        Assert.assertEquals(200,response.statusCode());
        Assert.assertTrue(response.asString().contains("Meet successfully found"));


    }
//delete https://managementonschools.com/app/meet/delete/5
    @Given("send delete request to url by id_")
    public void sendDeleteRequestToUrlById_() {
        spec.pathParams("pp1", "meet", "pp2", "delete","pp3",Id);
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("teacher"), (String) ConfigReader.getProperty("psw")))
                .delete("/{pp1}/{pp2}/{pp3}");

        response.prettyPrint();
    }

    @Then("Validate delete response body_")
    public void validateDeleteResponseBody_() {
        Assert.assertEquals(200,response.statusCode());
        Assert.assertTrue(response.asString().contains("Meet deleted successfully"));
        Assert.assertTrue(response.asString().contains("OK"));
    }



}
