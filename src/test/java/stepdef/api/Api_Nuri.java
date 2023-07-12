package stepdef.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_02.US_02;
import utilities.ConfigReader;

import java.sql.*;
import java.util.List;
import java.util.Random;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdef.ui.US06_Steps_Nuri.UserName;
import static utilities.AuthenticationManagementonSchool.generateToken;

public class Api_Nuri {
    US_02 payload;
    Response response;
    int userId;
    JsonPath jsonPath;
    Response deleteResponse;
    Faker fake = new Faker();

    Random random;
    public  static  int id;

    //################################US02################################
    @Given("send post request for creating guest user")
    public void send_post_request_for_creating_guest_user() {


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
        response = given(spec).
                header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).
                body(payload).post("{pp1}/{pp2}");

        response.prettyPrint();

        jsonPath = response.jsonPath();

        userId = jsonPath.getInt("object.userId");

        System.out.println("userId = " + userId);


    }

    @Then("send post request for deleting guest user and validations")
    public void sendPostRequestForDeletingGuestUserAndValidations() {

        // https://managementonschools.com/app/guestUser/delete/{{guestId}}
        spec.pathParams("pp1", "guestUser", "pp2", "delete", "pp3", userId);
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).delete("{pp1}/{pp2}/{pp3}");
        response.prettyPrint();
        response.
                then().
                statusCode(200).
                body("message", equalTo(" Guest User deleted Successful"));


    }
    //################################US06################################


    @Then("validate {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void validate(String brirthDay, String birthPlace, String gender, String name, String password, String phone, String ssn, String surname, String username) {


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

        response = given(spec).
                header("Authorization", generateToken((String) ConfigReader.getProperty("dean"), (String) ConfigReader.getProperty("psw"))).
                body(payload).post("{pp1}/{pp2}");

        response.prettyPrint();

        assertEquals(400, response.getStatusCode());
    }

    @Then("Admin validate {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void adminValidate(String brirthDay, String birthPlace, String gender, String name, String password, String phone, String ssn, String surname, String username) {


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

        response = given(spec).
                header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).
                body(payload).post("{pp1}/{pp2}");

        response.prettyPrint();

        assertEquals(400, response.getStatusCode());


    }

    @Given("Admin butun visedeanleri cagirarak kayit ettigi visedean in id sine ulasir")
    public void adminButunVisedeanleriCagirarakKayitEttigiVisedeanInIdSineUlasir() {
//https://managementonschools.com/app/vicedean/getAll
        spec.pathParams("pp1", "vicedean", "pp2", "getAll");
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("Erelusername"), (String) ConfigReader.getProperty("Erelpassword"))).get("{pp1}/{pp2}");

        response.prettyPrint();
        // String jsonPathExpression = "findAll{it.username=='" + UserName + "'}.userId";


        String jsonPathExpression = "findAll{it.username=='" + UserName + "'}.userId";
        id = (int) response.jsonPath().getList(jsonPathExpression).get(0);

        System.out.println("id = " + id);

    }

    @Then("id sine ulastigi Visedean in assertion yapar")
    public void idSineUlastigiVisedeanInAssertionYapar() {

        String JSP = "findAll{it.userId==" + id + "}.username";
        assertEquals(UserName, (String) response.jsonPath().getList(JSP).get(0));

        String JSP1 = "findAll{it.userId==" + id + "}.name";
        assertEquals("Nuri", (String) response.jsonPath().getList(JSP1).get(0));

        String JSP2 = "findAll{it.userId==" + id + "}.surname";
        assertEquals("Kara", (String) response.jsonPath().getList(JSP2).get(0));

    }

    Connection connection;
    Statement statement;

    @Given("Admin connetion olusturur")
    public void adminConnetionOlusturur() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

        statement = connection.createStatement();

        String query = "select * from vice_dean where  ";

        ResultSet resultSet = statement.executeQuery("query");

        resultSet.next();

        resultSet.getString("");

    }
}
