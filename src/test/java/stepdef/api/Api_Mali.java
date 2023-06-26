package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.us08.LessonPojo;
import pojos.us08.OuterPojoUS08;
import pojos.us14.US14_Pojo;
import utilities.ObjectMapperUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api_Mali extends ManagementSchoolBaseUrl {

    LessonPojo expectedLessonPojo;
    OuterPojoUS08 expectedDataOuterPojo;
    OuterPojoUS08 outerPojo;
    Response response;
    String lessonId;
    HashMap expectedDataMap;




    //US08
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

        //Set the expected data

        expectedLessonPojo=new LessonPojo(""+arg0+"",""+arg1+"",""+arg2+"","");
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
        lessonId=actualDataObjectMapper.getObject().getLessonId();
        System.out.println("lessonId: "+lessonId);
        System.out.println("actualData = " + actualDataObjectMapper.getObject().getLessonName());

        //LessonPojo actualDataPojoGson = new Gson().fromJson(response.asString(), LessonPojo.class);

        assertEquals(expectedLessonPojo.getLessonName(), actualDataObjectMapper.getObject().getLessonName());
        assertEquals(expectedLessonPojo.getCreditScore(), actualDataObjectMapper.getObject().getCreditScore());
        assertEquals(expectedLessonPojo.getCompulsory(), actualDataObjectMapper.getObject().getCompulsory());

    }




    //US09

    @Given("del request yaparak ismi {string} verilen lesson silinir")
    public void delRequestYaparakIsmiVerilenLessonSilinir(String arg0) {
        //del request yapmamız için silinecek id bilinmesi gerekir. dolayısıyla önce get request yapılarak id alınmalıdır.
        //birinci aşama get request by lessonname
        //set the url
        setUp();
        spec.pathParams("first","lessons","second", "getLessonByName").queryParam("lessonName",""+arg0+"");
        //Send the request and get the response
        response=given(spec).get("{first}/{second}");
        response.prettyPrint();
        OuterPojoUS08 actualDataObjectMapper= ObjectMapperUtils.convertJsonToJava(response.asString(), OuterPojoUS08.class);
        String id=actualDataObjectMapper.getObject().getLessonId(); //id yi aldık
        System.out.println("id = " + id);

        //delete request işlemi https://managementonschools.com/app/lessons/delete/632  baseurl

        //set the url

        spec.pathParams("first","lessons","second", "delete","third",""+id+"");


        //Set the expected data
         /*
        {
    "message": "Lesson Deleted",
    "httpStatus": "OK"
}
}
         */
        // map ile
        expectedDataMap = new HashMap<>();
        expectedDataMap.put("message", "Lesson Deleted");
        expectedDataMap.put("httpStatus", "OK");


        //Send the request and get the response

        response=given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();

    }



    @And("Delete edilen datanin gelen Response dogrulamasi yapilir")
    public void deleteEdilenDataninGelenResponseDogrulamasiYapilir() {
        System.out.println("response.asString() = " + response.asString());

        HashMap actualData=new HashMap();
        actualData= ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        assertEquals(expectedDataMap.get("message"),actualData.get("message"));
        assertEquals(expectedDataMap.get("httpStatus"),actualData.get("httpStatus"));

    }


}
