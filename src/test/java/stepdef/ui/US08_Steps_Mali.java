package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.Locates;
import utilities.ConfigReader;
import utilities.Driver;

public class US08_Steps_Mali {
    Locates locate=new Locates();
    WebDriver driver= Driver.getDriver();


    @Given("Kullanici belirtilen url adresine gider")
    public void kullaniciBelirtilenUrlAdresineGider() {
        driver.get(ConfigReader.getProperty("url"));

    }

    @And("Sayfayi kapatilir")
    public void sayfayiKapatilir() {
        driver.close();
    }
}
