package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepDef {
    Login locate=new Login();
    WebDriver driver= Driver.getDriver();
    @Given("Kullanici  url adresine gider")
    public void kullaniciUrlAdresineGider() {driver.get(ConfigReader.getProperty("url"));
    }

    @Then("HomePage login button tiklar")
    public void homepageLoginButtonTiklar() {
        locate.homePageLogin.click();
        ReusableMethods.bekle(1);
    }

    @Then("Login username alanina {string} gecerli username girilir")
    public void loginUsernameAlaninaGecerliUsernameGirilir(String arg0) {
        switch (arg0.toLowerCase()){
            case "admin":
                locate.username.sendKeys(ConfigReader.getProperty("admin"));
                break;
            case "dean":
                locate.username.sendKeys(ConfigReader.getProperty("dean"));
                break;
            case "vicedean":
                locate.username.sendKeys(ConfigReader.getProperty("viceDean"));
                break;
            case "teacher":
                locate.username.sendKeys(ConfigReader.getProperty("teacher"));
                break;
            case "student":
                locate.username.sendKeys(ConfigReader.getProperty("student"));
                break;

        }
        ReusableMethods.bekle(1);

    }

    @Then("Login password alanina  gecerli password girilir")
    public void loginPasswordAlaninaGecerliPasswordGirilir() {
        locate.password.sendKeys(ConfigReader.getProperty("psw"));

    }

    @And("Login sayfasi login button tiklar")
    public void loginSayfasiLoginButtonTiklar() {
        locate.LoginButton.click();
        ReusableMethods.bekle(1);

    }
}
