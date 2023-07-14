package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_04_05.DeanPojo;
import pojos.US_04_05.DeanRootPojo;
import pojos.us10_11_12.LessonNamePojo;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;
import utilities.ReusableMethods;
import java.sql.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.AuthenticationManagementonSchool.generateToken;
public class Api_Milhan extends ManagementSchoolBaseUrl {


    Response response;
    DeanPojo expectedData;
    DeanRootPojo rootPojo;

    public static String message;
    public static String httpStatus;

    public static int userId;
    JsonPath jsonPath;
    Faker faker = new Faker();
    ResultSet resultSet;

    Connection connection;
    Statement statement;

    @Given("send post request for creating room")
    public void sendPostRequestForCreatingRoom() {


        String birthDay = "1985-12-24";
        String birthPlace = faker.country().capital();
        String gender = "MALE";
        String name = faker.name().firstName();
        String password = faker.regexify("[A-Z]{1}[a-zA-Z0-9]{7}");
        String phone = faker.numerify("###-###-####");
        String ssn = faker.idNumber().ssnValid();
        String surname = faker.name().lastName();
        String username = faker.name().username();


        //Set the url-->https://managementonschools.com/app/dean/save
        spec.pathParams("first", "dean", "second", "save");

        //Set the expected Data
        expectedData = new DeanPojo(userId, birthDay, birthPlace, gender, name, password, phone, ssn, surname, username);

        // Send the request and get the response
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).body(expectedData).post("{first}/{second}");
        response.prettyPrint();

        jsonPath = response.jsonPath();

        userId = jsonPath.getInt("object.userId");

        System.out.println("userId = " + userId);
    }

    @Then("get the response and validate.")
    public void getTheResponseAndValidate() {

        //Do Assertion

        DeanRootPojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(), DeanRootPojo.class);
        System.out.println("actualData = " + actualData);

        ReusableMethods.bekle(3);




        assertEquals(200, response.statusCode());
        System.out.println("responseStatusCode = " + response.statusCode());
        ReusableMethods.bekle(2);

        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());


        assertEquals("Dean Saved", actualData.getMessage());
        assertEquals("CREATED", actualData.getHttpStatus());


    }

    @Given("send post request for creating room {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string}")
    public void sendPostRequestForCreatingRoom(String name, String surname, String gender, String birthDay, String birthPlace, String password, String phone, String ssn, String username) {

        Faker fake = new Faker();


        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1982-09-20";
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

    }

    @Given("send put request for edit dean")
    public void sendPutRequestForEditDean() {


        String birthDay = "1985-12-24";
        String birthPlace = faker.country().capital();
        String gender = "MALE";
        String name = faker.name().firstName();
        String password = faker.regexify("[A-Z]{1}[a-zA-Z0-9]{7}");
        String phone = faker.numerify("###-###-####");
        String ssn = faker.idNumber().ssnValid();
        String surname = faker.name().lastName();
        String username = faker.name().username();


        //Set the url-->https://managementonschools.com/app/dean/update/504
        spec.pathParams("first", "dean", "second", "update", "third", userId);

        //Set the expected Data
        expectedData = new DeanPojo(userId, birthDay, birthPlace, gender, name, password, phone, ssn, surname, username);

        // Send the request and get the response
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).body(expectedData).put("{first}/{second}/{third}");
        response.prettyPrint();





    }

    @Then("put the response and validate")
    public void putTheResponseAndValidate() {

        //Do Assertion

        DeanRootPojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(), DeanRootPojo.class);
        System.out.println("actualData = " + actualData);

        ReusableMethods.bekle(3);


        assertEquals(200, response.statusCode());
        System.out.println("responseStatusCode = " + response.statusCode());
        ReusableMethods.bekle(2);

        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());


        assertEquals("Dean updated Successful", actualData.getMessage());
        assertEquals("OK", actualData.getHttpStatus());


    }

    @And("send delete request for delete dean")
    public void sendDeleteRequestForDeleteDean() {
        //Set the url-->https://managementonschools.com/app/dean/delete/504
        spec.pathParams("first", "dean", "second", "delete", "third", userId);

        //Set the expected Data
        message = "Dean Deleted";
        httpStatus = "OK";

        //Send The request and get the response
        response = given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("admin2"), (String) ConfigReader.getProperty("psw2"))).delete("{first}/{second}/{third}");
        response.prettyPrint();


    }

    @Then("delete the response and validate.")
    public void deleteTheResponseAndValidate() {

        //Do assertion

        assertEquals(200, response.statusCode());
        assertTrue(response.asString().contains(message));
        assertTrue(response.asString().contains(httpStatus));

    }


    @Then("Create Dean and validate")
    public void createDeanAndValidate() throws SQLException{
        String query = "SELECT * FROM guest_user WHERE surname ='Schaden'";

        resultSet = statement.executeQuery(query);
        if (resultSet.next()) {
            expectedData = new DeanPojo("1994-11-01", "Shayneberg", "MALE", "Marcel", "827-427-0088", "121-69-7143", "Schaden", "Domenica.Trantow");

            System.out.println("expectedData = " + expectedData);

            String actualName = resultSet.getString("name");
            String actualSurname = resultSet.getString("surname");
            String actualbirthDay = resultSet.getString("birth_day");
            String actualBirthPlace = resultSet.getString("birth_place");
            String actualGender = resultSet.getString("gender");
            String actualPhone = resultSet.getString("phone_number");
            String actualSsn = resultSet.getString("ssn");
            String actualUsername = resultSet.getString("username");

            assertEquals(expectedData.getName(), actualName);
            assertEquals(expectedData.getSurname(), actualSurname);
            assertEquals(expectedData.getBirthDay(), actualbirthDay);
            assertEquals(expectedData.getBirthPlace(), actualBirthPlace);
            assertEquals(expectedData.getGender(), actualGender);
            assertEquals(expectedData.getPhoneNumber(), actualPhone);
            assertEquals(expectedData.getSsn(), actualSsn);
            assertEquals(expectedData.getUsername(), actualUsername);
        } else {

        }


    }

    @Given("Connect to database.")
    public void connectToDatabase() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
    }
}
