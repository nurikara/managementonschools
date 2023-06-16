package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import pages.Login;
import pages.US08_US09_ViceDeanAddLesson;
import utilities.ConfigReader;
import utilities.Driver;


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
}
