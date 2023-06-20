package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US10_US11_US12_ViceDeanLessonProgram;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class ElifStepDefs {
    WebDriver driver = Driver.getDriver();
    US10_US11_US12_ViceDeanLessonProgram lessonProgram = new US10_US11_US12_ViceDeanLessonProgram();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Kullanici belirtilen url adresine gider")
    public void kullaniciBelirtilenUrlAdresineGider() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @And("Sayfayi kapatilir")
    public void sayfayiKapatilir() {
        Driver.closeDriver();
    }

    @When("Kullanıcı login butonuna basar")
    public void kullanıcıLoginButonunaBasar() {
        lessonProgram.homeLoginButton.click();


    }

    @And("Kullaınıcı username ve password text box ını doldurur")
    public void kullaınıcıUsernameVePasswordTextBoxInıDoldurur() {
        lessonProgram.loginUsername.sendKeys(ConfigReader.getProperty("login_username"));
        lessonProgram.loginPassword.sendKeys(ConfigReader.getProperty("login_password"));
    }

    @And("Kullanıcı login butonuna tıklar")
    public void kullanıcıLoginButonunaTıklar() {
        lessonProgram.LoginButton.click();
        bekle(2);
    }


    @When("Kullanıcı Menu butonuna tıklar")
    public void kullanıcı_menu_butonuna_tıklar() {
        lessonProgram.menuButton.click();
        bekle(2);
    }

    @And("Kullanıcı sagda acılan bolumden Lesson Managementa  tıklar")
    public void kullanıcıSagdaAcılanBolumdenLessonManagementaTıklar() {
        lessonProgram.lessonManagement.click();
        bekle(2);
    }


    @When("Kullanıcı Lesson Programa  tıklar")
    public void kullanıcı_lesson_programa_tıklar() {
        lessonProgram.lessonProgram.click();
        bekle(2);

    }

    @And("Kullanıcı Choose Lesson bolumunden ders secer")
    public void kullanıcıChooseLessonBolumundenDersSecer() {
        actions.click(lessonProgram.chooseLesson).perform();
        actions.sendKeys("Java", Keys.ENTER).perform();
        bekle(2);
    }


    @When("Kullanıcı Choose Education Term dropdown bolumunden donem secer")
    public void kullanıcı_choose_education_term_dropdown_bolumunden_donem_secer() {
        actions.click(lessonProgram.chooseEducationTerm).perform();
        Select select = new Select(lessonProgram.chooseEducationTerm);
        select.selectByIndex(1);
        bekle(1);

    }

    @When("Kullanıcı Choose Day drpodown bolumunden secer")
    public void kullanıcı_choose_day_drpodown_bolumunden_secer() {
        actions.click(lessonProgram.chooseDay).perform();
        Select select = new Select(lessonProgram.chooseDay);
        select.selectByIndex(1);
        bekle(1);

    }

    @And("Kullanıcı {string} start time secer")
    public void kullanıcıStartTimeSecer(String startTime) {
        lessonProgram.startTime.sendKeys(startTime);
        bekle(1);
    }

    @And("Kullanıcı {string} stop time secer")
    public void kullanıcıStopTimeSecer(String stopTime) {
        lessonProgram.stopTime.sendKeys(stopTime);
        bekle(1);
    }

    @When("Kullanıcı Submit butonuna tıklar")
    public void kullanıcı_submit_butonuna_tıklar() {
        actions.click(lessonProgram.submitButton).perform();
        bekle(2);

    }

    @Then("Kullanıcı Lesson Program List te secilen optionlara gore dersini programda gorundugunu dogrular.")
    public void kullanıcı_lesson_program_list_te_secilen_optionlara_gore_dersini_programda_gorundugunu_dogrular() {
        assertTrue(lessonProgram.lessonCreatedAlert.isDisplayed());
    }

    @Then("Kullanıcı  gerekli mesajı görür")
    public void kullanıcıGerekliMesajıGorur() {
        assertTrue(lessonProgram.chooseLessonNegativeAlert.isDisplayed());
    }

    @Then("Kullanıcı choose education term warning uyarısını görür")
    public void kullanıcıChooseEducationTermWarningUyarısınıGorur() {
        assertTrue(lessonProgram.chooseEducationNegativeAlert.isDisplayed());
    }

    @Then("Kullanıcı choose day warning uyarısını görür")
    public void kullanıcıChooseDayWarningUyarısınıGorur() {
        assertTrue(lessonProgram.chooseDayNegativeAlert.isDisplayed());
    }

    @Then("Kullanıcı start time warning uyarısını görür")
    public void kullanıcıStartTimeWarningUyarısınıGorur() {
        assertTrue(lessonProgram.startTimeNegativeAlert.isDisplayed());
    }

    @Then("Kullanıcı stop time warning uyarısını görür")
    public void kullanıcıStopTimeWarningUyarısınıGorur() {
        assertTrue(lessonProgram.stopTimeNegativeAlert.isDisplayed());
    }


    @And("Kullanıcı update butonuna tıklar.")
    public void kullanıcıUpdateButonunaTıklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tumSayfaResmi();//#Update butonu ile ilgili herhengi birsey yoktur.BUG
    }

    @And("Kullanıcı Lesson Assıgment List bolumunden ders secer")
    public void kullanıcıLessonAssıgmentListBolumundenDersSecer() {
        click(lessonProgram.lessonProgramCheckBox);
        bekle(2);
    }

    @And("Kullanıcı Choose Teacher dan ogretmen ataması yapar")
    public void kullanıcıChooseTeacherDanOgretmenAtamasıYapar() {
        actions.scrollToElement(lessonProgram.chooseTeacherLabel);
        bekle(2);
        Select select=new Select(lessonProgram.chooseTeacherTextBox);
        select.selectByIndex(5);
//        click(lessonProgram.chooseTeacherTextBox);
//        bekle(5);
//        lessonProgram.chooseTeacherTextBox.sendKeys("sefa sefa");
        bekle(2);

    }

    @And("Kullanıcı Submit butonuna tıklar.")
    public void kullanıcıSubmitButonunaTıklar() {
        actions.sendKeys(Keys.ARROW_UP).perform();
        bekle(1);
        click(lessonProgram.teacherSubmitButton);
        bekle(2);
    }

    @And("Kullanıcı secılen derse ogretmen ataması yapıldıgınına dair alert geldigini dogrular.")
    public void kullanıcıSecılenDerseOgretmenAtamasıYapıldıgınınaDairAlertGeldiginiDogrular() {
        assertTrue(lessonProgram.lessonAddedTeacherAlert.isDisplayed());
    }

    @And("Kullanıcı secılen derse ogretmen ataması yapılmadıgına dair uyarı alır")
    public void kullanıcıSecılenDerseOgretmenAtamasıYapılmadıgınaDairUyarıAlır() {
        assertTrue(lessonProgram.teacherAssignNegativeAlert.isDisplayed());
    }
}
