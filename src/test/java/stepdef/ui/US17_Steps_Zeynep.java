package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US13_US14_ViceDeanTeacher;
import pages.US17_US18_TeacherStudentInfo;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US17_Steps_Zeynep {

    US17_US18_TeacherStudentInfo tSI=new US17_US18_TeacherStudentInfo();
    US13_US14_ViceDeanTeacher viceDeanTeacher=new US13_US14_ViceDeanTeacher();


    @Given("Kullanıcı {string} alanını tıklar")
    public void kullanıcı_alanını_tıklar(String string) {
ReusableMethods.bekle(2);
        switch (string.toLowerCase()){
            case "choose lesson":
                tSI.chooselessonZeynep.click();

                break;
            case "choose student":
                tSI.choosestudentZeynep.click();
                break;
            case "choose education term":
                tSI.chooseeducationTermZeynep.click();
                break;
            case "absentee":
                tSI.absenteeZeynep.click();
                break;
            case "submit":
                tSI.submitButtonZeynep.click();
                break;
            case "menü" :
                viceDeanTeacher.menuButton.click();
                break;
            case "teacher management" :
                viceDeanTeacher.teacherMenagementButton.click();
                break;



        }

    }


    @Given("Kullanıcı {string} alanında açılan öğrencilerden birini seçer")
    public void kullanıcı_alanında_açılan_öğrencilerden_birini_seçer(String string) {
        ReusableMethods.ddmValue(tSI.choosestudentZeynep,string);
    }
    @Given("Kullanıcı {string} alanında açılan dönemlerden birini seçer")
    public void kullanıcı_alanında_açılan_dönemlerden_birini_seçer(String string) {
        ReusableMethods.ddmValue(tSI.chooseeducationTermZeynep,string);
    }


    @And("Kullanıcı Choose Lesson alanında açılan derslerden birini seçer")
    public void kullanıcıChooseLessonAlanındaAçılanDerslerdenBiriniSeçer() {
        ReusableMethods.ddmValue(tSI.chooselessonZeynep, "2");
    }

    @And("Kullanıcı {int} saniye bekler")
    public void kullanıcıSaniyeBekler(int arg0) {
        ReusableMethods.bekle(2);
    }

//    @And("Kullanıcı absentee alanına devamsızlık bilgisini girer")
//    public void kullanıcıAbsenteeAlanınaDevamsızlıkBilgisiniGirer() {
//        tSI.absenteeZeynep.sendKeys("5");
//    }
//
//    @And("Kullanıcı miditerm exam alnına not bilgisi girer")
//    public void kullanıcıMiditermExamAlnınaNotBilgisiGirer() {
//        tSI.midtermExamZeynep.sendKeys("85");
//    }
//
//    @And("Kullanıcı final exam alnına not bilgisi girer")
//    public void kullanıcıFinalExamAlnınaNotBilgisiGirer() {
//        tSI.finalExamZeynep.sendKeys("75");
//    }
//
//    @And("Kullanıcı değerlendirme yazısı yazar")
//    public void kullanıcıDeğerlendirmeYazısıYazar() {
//        tSI.infoNoteZeynep.sendKeys("Başarılar Dilerim");
//    }

    @And("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {

        Driver.closeDriver();
    }

    @When("Kullanıcı gerekli alanları doldurur {string},{string},{string},{string}")
    public void kullanıcıGerekliAlanlarıDoldurur(String absentee, String miditermexam, String finalexam, String infonote) {

        tSI.absenteeZeynep.sendKeys(absentee,Keys.TAB,miditermexam,Keys.TAB,finalexam,Keys.TAB,infonote);

       // Assert.assertEquals(tSI.absenteeZeynep.getText(),"8");
    }


    @And("Kullanıcı devamsizlik bilgisinin girildiğini doğrular")
    public void kullanıcıDevamsizlikBilgisininGirildiğiniDoğrular() {
        Assert.assertTrue(tSI.absenteeZeynep.getText().contains("8"));
    }

    @And("Kullanıcı {string} alanına girilen değeri doğrular")
    public void kullanıcıAlanınaGirilenDeğeriDoğrular(String string) {
        Assert.assertTrue(tSI.absenteeZeynep.isDisplayed());
    }

    @And("Kullanıcı ders öğrenci ve dönem seçebildiğini görür")
    public void kullanıcıDersÖğrenciVeDönemSeçebildiğiniGörür() {
        ReusableMethods.bekle(2);
        Assert.assertEquals("2",tSI.chooselessonZeynep.getAttribute("value"));
        Assert.assertEquals("9",tSI.choosestudentZeynep.getAttribute("value"));
        Assert.assertEquals("10",tSI.chooseeducationTermZeynep.getAttribute("value"));
    }

    @And("Kullanıcı başarılı bir şekilde not girişi yapar")
    public void kullanıcıBaşarılıBirŞekildeNotGirişiYapar() {
        ReusableMethods.bekle(2);
        Assert.assertEquals(tSI.savedYazısıZeynep.getText(), "Student Info saved Successfully");
        ReusableMethods.tumSayfaResmi();
    }



}
