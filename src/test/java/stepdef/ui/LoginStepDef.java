package stepdef.ui;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepDef {
    Login locate=new Login();
    WebDriver driver= Driver.getDriver();

    @Given("Kullanici  {string} olarak giriş yapar")
    public void kullaniciOlarakGirisYapar(String urll) {
        driver.get((String) ConfigReader.getProperty("urll"));
        locate.homePageLogin.click();
        ReusableMethods.bekle(1);
        switch (urll.toLowerCase()){
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
        ReusableMethods.bekle(2);
        locate.password.sendKeys(ConfigReader.getProperty("psw"), Keys.TAB,Keys.ENTER);



    }


}
