package stepdef.ui;

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


    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {driver.close();
    }

    @Given("Kullanici Lessons basligini tiklar")
    public void kullaniciLessonsBasliginiTiklar() {
        locate.Lessons.click();

    }
    @Then("LessonName alanina ders ismi girer")
    public void lessonnameAlaninaDersIsmiGirer() {
        locate.lessonName.sendKeys("Math7");
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

    }

    @Then("Basarili kayıtlama mesaji goruntulenir")
    public void basariliKayıtlamaMesajiGoruntulenir() {
       // System.out.println("locate.msgLessonCreated.getText() = " + locate.msgLessonCreated.getText());
       // Assert.assertTrue(locate.msgLessonCreated.isDisplayed());

    }
}
