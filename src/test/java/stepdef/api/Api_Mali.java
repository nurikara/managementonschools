package stepdef.api;

import baseUrl.ManagementSchoolBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pojos.us08.LessonPojo;
import pojos.us08.OuterPojoUS08;
import pojos.us14.US14_Pojo;
import utilities.ObjectMapperUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Api_Mali extends ManagementSchoolBaseUrl {

    LessonPojo expectedLessonPojo;

    Response response;
    String lessonId;
    HashMap expectedDataMap;
    HashMap exDataMap;




    //US08

    @Given("create lesson with_{string}_{string}_{string}_datas_by post request")
    public void createLessonWith____datas_byPostRequest(String arg0, String arg1, String arg2) {
     /*
                {
                "compulsory": true,
                "creditScore": 0,
                "lessonName": "string"
                }
         */
        //Set the url  https://managementonschools.com/app/lessons/save  -Query param a gerek yok

        spec.pathParams("first","lessons","second", "save");


        //Set the expected data 3 ŞEKİLDE OLUŞTURABİLİRİZ 1.String 2. Map 3. Pojo

        //1.String ile
        String expectedDataString ="{\n" +
                "                \"compulsory\": "+arg1+",\n" +
                "                \"creditScore\": "+arg2+",\n" +
                "                \"lessonName\": \""+arg0+"\"\n" +
                "                }";
        System.out.println("expectedDataString = " + expectedDataString);

        //2. Map ile

        exDataMap = new HashMap<>();
        exDataMap.put("compulsory",arg1);
        exDataMap.put("creditScore",arg2);
        exDataMap.put("lessonName",arg0);
        System.out.println("exDataMap = " + exDataMap);

        //3. pojo ile
        expectedLessonPojo=new LessonPojo(""+arg0+"",""+arg1+"",""+arg2+"","");
        System.out.println("expectedLessonPojo : "+expectedLessonPojo);

        //Send the request and get the response

        //response=given(spec).body(expectedDataString).post("{first}/{second}");
        //response=given(spec).body(exDataMap).post("{first}/{second}");
        response=given(spec).body(expectedLessonPojo).post("{first}/{second}");
        response.prettyPrint();

        //3 şekilde de adım PASS oldu

    }
    @And("verify the response datas with posted")
    public void verifyTheResponseDatasWithPosted() throws JsonProcessingException {
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
        //Do assertion 6 şekilde yapılabilir
        //1. Yol: then() methodu + HamcrestMatcher
        //2. Yol: JsonPath ile
        //3. Yol: Map ile
        //4. Yol: Pojo class ile
        //5. Yol: pojo class + ObjectMapper ile (Tavsiye edilen)
        //6. Yol: pojo class + Gson ile


        System.out.println("response.asString() = " + response.asString());

        //1. yol
        response.then().
                statusCode(200).
                contentType("application/json").
                body("message", Matchers.equalTo("Lesson Created")).
                body("httpStatus", Matchers.equalTo("OK")); //object girmedik body leri ayrı method yapmasa idil soft assertion oluyordu

        //2.yol Json . zaten response ile dönen data Json formatında

        JsonPath jsonPath = response.jsonPath();
        System.out.println("jsonPath = " + jsonPath.prettyPrint());

        System.out.println("jsonPath.getMap(\"object\").get(\"lessonName\") = " + jsonPath.getMap("object").get("lessonName").toString());
        //response um bir list değil, olsaydı getList() metodu ve Groovy language kullanacaktım
        assertEquals(""+expectedLessonPojo.getLessonName()+"",jsonPath.getMap("object").get("lessonName"));
        assertEquals("Lesson Created", jsonPath.getString("message"));
        assertEquals("OK", jsonPath.getString("httpStatus"));
        assertEquals(200, response.statusCode());

        //3. Yol: Map ile

        Map<String, Object> actDataMap = response.as(HashMap.class); //de-serializiation

        assertTrue( actDataMap.get("object").toString().contains(exDataMap.get("lessonName").toString()));
        assertTrue( actDataMap.get("object").toString().contains(exDataMap.get("creditScore").toString()));
        assertTrue( actDataMap.get("message").toString().contains("Lesson Created"));

        //4. yol pojo class ile
        OuterPojoUS08 actualPojo=response.as(OuterPojoUS08.class); //de-serializiation

        assertEquals(expectedLessonPojo.getLessonName(), actualPojo.getObject().getLessonName());
        assertEquals(expectedLessonPojo.getCompulsory(), actualPojo.getObject().getCompulsory());
        assertEquals(expectedLessonPojo.getCreditScore(), actualPojo.getObject().getCreditScore());
        assertEquals("Lesson Created", actualPojo.getMessage());
        assertEquals("OK", actualPojo.getHttpStatus());


        //5. Yol: pojo class + ObjectMapper ile (Tavsiye edilen) de-serialization işlemi readValue() metodu ile istediğin class a dönüştürüyor
        OuterPojoUS08 actualDataObjectMapper= new ObjectMapper().readValue(response.asString(), OuterPojoUS08.class);
        lessonId=actualDataObjectMapper.getObject().getLessonId();
        System.out.println("lessonId: "+lessonId);
        System.out.println("actualData = " + actualDataObjectMapper.getObject().getLessonName());

        assertEquals(expectedLessonPojo.getLessonName(), actualDataObjectMapper.getObject().getLessonName());
        assertEquals(expectedLessonPojo.getCreditScore(), actualDataObjectMapper.getObject().getCreditScore());
        assertEquals(expectedLessonPojo.getCompulsory(), actualDataObjectMapper.getObject().getCompulsory());

        //6. Yol: pojo class + Gson ile , objectMapper(readValue() den farkı read Value exception atıyon Gson atmıyor)
        OuterPojoUS08 actualDataPojoGson = new Gson().fromJson(response.asString(), OuterPojoUS08.class);

        assertEquals(expectedLessonPojo.getLessonName(), actualDataPojoGson.getObject().getLessonName());
        assertEquals(expectedLessonPojo.getCreditScore(), actualDataPojoGson.getObject().getCreditScore());
        assertEquals(expectedLessonPojo.getCompulsory(), actualDataPojoGson.getObject().getCompulsory());

    }





    //US09
    @Given("lesson with the name_{string}_deletes by del request")
    public void lessonWithTheName__deletesByDelRequest(String arg0) {
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

    @And("Verify the deleted datas with response")
    public void verifyTheDeletedDatasWithResponse() {
        System.out.println("response.asString() = " + response.asString());

        HashMap actualData=new HashMap();
        actualData= ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        assertEquals(expectedDataMap.get("message"),actualData.get("message"));
        assertEquals(expectedDataMap.get("httpStatus"),actualData.get("httpStatus"));

    }



}
