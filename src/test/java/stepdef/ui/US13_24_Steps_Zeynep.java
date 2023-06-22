package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US13_US14_ViceDeanTeacher;
import utilities.Driver;
import utilities.ReusableMethods;

public class US13_24_Steps_Zeynep {

    US13_US14_ViceDeanTeacher viceDeanTeacher=new US13_US14_ViceDeanTeacher();


    @Then("Kullanıcı Choose Lessons alanını tıklayarak çıkan listeden ders seçimini yapar")
    public void kullanıcıChooseLessonsAlanınıTıklayarakÇıkanListedenDersSeçiminiYapar() {
     ReusableMethods.ddmIndex(viceDeanTeacher.chooseLessonTeacher,5);
    }

    @And("Kullanıcı ders seçildiğini  doğrular")
    public void kullanıcıDersSeçildiğiniDoğrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(viceDeanTeacher.chooseLessonTeacher.getText().contains("Java"));
    }

    @And("Kullanıcı Vice Dean olarak Choose Lesson alanını tıklar")
    public void kullanıcıViceDeanOlarakChooseLessonAlanınıTıklar() {

        viceDeanTeacher.chooseLessonTeacher.click();
    }



    @When("Kullanıcı name alanını boş bırakarak diger alanları geçerli değerlerle doldurur {string}, {string}, {string},{string}, {string},{string}, {string} ve {string}")
    public void kullanıcıNameAlanınıBoşBırakarakDigerAlanlarıGeçerliDeğerlerleDoldururVe(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username, String password) {

   viceDeanTeacher.nameInput.sendKeys(name, Keys.TAB,surname,Keys.TAB,birthplace,Keys.TAB,email,Keys.TAB,phone);
   viceDeanTeacher.birthDayInput.sendKeys(dateofbirth,Keys.TAB,username,Keys.TAB,password);


    }

    @And("Kullanıcı is Advisor Teacher alanını tıklar")
    public void kullanıcıIsAdvisorTeacherAlanınıTıklar() {
        viceDeanTeacher.isAdviserCB.click();
    }

    @And("Kullanıcı Gender alanından cinsiyet seçer")
    public void kullanıcıGenderAlanındanCinsiyetSeçer() {
        viceDeanTeacher.maleCB.click();
    }

    @And("Kullanıcı date of birth alanından tarih seçer")
    public void kullanıcıDateOfBirthAlanındanTarihSeçer() {


    }

    @When("Kullanıcı name alanını boş bırakarak diger alanları geçerli değerlerle doldurur {string}, {string}, {string},{string}, {string},{string}, {string} ,{string}ve {string}")
    public void kullanıcıNameAlanınıBoşBırakarakDigerAlanlarıGeçerliDeğerlerleDoldururVe(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username,String ssn, String password) {


        viceDeanTeacher.nameInput.sendKeys(name, Keys.TAB,surname,Keys.TAB,birthplace,Keys.TAB,email,Keys.TAB,phone);
        viceDeanTeacher.birthDayInput.sendKeys(dateofbirth,Keys.TAB,ssn,Keys.TAB,username,Keys.TAB,password);
    }
}
