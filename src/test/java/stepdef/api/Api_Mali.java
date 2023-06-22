package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.US08.LessonPojo;
import pojos.US08.OuterPojoUS08;
import pojos.us10_11_12.ExpectedDataPojo;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api_Mali extends ManagementSchoolBaseUrl {

    LessonPojo expectedLessonPojo;
    OuterPojoUS08 outerPojo;
    Response response;




    @Given("post request yaparak  istenen datalar ile ders olustur")
    public void postRequestYaparakIstenenDatalarIleDersOlustur() {



        //Set the url  https://managementonschools.com/app/lessons/save  -Query param a gerek yok
        setUp();
        spec.pathParams("first","lessons","second", "save");

        //Set the expected data
       // expectedLessonPojo=new LessonPojo("Gukuk",true,5);
        System.out.println(expectedLessonPojo);

        //Send the request and get the response

        response=given(spec).body(expectedLessonPojo).post("{first}/{second}");
        response.prettyPrint();

    }
    @Then("response ile post edilen  datalarini dogrula")
    public void responseIlePostEdilenDatalariniDogrula() {
        /*
         "object": {
        "lessonId": 509,
        "lessonName": "hukukgukuk",
        "creditScore": 1,
        "compulsory": true
    },
    "message": "Lesson Created",
    "httpStatus": "OK"
}
         */
        System.out.println("response.asString() = " + response.asString());


        OuterPojoUS08 actualDataObjectMapper= ObjectMapperUtils.convertJsonToJava(response.asString(), OuterPojoUS08.class);
        System.out.println("actualData = " + actualDataObjectMapper.getObject().getLessonName());

        //LessonPojo actualDataPojoGson = new Gson().fromJson(response.asString(), LessonPojo.class);

        assertEquals(expectedLessonPojo.getLessonName(), actualDataObjectMapper.getObject().getLessonName());
        assertEquals(expectedLessonPojo.getCreditScore(), actualDataObjectMapper.getObject().getCreditScore());
        assertEquals(expectedLessonPojo.getCompulsory(), actualDataObjectMapper.getObject().getCompulsory());

    }

    @Given("post request yaparak {string}_{string}_{string}  datalar ile ders olustur")
    public void postRequestYaparak__DatalarIleDersOlustur(String arg0, String arg1, String arg2) {
         /*
                {
                "compulsory": true,
                "creditScore": 0,
                "lessonName": "string"
                }
         */
        //Set the url  https://managementonschools.com/app/lessons/save  -Query param a gerek yok
        setUp();
        spec.pathParams("first","lessons","second", "save");

        //Set the expected data  //DİKKAT: arg1 değeri BOOLEAN DATA YANİ 'true' yada 'false' olmalıdır.

        expectedLessonPojo=new LessonPojo(""+arg0+"",""+arg1+"",""+arg2+"","");
        System.out.println(expectedLessonPojo);

        //Send the request and get the response

        response=given(spec).body(expectedLessonPojo).post("{first}/{second}");
        response.prettyPrint();

    }
}
