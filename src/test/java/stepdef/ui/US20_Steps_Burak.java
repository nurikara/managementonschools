package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Login;
import pages.US19_US20_TeacherAddMeetList;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US20_Steps_Burak {

    US19_US20_TeacherAddMeetList Teacher = new US19_US20_TeacherAddMeetList();

    Actions actions = new Actions(Driver.getDriver());


    @Given("Kullanici_{string}_sitesine gider")
    public void kullanici__sitesine_gider(String url) {
        Driver.getDriver().get(url);
    }
    @When("Kullanici_LOG_IN'e_tiklar")
    public void kullanici_log_inE_tiklar() {
        Teacher.login.click();
    }

    @When("Kullanici_gecerli_Teacher_olarak_Username_ve_Password'u_girer")
    public void kullanici_gecerli_teacher_olarak_username_ve_password_u_girer() {
        Teacher.username.sendKeys("TeacherBurak");
        Teacher.password.sendKeys("12345678");
        Teacher.LoginButton.click();

    }
    @When("Sag_ustteki_Menu_butonuna_tiklar")
    public void sag_ustteki_menu_butonuna_tiklar() {
        Teacher.MenuButton.click();

    }
    @When("Menu'de_Meet_Management'a_tiklar")
    public void menu_de_meet_management_a_tiklar() {
        Teacher.MeetManagement.click();

    }
    @Then("Meet_Management_bolumunde_Toplantıların_Date_Start_Time_Stop_Time_ve_Description'larin_oldugunu_kontrol_eder")
    public void meet_management_bolumunde_toplantıların_date_start_time_stop_time_ve_description_larin_oldugunu_kontrol_eder() {

    assertEquals("Date Of Meet",Teacher.dateOfMeet.getText());
    assertEquals("Start Time",Teacher.startTime.getText());
    assertEquals("Stop Time",Teacher.stopTime.getText());

    }

    @And("Olusturulan bir toplanti bulunur ve edit’e tiklanir")
    public void olusturulanBirToplantiBulunurVeEditETiklanir() {
        Teacher.edit.click();
    }
    @And("Acilan bolumde Choose Student, Date Of Meet, Start Time, Stop Time ve Description guncellenir")
    public void acilanBolumdeChooseStudentDateOfMeetStartTimeStopTimeVeDescriptionGuncellenir() throws InterruptedException {

        actions.click(Teacher.chooseStudentMenu).perform();
        ReusableMethods.bekle(2);
        Teacher.editDateOfTime.sendKeys("12/12/2023");
        Teacher.editStartTime.sendKeys("13:00:00");
        Teacher.editStopTime.sendKeys("15:00:00");
        Teacher.editDescription.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"Bugun Gelmelisin!");

    }

    @Then("Submit butonuna tiklanir degisiklikler kaydedilir")
    public void submitButonunaTiklanirDegisikliklerKaydedilir() {
        Teacher.editSubmit.click();
    }

    @Then("Sayfa’da sag altta bulunan cop tenekesine tiklar.")
    public void sayfaDaSagAlttaBulunanCopTenekesineTiklar() {
        Teacher.meetDescription.sendKeys("",Keys.PAGE_DOWN);
        Teacher.trashMeet.click();
    }


    @Then("sayfa kapatilir")
    public void sayfaKapatilir() {

        Driver.closeDriver();
    }
}
