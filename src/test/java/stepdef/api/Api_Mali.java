package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.US08.LessonPojo;
import pojos.us10_11_12.LessonNamePojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class Api_Mali extends ManagementSchoolBaseUrl {
    @Given("post request yaparak  {string} ve {string} ve {string} dataları ile ders olustur")
    public void postRequestYaparakVeVeDatalarıIleDersOlustur(String lesson, Boolean compulsory, String credit) {

        //Set the url  https://managementonschools.com/app/lessons/save  -Query param a gerek yok
       //setUp();
       spec.pathParams("first","lessons","second", "save");

        //Set the expected data
        LessonPojo lessonPojo=new LessonPojo(lesson,compulsory,credit);
        ArrayList<LessonPojo> lesson1 = new ArrayList<>();
        lesson1.add(lessonPojo);


        //Send the request and get the response
        Response response=given(spec).get("{first},{second}");
        response.prettyPrint();



    }

    @Then("response ile post edilen {string} ve {string} ve {string} datalarini dogrula")
    public void responseIlePostEdilenVeVeDatalariniDogrula(String lesson, Boolean compulsory, String credit) {


    }


}
