package stepdef.ui;

import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.US04_US05_Admin_Dean;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertTrue;

public class US_05_StepDefs {

    WebDriver driver = Driver.getDriver();

    US04_US05_Admin_Dean adminDean =new US04_US05_Admin_Dean();
    JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();

    @And("Kullanıcı açılan sayfada silme butonuna tıklar")
    public void kullanıcıAcılanSayfadaSilmeButonuNaTıklar() {
        js.executeScript("window.scrollTo(0,1000)");
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi();
    }

    @And("Açılan Dean Management Sayfasında Dean Listin altında Deanlerin Name, Gender, Phone Number, SSN, User Name bilgilerinin olduğunu görebilmeli")
    public void acılanDeanManagementSayfasındaDeanListInAltındaDeanLerinNameGenderPhoneNumberSSNUserNameBilgilerininOldugunuGorebilmeli() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.nameDeanList.getText().contains("Name"));
        ReusableMethods.bekle(2);
        assertTrue(adminDean.genderDeanList.getText().contains("Gender"));
        ReusableMethods.bekle(2);
        assertTrue(adminDean.phoneNumberDeanList.getText().contains("Phone Number"));
        ReusableMethods.bekle(2);
        assertTrue(adminDean.ssnDeanList.getText().contains("Ssn"));
        ReusableMethods.bekle(2);
        assertTrue(adminDean.userNameDeanList.getText().contains("User Name"));



    }

    @And("Oluşturulan Dean List'ten bir tanesin yanındaki Edit Butonuna tıklar")
    public void olusturulanDeanListTenBirTanesinYanındakiEditButonunaTıklar() {
        js.executeScript("window.scrollTo(0,1000)");
        ReusableMethods.bekle(1);
        adminDean.nextButton.click();
        ReusableMethods.bekle(1);
        adminDean.nextButton.click();
        ReusableMethods.bekle(1);
        adminDean.nextButton.click();
        ReusableMethods.bekle(1);
        adminDean.nextButton.click();
        ReusableMethods.bekle(1);

        adminDean.editButton.click();

    }

    @And("Seçilen Deanın  Name, Surname, Birth Place,  Gender, Date Of Birth,  Phone Number, SSN, User Name ve Password'unu değiştirir ve Submit butonuna tıklar")
    public void secilenDeanInNameSurnameBirthPlaceGenderDateOfBirthPhoneNumberSSNUserNameVePasswordUnuDegistirirVeSubmitButonunaTıklar() throws AWTException, InterruptedException {
        Robot robot= new Robot();
        adminDean.nameEditDean.click();
        ReusableMethods.robotDelete();
        adminDean.nameEditDean.sendKeys(ReusableMethods.fakerInput("name"));

        ReusableMethods.bekle(1);
        adminDean.surnameEditDean.click();
        ReusableMethods.robotDelete();
        adminDean.surnameEditDean.sendKeys(ReusableMethods.fakerInput("surname"));

        ReusableMethods.bekle(1);
        adminDean.birtPlaceEditDean.click();
        ReusableMethods.robotDelete();
        adminDean.birtPlaceEditDean.sendKeys(ReusableMethods.fakerInput("birthPlace"));

        ReusableMethods.bekle(1);
        adminDean.famaleEditDean.click();

        adminDean.birtPlaceEditDean.sendKeys(Keys.TAB, Keys.TAB);
        ReusableMethods.bekle(1);
       ReusableMethods.robotDelete();
        adminDean.birtDayEditDean.sendKeys(Keys.TAB);
        ReusableMethods.bekle(1);
        ReusableMethods.robotDelete();
        adminDean.birtDayEditDean.sendKeys(Keys.TAB);
        ReusableMethods.bekle(3);
        ReusableMethods.robotDelete();
        ReusableMethods.bekle(3);
        adminDean.maleEditDean.click();
        ReusableMethods.bekle(1);
        adminDean.birtDayEditDean.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));

        ReusableMethods.bekle(1);
        adminDean.phoneEditDean.click();
        ReusableMethods.robotDelete();

        robot.keyPress(KeyEvent.VK_DELETE);
        adminDean.phoneEditDean.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));

        ReusableMethods.bekle(1);
        adminDean.ssnEditDean.click();
        ReusableMethods.robotDelete();
        adminDean.ssnEditDean.sendKeys(ReusableMethods.fakerInput("ssn1"));

        ReusableMethods.bekle(1);
        adminDean.usernameEditDean.click();
        ReusableMethods.robotDelete();
        adminDean.usernameEditDean.sendKeys(ReusableMethods.fakerInput("username"));

        ReusableMethods.bekle(1);
        adminDean.passwordEditDean.click();
        ReusableMethods.robotDelete();
        adminDean.passwordEditDean.sendKeys(ReusableMethods.fakerInput("password1"));

        ReusableMethods.bekle(1);
        adminDean.submitEditDean.click();


    }

    @And("Kullanıcı Dean updated Successful yazısının cıktığını görür")
    public void kullanıcıDeanUpdatedSuccessfulYazısınınCıktıgınıGorur() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.saveTest.getText().contains("Dean updated Successful"));
    }
}
