package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US13_US14_ViceDeanTeacher;
import utilities.ReusableMethods;

public class US13_24_Steps_Zeynep {

    US13_US14_ViceDeanTeacher viceDeanTeacher=new US13_US14_ViceDeanTeacher();


    @Then("Kullanıcı Choose Lessons alanını tıklayarak çıkan listeden ders seçimini yapar")
    public void kullanıcıChooseLessonsAlanınıTıklayarakÇıkanListedenDersSeçiminiYapar() {
        ReusableMethods.ddmValue(viceDeanTeacher.selectLessonInput, "2");
    }

    @And("Kullanıcı ders seçildiğini  doğrular")
    public void kullanıcıDersSeçildiğiniDoğrular() {
        ReusableMethods.bekle(2);
        Assert.assertEquals("2",viceDeanTeacher.selectLessonInput.getAttribute("value"));
    }

    @And("Kullanıcı Vice Dean olarak Choose Lesson alanını tıklar")
    public void kullanıcıViceDeanOlarakChooseLessonAlanınıTıklar() {
        viceDeanTeacher.selectLessonInput.click();
    }



    @When("Kullanıcı name alanını boş bırakarak diger alanları geçerli değerlerle doldurur {string}, {string}, {string},{string}, {string},{string}, {string} ve {string}")
    public void kullanıcıNameAlanınıBoşBırakarakDigerAlanlarıGeçerliDeğerlerleDoldururVe(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username, String password) {
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
}
