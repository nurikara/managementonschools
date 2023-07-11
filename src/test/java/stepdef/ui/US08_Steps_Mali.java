package stepdef.ui;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.US08_US09_ViceDeanAddLesson;
import pojos.us08.LessonPojo;
import pojos.us08.OuterPojoUS08;
import utilities.*;
import utilities.ReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static baseUrl.ManagementSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.AuthenticationManagementonSchool.generateToken;


public class US08_Steps_Mali {
    US08_US09_ViceDeanAddLesson locate=new US08_US09_ViceDeanAddLesson();
    WebDriver driver= Driver.getDriver();
    String msg;
    String httpSt;
    static OuterPojoUS08 actualData;

    Response response;

    static String name;
    static String creditScore;
    static String compulsory="true";
    ResultSet resultSet;

    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {driver.close();

    }

    @Given("Kullanici Lessons basligini tiklar")
    public void kullaniciLessonsBasliginiTiklar() {
        ReusableMethods.scroll(locate.lessons);
        locate.lessons.click();

    }

    @Then("Coppulsory checkbox kutusunu tiklar")
    public void coppulsoryCheckboxKutusunuTiklar() {
        locate.compulsoryCheckbox.click();
        ReusableMethods.bekle(1);
}



    @Then("Submit butonunu tiklar")
    public void submitButonunuTiklar() throws InterruptedException {
        locate.addLessonSubmit.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaResmi();


    }

    @Then("Basarili kayıtlama mesaji goruntulenir")
    public void basariliKayıtlamaMesajiGoruntulenir() throws InterruptedException {
        Assert.assertTrue(locate.msgLessonCreated2.isDisplayed());
        System.out.println("locate.msgLessonCreated.getText() = " + locate.msgLessonCreated2.getText());
        String msg=locate.msgLessonCreated2.getText();
        System.out.println("msg2 = " + msg);

    }

    @Then("LessonName alanina space data girer")
    public void lessonnameAlaninaSpaceDataGirer() {
        locate.lessonName.sendKeys("   ");
        ReusableMethods.bekle(1);
    }

    @And("sayfa kapatılır")
    public void sayfaKapatılır() {
        driver.close();
    }



    @Then("Basarisiz giris mesaji goruntulenir")
    public void basarisizGirisMesajiGoruntulenir() {
        Assert.assertTrue(locate.msgLessonCreated2.isDisplayed());
        String expectedData="Lesson name must consist of the characters .";
        String actualData=locate.msgLessonCreated2.getText();
        Assert.assertEquals(expectedData,actualData);
        System.out.println("locate.msgLessonCreated2.getText() = " + locate.msgLessonCreated2.getText());
        driver.navigate().refresh();
    }

    @And("Compulsory Checkbox kutusunu isaretler")
    public void compulsoryCheckboxKutusunuIsaretler() {
        locate.compulsoryCheckbox.click();
        ReusableMethods.bekle(1);
    }

    @Then("checkbox kutusunun isaretle oldugunu test eder")
    public void checkboxKutusununIsaretleOldugunuTestEder() {
        Assert.assertTrue(locate.compulsoryCheckbox.isSelected());
        ReusableMethods.bekle(1);
    }

    @Then("checkbox kutusunun isaretin kalkdigini test eder")
    public void checkboxKutusununIsaretinKalkdiginiTestEder() {
        Assert.assertFalse(locate.compulsoryCheckbox.isSelected());
        ReusableMethods.bekle(1);
    }

    @Then("CreditScore input alanına gecersiz {string} deger girer")
    public void creditscoreInputAlanınaGecersizDegerGirer(String arg0) {
        locate.creditScore.sendKeys(arg0);
        ReusableMethods.bekle(1);
    }

    @And("input alanlarını temizler")
    public void inputAlanlarınıTemizler() {
        driver.navigate().refresh();
    }

    @And("Girilen degerin kabul edilmedigi dogrulanir")
    public void girilenDegerinKabulEdilmedigiDogrulanir() {
        ReusableMethods.tumSayfaResmi();
       String msg=locate.msgLessonCreated2.getText().toLowerCase();
        System.out.println("msg3 = " + msg);
        if(msg.contains("lesson created")){
          Assert.assertTrue(locate.msgLessonCreated2.getText().contains("error"));
      }


    }

    @And("sayfa iceriginde LessonList goruntulenir")
    public void sayfaIcerigindeLessonListGoruntulenir() {
        Assert.assertTrue(locate.lessonList.isDisplayed());
    }

    @And("LessonList son sayfaya gidilir")
    public void lessonlistSonSayfayaGidilir() {
        ReusableMethods.click(locate.goLastPage);
        ReusableMethods.bekle(2);
    }

