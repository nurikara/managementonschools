package stepdef.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Login;
import pages.US08_US09_ViceDeanAddLesson;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.xml.xpath.XPath;


public class US08_Steps_Mali {
    US08_US09_ViceDeanAddLesson locate=new US08_US09_ViceDeanAddLesson();
    WebDriver driver= Driver.getDriver();

    Faker faker=new Faker();



    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {driver.close();
    }

    @Given("Kullanici Lessons basligini tiklar")
    public void kullaniciLessonsBasliginiTiklar() {
        locate.Lessons.click();

    }
    @Then("LessonName alanina ders ismi girer")
    public void lessonnameAlaninaDersIsmiGirer() {
        String name=faker.app().name();
        locate.lessonName.sendKeys(name);
        ReusableMethods.bekle(1);
    }
    @Then("Coppulsory checkbox kutusunu tiklar")
    public void coppulsoryCheckboxKutusunuTiklar() {
        locate.compulsoryCheckbox.click();
        ReusableMethods.bekle(1);
    }

    @Then("CreditScore input alanı int deger girer")
    public void creditscoreInputAlanıIntDegerGirer() {
        locate.creditScore.sendKeys("5");
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

    @Then("Kayıtlanan data son sayfada goruntulenir")
    public void kayıtlananDataSonSayfadaGoruntulenir() {
      //  ReusableMethods.scroll(locate.schollLogo);
      //  ReusableMethods.bekle(1);
      //  locate.goLastPage.click();
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
}
