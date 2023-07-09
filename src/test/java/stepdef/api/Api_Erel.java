package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_02.US_02;
import pojos.erel.US15_ObjectPojo;
import pojos.erel.US15_Pojo;
import pojos.erel.US15_Post;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationManagementonSchool.generateToken;

public class Api_Erel extends ManagementSchoolBaseUrl {
    US15_Pojo expectedData;
    Response responseerel;
    Response response;
    JsonPath jsonPath;
    int userId;
    @Given("Admin olarak tum students icin get request yap")
    public void tum_guest_userlar_icin_get_request_yap() {
        //Set the url
        //https://managementonschools.com/app/students/getAll
        spec.pathParams("first", "students", "second", "getAll");
        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("gelen bodyi dogrula {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string}")
    public void gelenBodyiDogrula(String name, String surname, String birthplace, String phone, String gender, String dateOfBirth, String ssn, String username, String fatherName, String motherName, String password) {
        JsonPath jsonPath=response.jsonPath();
        Object actName = jsonPath.getList("findAll{it.username=='" + username + "'}.name").get(0);
        Object actUsername = jsonPath.getList("findAll{it.username=='" + username + "'}.username").get(0);
        Object actSurname = jsonPath.getList("findAll{it.username=='" + username + "'}.surname").get(0);
        Object actBirthPlace = jsonPath.getList("findAll{it.username=='" + username + "'}.birthPlace").get(0);
        Object actPhone = jsonPath.getList("findAll{it.username=='" + username + "'}.phoneNumber").get(0);
        Object actGender = jsonPath.getList("findAll{it.username=='" + username + "'}.gender").get(0);
        Object actBirthDay = jsonPath.getList("findAll{it.username=='" + username + "'}.birthDay").get(0);
        Object actmotherName = jsonPath.getList("findAll{it.username=='" + username + "'}.motherName").get(0);
        Object actfatherName = jsonPath.getList("findAll{it.username=='" + username + "'}.fatherName").get(0);
        Object actPassword = jsonPath.getList("findAll{it.username=='" + username + "'}.password").get(0);
        assertEquals(name, actName);
        assertEquals(username, actUsername);
        assertEquals(surname, actSurname);
        assertEquals(birthplace, actBirthPlace);
        assertEquals(phone, actPhone);
        assertEquals(gender, actGender);
        assertEquals(dateOfBirth, actBirthDay);
        assertEquals(motherName, actmotherName);
        assertEquals(fatherName, actfatherName);

    }
    @Given("tum mesajlar icin get request yap")
    public void tumMesajlarIcinGetRequestYap() {
        //Set the url
        //https://managementonschools.com/app/contactMessages/getAll
        spec.pathParams("first", "contactMessages", "second", "getAll");
        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("gelen bodyi dogrula {string}, {string}, {string}, {string}, {string}")
    public void gelenBodyiDogrula(String name, String email, String subject, String message, String date) {
        JsonPath jsonPath=response.jsonPath();
        Object actName = jsonPath.getList("content.findAll{it.email=='" + email + "'}.name").get(0);
        Object actEmail = jsonPath.getList("content.findAll{it.email=='" + email + "'}.email").get(0);
        Object actSubject = jsonPath.getList("content.findAll{it.email=='" + email + "'}.subject").get(0);
        Object actMessage = jsonPath.getList("content.findAll{it.email=='" + email + "'}.message").get(0);
        Object actDate = jsonPath.getList("content.findAll{it.email=='" + email + "'}.date").get(0);
        assertEquals(name, actName);
        assertEquals(email, actEmail);
        assertEquals(subject, actSubject);
        assertEquals(message, actMessage);
        assertEquals(date, actDate);
    }

    @Given("Vice Dean olarak tum students icin get request yap")
    public void tumStudentsIcinGetRequestYap() {
        //Set the url
        //https://managementonschools.com/app/students/getAll
        spec.pathParams("first", "students", "second", "getAll");
        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }
    @Given("student icin post request yap")
    public void studentIcinPostRequestYap() {

        //set the url
        //https://managementonschools.com/app/students/save
        spec.pathParams("first","students","second","save");

        //set the expected data

        expectedData=new US15_Pojo(1,"1999-04-23","ankara","DDASLM@gmail.com","demir","FEMALE","bade","cemil",
                "cem","379-109-4431","815-69-0011","DADKSdLD","118914697",0,0,null);

        //Send the request and get the response
        responseerel = given(spec).body(expectedData).header("Authorization", generateToken((String) ConfigReader.getProperty("Erelusername"), (String) ConfigReader.getProperty("Erelpassword"))).post("{first}/{second}");
        responseerel.prettyPrint();

    }

    @Then("bodyi dogrula")
    public void bodyiDogrula()  {

        US15_ObjectPojo actualData= responseerel.as(US15_ObjectPojo.class);
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getEmail(),actualData.getObject().getEmail());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());

        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedData.getFatherName(),actualData.getObject().getFatherName());

        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());
}






    @Given("student icin post request yap {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void studentIcinPostRequestYap(String advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String surname, String phoneNumber, String ssn, String username, String password) {
        Faker fake = new Faker();
            //set the url
            //https://managementonschools.com/app/students/save
            spec.pathParams("first","students","second","save");

            //set the expected data
        if (advisorTeacherId==null) {
            advisorTeacherId = null;
        } else {
            advisorTeacherId = "1";
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }
        if (birthPlace.equals("")) {
            birthPlace = "";
        } else {
            birthPlace = "Alaska";
        }
        if (gender.equals("")) {
            gender = "";
        } else {
            gender = "1";
        }
        if (name.equals("")) {
            name = "";
        } else {
            name = fake.name().firstName();
        }
        if (password.equals("")) {
            password = "";
        } else {
            password = (String) ConfigReader.getProperty("passw");
        }
        if (phoneNumber.equals("")) {
            phoneNumber = "";
        } else {
            phoneNumber = fake.numerify("###-###-####");
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
        if (motherName.equals("")) {
            motherName = "";
        } else {

            motherName =(String) ConfigReader.getProperty("motherName");
        }
        if (fatherName.equals("")) {
            fatherName = "";
        } else {

            fatherName =(String) ConfigReader.getProperty("fatherName");
        }
        if (email.equals("")) {
            email = "";
        } else {

            email =fake.internet().emailAddress();
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }


      //  expectedData=new US15_Pojo(1,"1999-04-23","ankara","DDASLM@gmail.com","demir","FEMALE","bade","cemil",
       //             "cem","379-109-4431","815-69-0011","DADKSdLD","118914697",0,0,null);
        US15_Post payload=new US15_Post(advisorTeacherId,birthDay,birthPlace,email,fatherName,gender,motherName,name,surname,phoneNumber,ssn,username,password);
            //Send the request and get the response
            responseerel = given(spec).body(payload).header("Authorization", generateToken((String) ConfigReader.getProperty("Erelusername"), (String) ConfigReader.getProperty("Erelpassword"))).post("{first}/{second}");
            responseerel.prettyPrint();
//        jsonPath = response.jsonPath();
//
//        userId = jsonPath.getInt("object.userId");
//
//        System.out.println("userId = " + userId);
        }
}