    @And("kayıtlanan son data isim compulsory creditscore kontrol edilir")
    public void kayıtlananSonDataIsimCompulsoryCreditscoreKontrolEdilir() {
        ReusableMethods.scroll(locate.lessonList);
        List<WebElement> actualData=driver.findElements(By.xpath("//td"));
        for (int i = 0; i <actualData.size()-1 ; i++) {

            if (actualData.get(i).getText().contains(name)){
                System.out.println("actualData lessonname = " + actualData.get(i).getText());
                Assert.assertEquals(name,actualData.get(i).getText());
                Assert.assertEquals("Yes",actualData.get(i+1).getText());
                System.out.println("actualData compulsory = " + actualData.get(i + 1).getText());
                Assert.assertEquals(creditScore,actualData.get(i+2).getText());
                System.out.println("actualData  creditScore = " + actualData.get(i + 2).getText());

            }

        }
    }

    @And("Son kayıtlanan data satirinda bulunan delete ikonuna tiklar")
    public void sonKayıtlananDataSatirindaBulunanDeleteIkonunaTiklar() {
        List<WebElement> cop=locate.cop;

        int numofLastElement=cop.size();
        System.out.println("numofLastElement = " + numofLastElement);
        driver.findElement(By.xpath("(//i[@class='fa-solid fa-trash'])["+numofLastElement+"]")).click();
       // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // js.executeScript("arguments["+numofLastElement+"].click();", cop);
        ReusableMethods.bekle(1);
    }

    @And("Ekranda basarili silme mesaji goruntulenir")
    public void ekrandaBasariliSilmeMesajiGoruntulenir() {
        String actualData=locate.msgLessonCreated2.getText();
        System.out.println("actualData = " + actualData);
        Assert.assertTrue(actualData.contains("Lesson Deleted"));
    }



    @Then("Cagırılan ders {string}, {string}, {string} bilgilerini icerir")
    public void cagırılanDersBilgileriniIcerir(String dersismi, String compulsory, String creditScore) throws SQLException {

        String actualLessonName=resultSet.getString("lesson_name");
        System.out.println("lessonName = " + actualLessonName);
        String actualCompulsory=resultSet.getString("is_compulsory");
        System.out.println("actualCompulsory = " + actualCompulsory);
        String actualCreditScore=resultSet.getString("credit_score");
        System.out.println("actualCreditScore = " + actualCreditScore);



        Assert.assertEquals(dersismi,actualLessonName);
        Assert.assertEquals(compulsory,actualCompulsory);
        Assert.assertEquals(creditScore,actualCreditScore);

    }

    @Then("LessonName alanina {string} ismi girer")
    public void lessonnameAlaninaIsmiGirer(String arg0) {
        name=arg0;
        locate.lessonName.sendKeys(name);
        ReusableMethods.bekle(1);
    }

    @Then("CreditScore input alanı {string}  deger girer")
    public void creditscoreInputAlanıDegerGirer(String arg0) {
        creditScore=arg0;
        locate.creditScore.sendKeys(creditScore);
        ReusableMethods.bekle(1);
    }

    @Given("Kayıtlamasi yapilan {string} ve {string} ile ders bilgileri cagırılır")
    public void kayıtlamasiYapilanVeIleDersBilgileriCagırılır(String ders, String credit) throws SQLException {
        locate.lessons.click();
        name=ders;
        locate.lessonName.sendKeys(name);
        ReusableMethods.bekle(1);
        locate.compulsoryCheckbox.click();
        ReusableMethods.bekle(1);
        locate.creditScore.sendKeys(credit);
        ReusableMethods.bekle(1);
        locate.addLessonSubmit.click();
        ReusableMethods.bekle(1);

        String quary="SELECT * FROM lesson WHERE lesson_name='"+ders+"'";
        System.out.println("quary = " + quary);
        resultSet=DataBaseUtils.getResultSet(quary);
        resultSet.next();

    }


    @And("UPDATE BUTTON yok fail durumu için sayfa resmini alır")
    public void updateBUTTONYokFailDurumuIcinSayfaResminiAlır() {
        ReusableMethods.webElementResmi(locate.addLessonUpdateElement);
        boolean updateElementVarMi = false;
        Assert.assertTrue("Element sayfada bulunamadı.", updateElementVarMi);

    }


    @Given("DataBase Connection saglanir ve kayitlamasi yapilan dersismi ile ders bilgileri cagrilir")
    public void databaseConnectionSaglanirVeKayitlamasiYapilanDersismiIleDersBilgileriCagrilir() throws SQLException {
        String quary="SELECT * FROM lesson WHERE lesson_name='"+name+"'";
        resultSet=DataBaseUtils.getResultSet(quary);//get result set metodunu  utilsden çekiyoruz. burada connection metodları var.
        resultSet.next(); //next() metodu olmasa pointer tablonun header ını işaret ediyor.


    }

