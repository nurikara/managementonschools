package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Login;
import pages.US07_DeanMessage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US07_Steps_Ismail {

    WebDriver driver = Driver.getDriver();
    US07_DeanMessage deanMessage=new US07_DeanMessage();
    Login login=new Login();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanıcı adrese gider")
    public void kullanıcıAdreseGider() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @And("Kullanıcı geçerli  DEAN OLARAK user name girer")
    public void kullanıcıGecerliDEANOLARAKUserNameGirer() {
        login.username.sendKeys(ConfigReader.getProperty("dean"));
    }

    @And("Kullanıcı geçerli  DEAN OLARAK password girer")
    public void kullanıcıGecerliDEANOLARAKPassword() {
        login.password.sendKeys(ConfigReader.getProperty("psw"), Keys.TAB,Keys.ENTER);
    }

    @And("Kullanıcı menuden Contact-getAll e tıklar")
    public void kullanıcıMenudenContactGetAllETıklar() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(deanMessage.ContactGetAll);

    }

    @Then("Kullanici silme butonunu görür")
    public void kullaniciSilmeButonunuGorur() {
       scrollEnd();
        bekle(2);
       scrollHome();
        bekle(2);
        boolean deleteElement= false;
        Assert.assertTrue("Delete islemi icin herhangi bir element bulunamadı",deleteElement);
        ReusableMethods.tumSayfaResmi();
    }

    @Then("Kullanici mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görür")
    public void kullaniciMesajlarıYazarlarınıEMailleriniGonderilmeTarihiVeSubjectBilgileriniGorur() {
        assertTrue(deanMessage.contactName.isDisplayed());
        assertTrue(deanMessage.contactEmail.isDisplayed());
        assertTrue(deanMessage.contactDate.isDisplayed());
        assertTrue(deanMessage.contactSubject.isDisplayed());
        assertTrue(deanMessage.contactMessage.isDisplayed());

    }


    @And("Kullanıcı Menu buttonuna tiklar")
    public void kullanıcıMenuButtonunaTiklar() {

            login.menu.click();
    }


    @Then("Kullanici mesajları siler")
    public void kullaniciMesajlarıSiler() {
        boolean deleteElement= false;
        Assert.assertTrue("Delete islemi icin herhangi bir element bulunamadı",deleteElement);
        ReusableMethods.tumSayfaResmi();
    }
}
