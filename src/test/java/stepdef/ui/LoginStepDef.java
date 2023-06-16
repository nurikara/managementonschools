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

    @Given("Kullanici  {string} olarak giriş yapar")
    public void kullaniciOlarakGirisYapar(String arg0) {

        driver.get(ConfigReader.getProperty("url"));
        locate.homePageLogin.click();
        ReusableMethods.bekle(1);
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
        locate.password.sendKeys(ConfigReader.getProperty("psw"));
        locate.LoginButton.click();
        ReusableMethods.bekle(1);

    }
}
