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
     viceDeanTeacher.selectLessonInput.sendKeys("Java", Keys.TAB);

    }

    @And("Kullanıcı ders seçildiğini  doğrular")
    public void kullanıcıDersSeçildiğiniDoğrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(viceDeanTeacher.selectLessonInput.isDisplayed());
    }

    @And("Kullanıcı Vice Dean olarak Choose Lesson alanını tıklar")
    public void kullanıcıViceDeanOlarakChooseLessonAlanınıTıklar() {
        viceDeanTeacher.selectLessonInput.click();

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

    @When("Kullanıcı istenilen boş bırakarak diger alanları geçerli değerlerle doldurur {string}, {string}, {string},{string}, {string},{string}, {string} ,{string}ve {string}")
    public void kullanıcıIstenilenBoşBırakarakDigerAlanlarıGeçerliDeğerlerleDoldururVe(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username,String ssn, String password) {


        viceDeanTeacher.nameInput.sendKeys(name, Keys.TAB,surname,Keys.TAB,birthplace,Keys.TAB,email,Keys.TAB,phone);
        viceDeanTeacher.birthDayInput.sendKeys(dateofbirth,Keys.TAB,ssn,Keys.TAB,username,Keys.TAB,password);
    }

    @And("Kullanıcı requared yazısını görür")
    public void kullanıcıRequaredYazısınıGörür() {
       Assert.assertTrue(viceDeanTeacher.surnameRequared.isDisplayed());
       ReusableMethods.tumSayfaResmi("Required");
    }



    @Then("Kullanıcı Teacher saved succesfully yazısı görür")
    public void kullanıcıTeacherSavedSuccesfullyYazısıGörür() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(viceDeanTeacher.teacherSavedsuccessfully.isDisplayed());
        ReusableMethods.tumSayfaResmi("Teacher Saved Successfully");
    }

    @And("Ssn bölümüne minimum onbir karakter girilmesi gerektiği uyarısı verir")
    public void ssnBölümüneMinimumOnbirKarakterGirilmesiGerektiğiUyarısıVerir() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(viceDeanTeacher.minimumcharacteruyarısı.isDisplayed());
    }

    @When("Kullanıcı istenilen alanları geçerli değerlerle doldurur {string}, {string}, {string},{string}, {string},{string}, {string} ,{string}ve {string}")
    public void kullanıcıIstenilenAlanlarıGeçerliDeğerlerleDoldururVe(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username,String ssn, String password) {


        viceDeanTeacher.nameInput.sendKeys(name, Keys.TAB,surname,Keys.TAB,birthplace,Keys.TAB,email,Keys.TAB,phone);
        viceDeanTeacher.birthDayInput.sendKeys(dateofbirth,Keys.TAB,ssn,Keys.TAB,username,Keys.TAB,password);
    }

    @Then("Kullanıcı minimum sekiz karakter uyarısını görür")
    public void kullanıcıMinimumSekizKarakterUyarısınıGörür() {
        viceDeanTeacher.password8characteruyarısı.isDisplayed();
    }

    @Then("Kullanıcı büyük harf girmeyince please enter valid email uyarı yazısını görür")
    public void kullanıcıBüyükHarfGirmeyincePleaseEnterValidEmailUyarıYazısınıGörür() {
        Assert.assertTrue(viceDeanTeacher.validemailuyarısı.isDisplayed());
    }

    @Then("Kullanıcı küçük harf girmeyince please enter valid email uyarı yazısını görür")
    public void kullanıcıKüçükHarfGirmeyincePleaseEnterValidEmailUyarıYazısınıGörür() {
        Assert.assertTrue(viceDeanTeacher.validemailuyarısı.isDisplayed());
    }

    @Then("Kullanıcı rakam girmeyince please enter valid email uyarı yazısını görür")
    public void kullanıcıRakamGirmeyincePleaseEnterValidEmailUyarıYazısınıGörür() {
        Assert.assertTrue(viceDeanTeacher.validemailuyarısı.isDisplayed());
    }
}
