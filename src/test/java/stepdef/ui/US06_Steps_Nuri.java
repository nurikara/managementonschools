package stepdef.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.asserts.SoftAssert;
import pages.US02_AdminUserList;
import pages.US06_Dean_ViceDean;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class US06_Steps_Nuri {
    US06_Dean_ViceDean login = new US06_Dean_ViceDean();
    US02_AdminUserList login2 = new US02_AdminUserList();

    SoftAssert softAssert = new SoftAssert();


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

        assertTrue(login.addViseDean.isDisplayed());

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

        assertTrue(login.addViseDeanRequired.isDisplayed());

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

        assertTrue(login.addViseDeanRequired.isDisplayed());


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

        assertTrue(login.addViseDeanRequired.isDisplayed());
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
        Assert.assertFalse(login.addViseDeanSubmit.isEnabled());
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

        assertTrue(login.addViseDeanRequired.isDisplayed());
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

        assertTrue(login.addViseDeanRequired.isDisplayed());
    }

    @Then("SSN bolumune uygun sekilde giris yapilir")
    public void ssnBolumuneUygunSekildeGirisYapilir() throws InterruptedException {
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
        login.addViseDeanSSN.sendKeys("123-12-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys(Faker.instance().name().username());
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);


        assertEquals("Vice dean Saved", login.addViseDeanAlert.getText());


    }

    @Then("SSN bolumune uygun olmayan sekilde giris yapilir")
    public void ssnBolumuneUygunOlmayanSekildeGirisYapilir() throws InterruptedException {
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
        login.addViseDeanSSN.sendKeys("12 312 " + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys(Faker.instance().name().username());
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);
        assertEquals("Please enter valid SSN number", login.addViseDeanAlert.getText());
    }

    @Then("Add ViseDean bolumu doldurulurken UserName kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenUserNameKismiBosBirakilir() throws InterruptedException {
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
        login.addViseDeanSSN.sendKeys("12-312-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);

        login.addViseDeanPASSWORD.sendKeys("Emre4344");
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);
        assertTrue(login.addViseDeanRequired.isDisplayed());


    }

    @Then("Add ViseDean bolumu doldurulurken PassWord kismi bos birakilir")
    public void addViseDeanBolumuDoldurulurkenPassWordKismiBosBirakilir() throws InterruptedException {

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
        login.addViseDeanSSN.sendKeys("12-312-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys(Faker.instance().name().username());
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);
        assertTrue(login.addViseDeanRequired.isDisplayed());


    }

    @Then("Add ViseDean bolumu doldurulurken PassWord EnAz {int} karakterden oluşmalıdır")
    public void addViseDeanBolumuDoldurulurkenPassWordEnAzKarakterdenOluşmalıdır(int arg0) throws InterruptedException {
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
        login.addViseDeanSSN.sendKeys("12-312-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys(Faker.instance().name().username());
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("Emre434");
        Thread.sleep(1000);
        assertTrue(login.addViseDeanPassWordRequired.isDisplayed());
    }

    @Then("Add ViseDean bolumu doldurulurken Password; büyük harf, küçük harf ve bir rakam içermelidir.")
    public void addViseDeanBolumuDoldurulurkenPasswordBüyükHarfKüçükHarfVeBirRakamIçermelidir() throws InterruptedException {

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
        login.addViseDeanSSN.sendKeys("123-12-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanUSERNAME.sendKeys(Faker.instance().name().username());
        Thread.sleep(1000);
        login.addViseDeanPHONENUMBER.sendKeys("506-775-" + Faker.instance().number().digits(4));
        Thread.sleep(1000);
        login.addViseDeanPASSWORD.sendKeys("emre4344");
        Thread.sleep(1000);
        login.addViseDeanSubmit.click();
        Thread.sleep(2000);
        softAssert.assertNotEquals("Vice dean Saved", "login.addViseDeanAlert.getText()");
        Thread.sleep(1000);
        login2.menu.click();

        Thread.sleep(1000);

        login2.logout.click();

        Thread.sleep(1000);

        login2.yes.click();

        Thread.sleep(1000);
        softAssert.assertAll();

    }
}
