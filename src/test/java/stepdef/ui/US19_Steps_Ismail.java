package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Login;
import pages.US07_DeanMessage;
import pages.US19_US20_TeacherAddMeetList;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.Time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;

public class US19_Steps_Ismail {

    WebDriver driver = Driver.getDriver();
    US19_US20_TeacherAddMeetList teacherAddMeetList=new US19_US20_TeacherAddMeetList();
    Login login=new Login();
    Actions actions = new Actions(Driver.getDriver());
    @And("Kullanıcı menuden Meet Management e tıklar")
    public void kullanıcıMenudenMeetManagementETıklar() {

        ReusableMethods.bekle(1);
        ReusableMethods.click(teacherAddMeetList.MeetManagement);
    }

    @And("Kullanıcı geçerli  TEACHER OLARAK user name girer")
    public void kullanıcıGecerliTEACHEROLARAKUserNameGirer() {
        login.username.sendKeys(ConfigReader.getProperty("teacher"));
    }

    @And("Kullanıcı geçerli  TEACHER OLARAK password girer")
    public void kullanıcıGecerliTEACHEROLARAKPasswordGirer() {
        login.password.sendKeys(ConfigReader.getProperty("psw"), Keys.TAB,Keys.ENTER);
    }



    @Then("Kullanici acilan  listeden bir ogrenci secer")
    public void kullaniciAcilanListedenBirOgrenciSecer() {
        ReusableMethods.bekle(1);
        actions.click().perform();
        assertTrue(teacherAddMeetList.SelectedStudent.isDisplayed());
    }


    @And("Kullanici Select Students kismina tiklar")
    public void kullaniciSelectStudentsKisminaTiklar() {
        ReusableMethods.bekle(2);
        actions.click(teacherAddMeetList.SelectStudentMenuLine).perform();
       // ReusableMethods.bekle(1);
    // actions.click().perform();


    }



    @Then("Kullanici bir tarih secer")
    public void kullaniciBirTarihSecer() {
        ReusableMethods.bekle(1);
        actions.click(teacherAddMeetList.selectdate).  perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(teacherAddMeetList.selectdate,ConfigReader.getProperty("datemeet")).
                perform();
        ReusableMethods.bekle(1);

    }

    @And("Kullanici Date Of Meet  bolumunu  görür")
    public void kullaniciDateOfMeetBolumunuGorur() {
        ReusableMethods.bekle(2);
        assertTrue(teacherAddMeetList.date.isDisplayed());
    }

    @And("Kullanici {string} start time secer")
    public void kullaniciStartTimeSecer(String startTime) {
        teacherAddMeetList.StartTime.sendKeys(startTime);
        bekle(1);
    }

    @And("Kullanici {string} stop time secer")
    public void kullaniciStopTimeSecer(String stopTime) {
        teacherAddMeetList.StopTime.sendKeys(stopTime);
        bekle(1);
    }



    @And("Kullanici gecmis bir tarih secer")
    public void kullaniciGecmisBirTarihSecer() {
        ReusableMethods.bekle(1);
        actions.click(teacherAddMeetList.selectdate).  perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(teacherAddMeetList.selectdate,ConfigReader.getProperty("datepast")).
                perform();
        ReusableMethods.bekle(1);
    }




    @And("Kullanici {string} girer")
    public void kullaniciGirer(String Description) {
        teacherAddMeetList.Description.sendKeys(ConfigReader.getProperty(Description));
    }

    @And("Kullanici Submit butonuna tıklar")
    public void kullaniciSubmitButonunaTıklar() {
        actions.click(teacherAddMeetList.addMeetSubmit).perform();
    }

    @Then("Kullanici ileri bir tarih olmalı uyarısını alır")
    public void kullaniciIleriBirTarihOlmalıUyarısınıAlır() {
        ReusableMethods.bekle(2);
        assertTrue(teacherAddMeetList.MeetPageAlert.isDisplayed());


    }

    @And("Kullanici {string} secmez")
    public void kullaniciSecmez(String arg0) {

    }

    @Then("Kullanici Start Time  ve Stop Time altında Required uyarısını alır")
    public void kullaniciStartTimeVeStopTimeAltındaRequiredUyarısınıAlır() {

        ReusableMethods.bekle(1);
        assertTrue(teacherAddMeetList.StartTimeRequired.isDisplayed());
        ReusableMethods.bekle(1);
        assertTrue(teacherAddMeetList.StopTimeRequired.isDisplayed());
    }

    @And("Kullanici {string} girmez")
    public void kullaniciGirmez(String arg0) {
    }

    @Then("Kullanici  Description altında Required uyarısını alır")
    public void kullaniciDescriptionAltındaRequiredUyarısınıAlır() {
        ReusableMethods.bekle(1);
        assertTrue(teacherAddMeetList.DescriptionRequired.isDisplayed());
    }

    @Then("Kullanıcı meet olusturur")
    public void kullanıcıMeetOlusturur() {

    }
}
