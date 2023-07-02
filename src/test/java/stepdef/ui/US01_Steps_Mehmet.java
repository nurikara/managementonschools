package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.US01_AdayOgRegister;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01_Steps_Mehmet {
    US01_AdayOgRegister adayOgRegister;

    @Given("kullanici_ilgili_sitenin_sayfasina_gider")
    public void kullanici_ilgili_sitenin_sayfasina_gider() {
      //  Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("kullanici_homeRegister_butonuna_tiklar")
    public void kullanici_homeregister_butonuna_tiklar() {
        adayOgRegister = new US01_AdayOgRegister();
        adayOgRegister.homePageRegister.click();
        ReusableMethods.bekle(1);
    }

    @Then("kullanici_register_butonuna_tiklar")
    public void kullanici_register_butonuna_tiklar() {
        adayOgRegister = new US01_AdayOgRegister();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", adayOgRegister.register);
        ReusableMethods.bekle(1);
    }

    @Then("kullanici_cikan_pencerede_verilen_bilgileri_girer {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void kullanici_cikan_pencerede_verilen_bilgileri_girer(String name, String surname, String birthPlace, String phone, String dateOfBirth, String ssn, String username, String password) {
        adayOgRegister = new US01_AdayOgRegister();
        adayOgRegister.name.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace, Keys.TAB, phone, Keys.TAB, Keys.TAB, dateOfBirth, Keys.TAB, ssn, Keys.TAB, username, Keys.TAB, password);
        ReusableMethods.bekle(1);
    }

    @Then("kullanici_cinsiyetini_male_olarak_secer")
    public void kullanici_cinsiyetini_male_olarak_secer() {
        adayOgRegister = new US01_AdayOgRegister();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", adayOgRegister.radioButtonMale);
        ReusableMethods.bekle(1);
    }

    @Then("kullanici_cinsiyetini_female_olarak_secer")
    public void kullanici_cinsiyetini_female_olarak_secer() {
        adayOgRegister = new US01_AdayOgRegister();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", adayOgRegister.radioButtonFemale);
        ReusableMethods.bekle(1);
    }

    @Then("kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular")
    public void kullanici_basarili_sekilde_kayit_yaptirdigini_dogrular() {
        adayOgRegister = new US01_AdayOgRegister();
        String expectedText = "Guest User registered.";
        String actualText = adayOgRegister.message.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("kullanici_ilgili_alanin_altinda_{string}_uyarisini_dogrular")
    public void kullanici_phone_alaninin_altinda__uyarisini_dogrular(String mesaj) {
        adayOgRegister = new US01_AdayOgRegister();
        Assert.assertEquals(mesaj, adayOgRegister.required.getText());
    }


    @Then("kullanici_kayit_yaptiramadigini_dogrular")
    public void kullanici_kayit_yaptiramadigini_dogrular() {
        adayOgRegister = new US01_AdayOgRegister();
        System.out.println(adayOgRegister.password.getAttribute("value"));
        Assert.assertNotEquals("", adayOgRegister.password.getAttribute("value"));
        ReusableMethods.bekle(2);
    }

    @And("kullanici_password_bos_biraktiginda_kayit_yaptiramadigini_dogrular")
    public void kullanici_password_bos_biraktiginda_kayit_yaptiramadigini_dogrular() {
        adayOgRegister = new US01_AdayOgRegister();
        System.out.println(adayOgRegister.password.getAttribute("value"));
        Assert.assertNotEquals("", adayOgRegister.name.getAttribute("value"));
        ReusableMethods.bekle(2);
    }

    @And("kullanici_yanlis_girdi_ile_kayit_olamadigina_dair_{string}_mesaji_alir")
    public void kullanici_yanlis_girdi_ile_kayit_olamadigina_dair__mesaji_alir(String mesaj) {
        adayOgRegister = new US01_AdayOgRegister();
        String actualText = adayOgRegister.message.getText();
        Assert.assertEquals(mesaj, actualText);
    }

    @And("kullanici_unique_olmasi_gereken_bilgi_ile_tekrar_kayit_yaptiramadigini_dogrular")
    public void kullanici_unique_olmasi_gereken_bilgi_ile_tekrar_kayit_yaptiramadigini_dogrular() {
        adayOgRegister = new US01_AdayOgRegister();
        String actualText = adayOgRegister.message.getText();
        Assert.assertTrue(actualText.contains("already"));
    }


    @And("kullanici_eksik_phone_ile_kayit_olamayacagina_dair_{string}_mesaji_alir")
    public void kullanici_eksik_phone_ile_kayit_olamayacagina_dair__mesaji_alir(String mesaj) {
        adayOgRegister = new US01_AdayOgRegister();
        String actualText = adayOgRegister.phoneRequired.getText();
        Assert.assertEquals(mesaj, actualText);
    }

    @And("kullanici_eksik_ssn_ile_kayit_olamayacagina_dair_{string}_mesaji_alir")
    public void kullanici_eksik_ssn_ile_kayit_olamayacagina_dair__mesaji_alir(String mesaj) {
        adayOgRegister = new US01_AdayOgRegister();
        String actualText = adayOgRegister.ssnRequired.getText();
        Assert.assertEquals(mesaj, actualText);
    }

    @And("kullanici_eksik_password_ile_kayit_olamayacagina_dair_{string}_mesaji_alir")
    public void kullanici_eksik_password_ile_kayit_olamayacagina_dair__mesaji_alir(String mesaj) {
        adayOgRegister = new US01_AdayOgRegister();
        String actualText = adayOgRegister.passwordRequired.getText();
        Assert.assertEquals(mesaj, actualText);
    }

    @Then("kullanici_female_butonunun_secilebildigini_dogrular")
    public void kullanici_female_butonunun_secilebildigini_dogrular() {
        adayOgRegister = new US01_AdayOgRegister();
        Assert.assertTrue(adayOgRegister.radioButtonFemale.isEnabled());
    }

    @And("kullanici_male_butonunun_secilebildigini_dogrular")
    public void kullanici_male_butonunun_secilebildigini_dogrular() {
        adayOgRegister = new US01_AdayOgRegister();
        Assert.assertTrue(adayOgRegister.radioButtonMale.isEnabled());
    }

    @And("kullanici_yil_kismina_sadece_{int}_karakter_girebildigini_dogrular")
    public void kullanici_yil_kismina_sadece__karakter_girebildigini_dogrular(int sayi) {
        adayOgRegister = new US01_AdayOgRegister();
        String girilenDogumTarihi = adayOgRegister.birthday.getAttribute("value");
        //Erol Hoca sadece getText() ile almis
        System.out.println(girilenDogumTarihi);
        String yil = girilenDogumTarihi.split("-")[0];
        System.out.println(yil);
        int yilKarakterUzunluk = yil.length();
        Assert.assertEquals("Kullanici 6 karakter girebildi", 4, yilKarakterUzunluk);

    }



}



