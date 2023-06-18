package stepdef.ui;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

import pages.US15_ViceDeanStudent;

import pages.US16_ViceDeanContact;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US16_Steps_Erel {
    US16_ViceDeanContact contact=new US16_ViceDeanContact();
    US15_ViceDeanStudent vice=new US15_ViceDeanStudent();
    Login homePage=new Login();

    @And("Kullanici Menu buttonuna tiklar")
    public void kullaniciMenuButtonunaTiklar() {
        homePage.menu.click();
    }
    @And("Kullanici Menu icersinde Contact Get All secnegine tiklar")
    public void kullaniciMenuIcersindeContactGetAllSecnegineTiklar() {
        //contact.contactGetAll.click();
        ReusableMethods.click(contact.contactGetAll);
    }

    @Then("Silme butonu gorur")
    public void silmeButonuGorur() {
        ReusableMethods.tumSayfaResmi();

    }
    @When("Yazarin name'i gorur")
    public void yazarin_name_i_gorur() {
        assertTrue(contact.contactName.isDisplayed());
    }

    @When("Yazarin emailini gorur")
    public void yazarin_emailini_gorur() {
        assertTrue(contact.contactEmail.isDisplayed());
    }

    @When("Mesaj gonderilme tarihini gorur")
    public void mesaj_gonderilme_tarihini_gorur() {
        assertTrue(contact.contactDate.isDisplayed());
    }

    @When("Mesaj subject textini gorur")
    public void mesaj_subject_textini_gorur() {
        assertTrue(contact.contactSubject.isDisplayed());
    }

    @When("Message textini gorur")
    public void message_textini_gorur() {
        assertTrue(contact.contactMessage.isDisplayed());
    }


    @Then("Kullanici Silme butonuna tiklar")
    public void kullaniciSilmeButonunaTiklar() {
ReusableMethods.tumSayfaResmi();
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

}
