package stepdef.api;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pojos.US_02.US_02;
import utilities.ConfigReader;

import java.util.Objects;

import static baseUrl.ManagementSchoolBaseUrl.setUp;
import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationManagementonSchool.generateToken;

public class Api_Nuri {
    US_02 payload;
    Response response;
    int userId;
    JsonPath jsonPath;
    Response deleteResponse;

    //################################US02################################
    @Given("send post request for creating guest user")
    public void send_post_request_for_creating_guest_user() {
        Faker fake = new Faker();

        String brirthDay = "1982-09-20";
        String birthPlace = "Yozgat";
        String gender = "0";
        String name = fake.name().firstName();
        String password = "Emre4344";
        String phone = fake.numerify("###-###-####");
        String ssn = fake.idNumber().ssnValid();
        String surname = fake.name().lastName();
        String username = fake.name().username();

        payload = new US_02(brirthDay, birthPlace, gender, name, password, phone, ssn, surname, username);
        spec.pathParams("pp1", "guestUser", "pp2", "register");
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).body(payload).post("{pp1}/{pp2}");
        response.prettyPrint();

        jsonPath = response.jsonPath();

        userId = jsonPath.getInt("object.userId");

        System.out.println("userId = " + userId);


    }

    @Then("send post request for deleting guest user and validations")
    public void sendPostRequestForDeletingGuestUserAndValidations() {

        // https://managementonschools.com/app/guestUser/delete/{{guestId}}

        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).pathParams("pp1", "guestUser", "pp2", "delete", "pp3", userId).delete("{pp1}/{pp2}/{pp3}");
        response.prettyPrint();
        response.
                then().
                statusCode(200).body("message", Matchers.equalTo(" Guest User deleted Successful"));


    }
    //################################US06################################


    @Then("validate {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void validate(String brirthDay, String birthPlace, String gender, String name, String password, String phone, String ssn, String surname, String username) {
        System.out.println(brirthDay);

        Faker fake = new Faker();




        if (brirthDay.equals("")) {
            brirthDay = "";
        } else {
            brirthDay = "1982-09-20";
        }
        if (birthPlace.equals("")) {
            birthPlace = "";
        } else {
            birthPlace = "Yozgat";
        }
        if (gender.equals("")) {
            gender = "";
        } else {
            gender = "0";
        }
        if (name.equals("")) {
            name = "";
        } else {
            name = fake.name().firstName();
        }
        if (password.equals("")) {
            password = "";
        } else {
            password = "Emre4344";
        }
        if (phone.equals("")) {
            phone = "";
        } else {
            phone = fake.numerify("###-###-####");
        }
        if (ssn.equals("")) {
            ssn = "";
        } else {
            ssn = fake.idNumber().ssnValid();
        }
        if (surname.equals("")) {
            surname = "";
        } else {
            surname = fake.name().lastName();
        }
        if (username.equals("")) {
            username = "";
        } else {
            username = fake.name().lastName();
        }


        payload = new US_02(brirthDay, birthPlace, gender, name, password, phone, ssn, surname, username);
        spec.pathParams("pp1", "guestUser", "pp2", "register");
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("dean"), (String) ConfigReader.getProperty("psw"))).body(payload).post("{pp1}/{pp2}");
        response.prettyPrint();
    }
}
