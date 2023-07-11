package stepdef.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.us14.US14_Pojo;
import pojos.us14.US14_Pojo_Outer;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.AuthenticationManagementonSchool.generateToken;

public class Api_Mali2 {
    US14_Pojo expectedTeacherPojo;
    US14_Pojo expectedTeacherUpdatePojo;
    HashMap <String, Object> expectedMap;
    Faker faker=new Faker();
    Response response;
    static int idPost;
    static int idPut;

    @Given("User create Teacher by Post Request")
    public void userCreateTeacherByPostRequest() {
        //set the url https://managementonschools.com/app/teachers/save

        spec.pathParams("first","teachers","second", "save");
        //set the expected data

        //        {
        //  "birthDay": "yyyy-MM-dd",
        //  "birthPlace": "string",
        //  "email": "string",
        //  "gender": "MALE",
        //  "isAdvisorTeacher": true,
        //  "lessonsIdList": [
        //    1
        //  ],
        //  "name": "string",
        //  "password": "string",
        //  "phoneNumber": "string",
        //  "ssn": "string",
        //  "surname": "string",
        //  "username": "string"
        //}

        String birthday="1979-08-13";
        String birthplace=faker.country().capital();
        String email=faker.internet().emailAddress();
        String gender="MALE";
        Boolean isAdviserTeacher=true;
        List<Integer> id=new ArrayList<>();
        id.add(1);
        String name=faker.name().firstName();
        String password="Ankara123";
        String phone="553-161-"+faker.number().digits(4);
        String ssn=faker.idNumber().ssnValid();
        String surname=faker.name().lastName();
        String username=faker.name().username();

        expectedTeacherPojo=new US14_Pojo(birthday,birthplace,email,gender,isAdviserTeacher,id,name,password,phone,ssn,surname,username);
        System.out.println("expectedTeacherPojo = " + expectedTeacherPojo);

        //send the request get the response
        //postman response -bu şekilde gelecek
        /*
        {
    "object": {
        "userId": 412,
        "username": "kcelebi",
        "name": "katip",
        "surname": "celebi",
        "birthDay": "1980-01-01",
        "ssn": "125-32-2525",
        "birthPlace": "Ankara",
        "phoneNumber": "553-161-0110",
        "gender": "MALE",
        "email": "stmasutcu1@gmail.com"
    },
    "message": "Teacher saved successfully",
    "httpStatus": "CREATED"
}
         */
        //POJO İLE OLMADI YORUMA ALDIM.
        //response=given(spec).body(expectedTeacherPojo).post("{first}/{second}");


        expectedMap=new HashMap<>();
        expectedMap.put("birthDay",birthday);
        expectedMap.put("birthPlace",birthplace);
        expectedMap.put("email",email);
        expectedMap.put("gender",gender);
        expectedMap.put("isAdvisorTeacher",isAdviserTeacher);
        expectedMap.put("lessonsIdList",id);
        expectedMap.put("name",name);
        expectedMap.put("password",password);
        expectedMap.put("phoneNumber",phone);
        expectedMap.put("ssn",ssn);
        expectedMap.put("surname",surname);
        expectedMap.put("username",username);



        response=given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("viceDean"), (String) ConfigReader.getProperty("psw"))).body(expectedMap).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Verify the posted datas with response")
    public void VerifyThePostedDatasWithResponse() {
        //do assertion  HEM POJO HEM DE MAP İLE ASSERTİON YAPILDI

        //actual data

        US14_Pojo_Outer actulaDataPojo=response.as(US14_Pojo_Outer.class);
        System.out.println("actulaDataPojo = " + actulaDataPojo);

        System.out.println("responseStatusCode = " + response.statusCode());

        assertEquals(200,response.statusCode());

        assertEquals(expectedTeacherPojo.getName(),actulaDataPojo.getObject().getName());
        assertEquals(expectedTeacherPojo.getSurname(),actulaDataPojo.getObject().getSurname());
        assertEquals(expectedTeacherPojo.getUsername(),actulaDataPojo.getObject().getUsername());
        assertEquals(expectedTeacherPojo.getSsn(),actulaDataPojo.getObject().getSsn());

        idPost=actulaDataPojo.getObject().getUserId();
        System.out.println("idPost = " + idPost);


        //Map ile assertion için object olarak gelen key'in value su toString ile çevrilerek validation yapıldı

        HashMap<String,Object> actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        System.out.println("actualData = " + actualData);

        assertTrue(actualData.get("object").toString().contains(expectedMap.get("name").toString()));
        assertTrue(actualData.get("object").toString().contains(expectedMap.get("surname").toString()));
        assertTrue(actualData.get("object").toString().contains(expectedMap.get("ssn").toString()));
        assertTrue(actualData.get("object").toString().contains(expectedMap.get("username").toString()));
        assertEquals("Teacher saved successfully",actualData.get("message"));
        assertEquals("CREATED",actualData.get("httpStatus"));
    }

    @Given("User update datas with posted teacher id by put request")
    public void userUpdateDatasWithPostedTeacherIdByPutRequest() {
        //set the url
        US14_Pojo_Outer actulaDataPojo=response.as(US14_Pojo_Outer.class);

        int id=actulaDataPojo.getObject().getUserId();


        spec.pathParams("first","teachers","second", "update","third",""+id+"");
        //set the expected data
        /*
        {
  "birthDay": "1980-01-02",
  "birthPlace": "Ankara",
  "email": "masutcu123@gmail.com",
  "gender": "MALE",
  "isAdvisorTeacher": true,
  "lessonsIdList": [
    1
  ],
  "name": "Mehmet",
  "password": "Ali12356",
  "phoneNumber": "553-160-0111",
  "ssn": "553-25-2323",
  "surname": "sutcu",
  "username": "sutcu123"
}
         */
        String birthday="1979-08-13";
        String birthplace=faker.country().capital();
        String email=faker.internet().emailAddress();
        String gender="MALE";
        Boolean isAdviserTeacher=true;
        List<Integer> id1=new ArrayList<>();
        id1.add(1);
        String name=faker.name().firstName();
        String password="Ankara123";
        String phone="553-161-"+faker.number().digits(4);
        String ssn=faker.idNumber().ssnValid();
        String surname=faker.name().lastName();
        String username=faker.name().username();

        expectedTeacherUpdatePojo=new US14_Pojo(birthday,birthplace,email,gender,isAdviserTeacher,id1,name,password,phone,ssn,surname,username);
        System.out.println("expectedTeacherPojo = " + expectedTeacherUpdatePojo);



        expectedMap=new HashMap<>();
        expectedMap.put("birthDay",birthday);
        expectedMap.put("birthPlace",birthplace);
        expectedMap.put("email",email);
        expectedMap.put("gender",gender);
        expectedMap.put("isAdvisorTeacher",isAdviserTeacher);
        expectedMap.put("lessonsIdList",id1);
        expectedMap.put("name",name);
        expectedMap.put("password",password);
        expectedMap.put("phoneNumber",phone);
        expectedMap.put("ssn",ssn);
        expectedMap.put("surname",surname);
        expectedMap.put("username",username);



        response=given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("viceDean"), (String) ConfigReader.getProperty("psw"))).body(expectedMap).put("{first}/{second}/{third}");
        response.prettyPrint();

        //send the request get the response
        /*
        {
    "object": {
        "userId": 539,
        "username": "sutcu123",
        "name": "Mehmet",
        "surname": "sutcu",
        "birthDay": "1980-01-02",
        "ssn": "553-25-2323",
        "birthPlace": "Ankara",
        "phoneNumber": "553-160-0111",
        "gender": "MALE",
        "email": "masutcu123@gmail.com"
    },
    "message": "Teacher updated Successful",
    "httpStatus": "OK"
}
         */

    }


    @Then("Verify the updated datas with response")
    public void VerifyTheUpdatedDatasWithResponse() {
        //do assertion
        US14_Pojo_Outer actulaDataUpdatePojo=response.as(US14_Pojo_Outer.class);
        System.out.println("actulaDataPojo = " + actulaDataUpdatePojo);

        System.out.println("responseStatusCode = " + response.statusCode());

        idPut=actulaDataUpdatePojo.getObject().getUserId();
        System.out.println("idPut = " + idPut);

        assertEquals(idPost,idPut);

        assertEquals(200,response.statusCode());

        assertEquals(expectedTeacherUpdatePojo.getName(),actulaDataUpdatePojo.getObject().getName());
        assertEquals(expectedTeacherUpdatePojo.getSurname(),actulaDataUpdatePojo.getObject().getSurname());
        assertEquals(expectedTeacherUpdatePojo.getUsername(),actulaDataUpdatePojo.getObject().getUsername());
        assertEquals(expectedTeacherUpdatePojo.getSsn(),actulaDataUpdatePojo.getObject().getSsn());


        //Map ile assertion için object olarak gelen key'in value su toString ile çevrilerek validation yapıldı

        HashMap<String,Object> actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        System.out.println("actualData = " + actualData);

        assertTrue(actualData.get("object").toString().contains(expectedMap.get("name").toString()));
        assertTrue(actualData.get("object").toString().contains(expectedMap.get("surname").toString()));
        assertTrue(actualData.get("object").toString().contains(expectedMap.get("ssn").toString()));
        assertTrue(actualData.get("object").toString().contains(expectedMap.get("username").toString()));
        assertEquals("Teacher updated Successful",actualData.get("message"));
        assertEquals("OK",actualData.get("httpStatus"));


    }
}
