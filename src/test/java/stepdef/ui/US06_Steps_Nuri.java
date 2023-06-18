package stepdef.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US06_Dean_ViceDean;
import utilities.ConfigReader;
import utilities.Driver;

public class US06_Steps_Nuri {
    US06_Dean_ViceDean login = new US06_Dean_ViceDean();

    @When("Admin kullanici adi ve sifresini kullanarak Dean panaline giris yapar")
    public void admin_kullanici_adi_ve_sifresini_kullanarak_dean_panaline_giris_yapar() throws InterruptedException {
        login.homePageLogin.click();
        login.username.sendKeys(ConfigReader.getProperty("dean"));
        Thread.sleep(1000);
        login.password.sendKeys(ConfigReader.getProperty("psw"), Keys.TAB, Keys.ENTER);

        Thread.sleep(1000);

    }
    @When("Add ViseDean yazigi goruntulenir")
    public void add_vise_dean_yazigi_goruntulenir() {

        Assert.assertTrue(login.addViseDean.isDisplayed());

    }
    @Then("Add ViseDean bolumu doldurulurken name kismi bos birakilir")
    public void add_vise_dean_bolumu_doldurulurken_name_kismi_bos_birakilir() throws InterruptedException {


        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_UP).perform();
        login.addViseDeanSurname.sendKeys("Kara");
        Thread.sleep(1000);
        login.addViseBirthPlace.sendKeys("Yozgat");
        Thread.sleep(1000);
        login.addViseDeanMALE.click();
        Thread.sleep(1000);
        login.addViseDeanBIRTHDAY.sendKeys("20.09.1982");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-2566");
        Thread.sleep(1000);
        login.addViseDeanSSN.sendKeys("123-12-1234");
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys("nurikara");
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);

        Assert.assertTrue(login.addViseDeanRequired.isDisplayed());

    }


    @Then("Add ViseDean bolumu doldurulurken surnema kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenSurnemaKismiBosBirakilir() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_UP).perform();
        login.addViseDeanName.sendKeys("Nuri");
        Thread.sleep(1000);
        login.addViseBirthPlace.sendKeys("Yozgat");
        Thread.sleep(1000);
        login.addViseDeanMALE.click();
        Thread.sleep(1000);
        login.addViseDeanBIRTHDAY.sendKeys("20.09.1982");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-2566");
        Thread.sleep(1000);
        login.addViseDeanSSN.sendKeys("123-12-1234");
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys("nurikara");
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);

        Assert.assertTrue(login.addViseDeanRequired.isDisplayed());


    }

    @Then("Add ViseDean bolumu doldurulurken brithPlace kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenBrithPlaceKismiBosBirakilir() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_UP).perform();
        login.addViseDeanName.sendKeys("Nuri");
        Thread.sleep(1000);
        login.addViseDeanSurname.sendKeys("Kara");
        Thread.sleep(1000);
        login.addViseDeanMALE.click();
        Thread.sleep(1000);
        login.addViseDeanBIRTHDAY.sendKeys("20.09.1982");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-2566");
        Thread.sleep(1000);
        login.addViseDeanSSN.sendKeys("123-12-1234");
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys("nurikara");
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);

        Assert.assertTrue(login.addViseDeanRequired.isDisplayed());
    }

    @Then("Add ViseDean bolumu doldurulurken Cinsiyet kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenCinsiyetKismiBosBirakilir() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        login.addViseDeanName.sendKeys("Nuri");
        Thread.sleep(1000);
        login.addViseDeanSurname.sendKeys("Kara");
        Thread.sleep(1000);
        login.addViseBirthPlace.sendKeys("Yozgat");
        Thread.sleep(1000);
        login.addViseDeanBIRTHDAY.sendKeys("20.09.1982");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-2566");
        Thread.sleep(1000);
        login.addViseDeanSSN.sendKeys("123-12-1234");
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys("nurikara");
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(2000);


    }

    @Then("Add ViseDean bolumu doldurulurken DogumTarihi kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenDogumTarihiKismiBosBirakilir() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        login.addViseDeanName.sendKeys("Nuri");
        Thread.sleep(1000);
        login.addViseDeanSurname.sendKeys("Kara");
        Thread.sleep(1000);
        login.addViseBirthPlace.sendKeys("Yozgat");
        Thread.sleep(1000);
        login.addViseDeanMALE.click();
        Thread.sleep(1000);

        login.addViseDeanPHONENUMBER.sendKeys("506-775-2566");
        Thread.sleep(1000);
        login.addViseDeanSSN.sendKeys("123-12-1234");
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys("nurikara");
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);

        Assert.assertTrue(login.addViseDeanRequired.isDisplayed());
    }

    @Then("Add ViseDean bolumu doldurulurken TelefonNumarasi kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenTelefonNumarasiKismiBosBirakilir() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        login.addViseDeanName.sendKeys("Nuri");
        Thread.sleep(1000);
        login.addViseDeanSurname.sendKeys("Kara");
        Thread.sleep(1000);
        login.addViseBirthPlace.sendKeys("Yozgat");
        Thread.sleep(1000);
        login.addViseDeanMALE.click();
        Thread.sleep(1000);
        login.addViseDeanBIRTHDAY.sendKeys("20.09.1982");
        Thread.sleep(1000);
        login.addViseDeanSSN.sendKeys("123-12-1234");
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys("nurikara");
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);

        Assert.assertTrue(login.addViseDeanRequired.isDisplayed());
    }
}