    @Then("Ders datalarının dogrulugu test edilir")
    public void dersDatalarınınDogruluguTestEdilir() throws SQLException {

        String actualLessonName=resultSet.getString("lesson_name");
        System.out.println("lessonName = " + actualLessonName);
        String actualCompulsory=resultSet.getString("is_compulsory");
        System.out.println("actualCompulsory = " + actualCompulsory);
        String actualCreditScore=resultSet.getString("credit_score");
        System.out.println("actualCreditScore = " + actualCreditScore);



        Assert.assertEquals(name,actualLessonName);
        Assert.assertEquals(compulsory.substring(0,1),actualCompulsory);
        Assert.assertEquals(creditScore,actualCreditScore);



    }

    @Given("get request ile olusturulan ders bilgilerini cagirilir")
    public void getRequestIleOlusturulanDersBilgileriniCagirilir() {
        //Set the url ==> swagger dan bak ==> https://managementonschools.com/app/lessons/getLessonByName?lessonName=borsa1

        spec.pathParams("first","lessons","second", "getLessonByName").queryParam("lessonName",""+name+"");

        //Get request yapılacağı için expexted data ya gerek yok

        //Send the request and get the response

        response=given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("viceDean"), (String) ConfigReader.getProperty("psw"))).get("{first}/{second}");
        response.prettyPrint();

        //postman de yapılan manuel teste göre response bu şekilde olmalıdır.
        /*
        {
            "object": {
            "lessonId": 1022,
                    "lessonName": "borsa3",
                    "creditScore": 2,
                    "compulsory": true
        },
            "message": "Lesson successfully found"
        }
        */
    }

    @And("gonderilen data ile gelen response datanin dogrulamasi yapilir")
    public void gonderilenDataIleGelenResponseDataninDogrulamasiYapilir() {
        //burada tavsiye edilen ObjectMapperUtils (readValue()metodu) kullanıyoruz.
        actualData=ObjectMapperUtils.convertJsonToJava(response.asString(), OuterPojoUS08.class);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(name,actualData.getObject().getLessonName());
        Assert.assertEquals(creditScore,actualData.getObject().getCreditScore());
        Assert.assertEquals(compulsory,actualData.getObject().getCompulsory());
        Assert.assertEquals("Lesson successfully found",actualData.getMessage());

        //Aynı assertionlar Gson objesi kullanarakda yapılabilir. Gson için pom a dependency eklendi.
        OuterPojoUS08 actualDataGson = new Gson().fromJson(response.asString(), OuterPojoUS08.class);
        System.out.println("actualDataGson = " + actualDataGson);
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(name,actualDataGson.getObject().getLessonName());
        Assert.assertEquals(creditScore,actualDataGson.getObject().getCreditScore());
        Assert.assertEquals(compulsory,actualDataGson.getObject().getCompulsory());
        Assert.assertEquals("Lesson successfully found",actualDataGson.getMessage());



    }

    @Given("LessonId ile DelRequest gonderilir")
    public void lessonidIleDelRequestGonderilir() {
        //Set the url ==> swagger dan bak ==> https://managementonschools.com/app/lessons/delete/125

        System.out.println("dataMap.get(\"Object.lessonId\") = " + actualData.getObject().getLessonId());
        spec.pathParams("first","lessons","second", "delete","third",""+actualData.getObject().getLessonId()+"");

        //Del request manuel test POSTMAN bekelenen veri outer pojo, inner pojo kısmı siliniyor.
        /*
        {
    "message": "Lesson Deleted",
    "httpStatus": "OK"
        }
         */
        msg="Lesson Deleted";
        httpSt="OK";

        //Send the request and get the response

        response=given(spec).header("Authorization", generateToken((String) ConfigReader.getProperty("viceDean"), (String) ConfigReader.getProperty("psw"))).delete("{first}/{second}/{third}");
        response.prettyPrint();

        
    }

    @And("Silinen derse ait datalarin dogrulamasi yapilir")
    public void silinenDerseAitDatalarinDogrulamasiYapilir() {
       OuterPojoUS08 delIssue= ObjectMapperUtils.convertJsonToJava(response.asString(), OuterPojoUS08.class);

       Assert.assertEquals(200,response.statusCode());
       Assert.assertEquals(null,delIssue.getObject());
       Assert.assertEquals(msg,delIssue.getMessage());
       Assert.assertEquals(httpSt,delIssue.getHttpStatus());


    }


    @And("fill all the inputs with faker {string}_ {string}")
    public void fillAllTheInputsWithFaker_(String arg0, String arg1) {
        locate.lessons.click();
        Faker faker=new Faker();
        if(arg0.equals("<fake.lessonName>")){
            arg0=faker.app().name();
            System.out.println("arg0 = " + arg0);
            locate.lessonName.sendKeys(arg0);
        }
        if(arg1.equals("<fake.creditScore>")){
            arg1=String.valueOf(faker.number().numberBetween(1,10));
            System.out.println("arg1 = " + arg1);
            locate.creditScore.sendKeys(arg1);

        }

    }
}
