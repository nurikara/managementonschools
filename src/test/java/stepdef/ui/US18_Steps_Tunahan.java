package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US17_US18_TeacherStudentInfo;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static utilities.Driver.driver;

public class US18_Steps_Tunahan {
US17_US18_TeacherStudentInfo tSI =new US17_US18_TeacherStudentInfo();
Robot robot;
    @Given("kullanici_url'e_gider")
    public void kullanici_urlE_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(1);
    }

    @When("kullanici_home_page_sayfasindalogin_butonuna_tıklar")
    public void kullanici_home_page_sayfasindalogin_butonuna_tıklar() {

        tSI.homePageLogin.click();
    }



    @And("kullanici_login_butonuna_tıklar")
    public void kullanici_login_butonuna_tıklar() {
        ReusableMethods.bekle(1);
        tSI.LoginButton.click();
    }

    @Then("kullanici_Student_Info_List_gorunurlugunu_dogrular")
    public void kullanici_student_ınfo_list_gorunurlugunu_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(tSI.studentInfoListTextTuna.isDisplayed());

    }

    @And("kullanici_sayfayi_kapatır")
    public void kullanici_sayfayi_kapatır() {
        driver.close();
    }

    @And("kullanici_ogrenci_edit_butonuna_tıklar")
    public void kullanici_ogrenci_edit_butonuna_tıklar() {
        tSI.editButtonTuna.click();
    }

    @And("kullanici_ogrenci_bilgilerini_gunceller_ve_submit_butonuna_tıklar")
    public void kullanici_ogrenci_bilgilerini_gunceller_ve_submit_butonuna_tıklar() {
        tSI.editStudentInfoTuna.click();
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            ReusableMethods.bekle(1);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            tSI.editStudentInfoAbsanteeTuna.sendKeys(Keys.BACK_SPACE,"6",Keys.TAB,Keys.TAB,Keys.TAB,"GÜNCELLENDİ TEAM05",Keys.TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        ReusableMethods.bekle(1);
    }

    @And("kullanici_edit_ekranini_kapatir_")
    public void kullanici_edit_ekranini_kapatir_() {
        robot.mouseMove(100 ,400 );
        ReusableMethods.bekle(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    @Then("kullanici_ogrenci_not_bilgisinin_guncellendigini_dogrular")
    public void kullanici_ogrenci_not_bilgisinin_guncellendigini_dogrular() {
      Assert.assertTrue(tSI.studentInfoListTableTuna.getText().contains("GÜNCELLENDİ TEAM05"));
    }

    @And("kullanici_StudentInfoLıstdeki_delete_butonunun_gorunurlugunu_dogrular")
    public void kullanici_studentınfolıstdeki_delete_butonunun_gorunurlugunu_dogrular() {
        Assert.assertTrue(tSI.studentInfoDeleteButtonTuna.isDisplayed());
    }

    String silinmedenOnce;
    @And("kullanici_delete_butonuna_basar")
    public void kullanici_delete_butonuna_basar() {
        ReusableMethods.bekle(1);
        silinmedenOnce=tSI.studentInfoListTableTuna.getText();
        tSI.studentInfoDeleteButtonTuna.click();

    }

    @Then("kullanici_ogrencinin_not_bilgilerinin_silindigini_dogrular")
    public void kullanici_ogrencinin_not_bilgilerinin_silindigini_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertNotEquals(tSI.studentInfoListTableTuna.getText(),silinmedenOnce);
    }

    @And("kullanici_{string}_password_girer")
    public void kullanici__password_girer(String username) {
        tSI.username.sendKeys(ConfigReader.getProperty(username), Keys.TAB,ConfigReader.getProperty("psw"));
    }



}
