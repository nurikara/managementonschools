package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.US01_AdayOgRegister;
import pages.US03_Contact;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_Steps_Mehmet {

    US03_Contact us03Contact;
    @And("kullanici_contact_butonuna_tiklar")
    public void kullanici_contact_butonuna_tiklar() {
        us03Contact = new US03_Contact();
        us03Contact.contact.click();
    }

    @Then("kullanici_cikan_pencerede_verilen_bilgileri_girer {string}, {string}, {string}, {string}")
    public void kullanici_cikan_pencerede_verilen_bilgileri_girer(String name, String email, String subject, String message) {
        us03Contact = new US03_Contact();
        us03Contact.name.sendKeys(name, Keys.TAB, email, Keys.TAB, subject, Keys.TAB, message);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici_sendMessage_butonuna_tiklar")
    public void kullanici_sendmessage_butonuna_tiklar() {
        us03Contact = new US03_Contact();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", us03Contact.sendMessage);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici_basarili_sekilde_mesaj_gonderdigini_dogrular")
    public void kullanici_basarili_sekilde_mesaj_gonderdigini_dogrular() {
        us03Contact = new US03_Contact();
        String expectedText = "Contact Message Created Successfully";
        String actualText = us03Contact.message.getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedText, actualText);
    }


    @And("kullanici_mesaj_gonderemedigini_dogrular")
    public void kullanici_mesaj_gonderemedigini_dogrular() {
        us03Contact = new US03_Contact();
        System.out.println("Tum alanlar doldurulmalidir.");
        System.out.println(us03Contact.email.getAttribute("value"));
        Assert.assertNotEquals("", us03Contact.email.getAttribute("value"));
    }


    @And("kullanici_emaili_bos_birakinca_mesaj_gonderemedigini_dogrular")
    public void kullanici_emaili_bos_birakinca_mesaj_gonderemedigini_dogrular() {
        us03Contact = new US03_Contact();
        System.out.println("Tum alanlar doldurulmalidir.");
        Assert.assertNotEquals("", us03Contact.name.getAttribute("value"));
    }


    @And("kullanici_ilgili_alaninin_altinda_{string}_yazisini_dogrular")
    public void kullanici_ilgili_alaninin_altinda__yazisini_dogrular(String mesaj) {
        us03Contact = new US03_Contact();
        Assert.assertEquals(mesaj, us03Contact.required.getText());
    }


}
