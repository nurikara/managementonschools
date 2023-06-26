package stepdef.ui;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Login;
import pages.US15_ViceDeanStudent;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US15_Steps_Erel<string> {
    US15_ViceDeanStudent vice=new US15_ViceDeanStudent();
    Login log=new Login();
    @Given("Kullanıcı _{string} sayfasina gider")
    public <String> void kullanıcı_sayfasina_gider(string Url) {

        Driver.getDriver().get((java.lang.String) Url);
    }
    @When("Kullanıcı LOG IN e tıklar")
    public void kullanıcı_log_ın_e_tıklar() {

        log.login.click();
    }
    @When("Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer")
    public void kullanıcı_geçerli_vice_dean_olarak_user_name_ve_password_u_girer() {
log.username.sendKeys(ConfigReader.getProperty("username"));
log.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.click(vice.accountlogin);
    }
    @When("Kullanıcı menuden student management e tıklar")
    public void kullanıcı_menuden_student_management_e_tıklar() {
ReusableMethods.click(vice.menu);
ReusableMethods.bekle(1);
ReusableMethods.click(vice.studentmanagement);
    }
    @Then("Kullanıcı istediği danışman öğretmeni seçer")
    public void kullanıcı_istediği_danışman_öğretmeni_seçer() {
        ReusableMethods.click(vice.teacherselectddm);
        Select select=new Select(vice.teacherselectddm);
        select.selectByValue("6");
    }


    @And("And Kullanıcı NAME İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void andKullanıcıNAMEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı name in altında Required yazısını görür.")
    public void kullanıcıNameInAltındaRequiredYazısınıGörür() {

        Assert.assertTrue(vice.namerequired.isDisplayed());
    }

    @And("Kullanıcı SurNAME i boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıSurNAMEIBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı surname in altında Required yazısını görür.")
    public void kullanıcıSurnameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.surnamerequired.isDisplayed());
    }

    @And("Kullanıcı BIRTH PLACE İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıBIRTHPLACEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Birth Place in altında Required yazısını görür.")
    public void kullanıcıBirthPlaceInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.birthplacerequired.isDisplayed());
    }

    @And("Kullanıcı E-mail İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıEMailİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı E-mail in altında Required yazısını görür.")
    public void kullanıcıEMailInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.emailrequired.isDisplayed());
    }

    @And("Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıTelefonNumarasıİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Telefon numarası in altında Required yazısını görür.")
    public void kullanıcıTelefonNumarasıInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.phonerequired.isDisplayed());
    }

    @And("Kullanıcı cinsiyet İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıCinsiyetİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.submit.click();
    }

    @Then("Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE uyarısını görür")
    public void kullanıcıYouHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEUyarısınıGörür() {
       // String expected="You have entered an invalid value. Valid values are: MALE, FEMALE";
       //String actual=vice.genderalert.getText();
        ReusableMethods.bekle(2);
        Assert.assertTrue(vice.genderalert.isDisplayed());
    }

    @And("Kullanıcı Date Of Birth İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıDateOfBirthİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Date Of Birth in altında Required yazısını görür.")
    public void kullanıcıDateOfBirthInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.dobrequired.isDisplayed());
    }

    @And("Kullanıcı User Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıUserNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı User Name in altında Required yazısını görür.")
    public void kullanıcıUserNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.usernamerequired.isDisplayed());
    }

    @And("Kullanıcı father name İ boş bırakıp NAME,surname,Birth Place,email,Date Of Birth,Ssn,User name,cinsiyet,mother name,geçerli password,Telefon numarası girdikten sonra submit e tıklar")
    public void kullanıcıFatherNameİBoşBırakıpNAMESurnameBirthPlaceEmailDateOfBirthSsnUserNameCinsiyetMotherNameGeçerliPasswordTelefonNumarasıGirdiktenSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Father Name in altında Required yazısını görür.")
    public void kullanıcıFatherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.fathernamerequired.isDisplayed());
    }

    @And("Kullanıcı Mother Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıMotherNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı Mother Name in altında Required yazısını görür.")
    public void kullanıcıMotherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.mothernamerequired.isDisplayed());
    }



    @Then("Kullanıcı Please enter valid SSN number uyarsını görür.")
    public void kullanıcıPleaseEnterValidSSNNumberUyarsınıGörür() {

    }



    @And("Sayfa kapatiliir")
    public void sayfaKapatiliir() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();
    }

    @And("Kullanıcı SSN BÖLÜMÜNE; {string} ve dokuz rakamdan oluşan numarayı,diğer bölümler girdikten sonra submit e tıklar")
    public <String> void kullanıcıSSNBÖLÜMÜNEVeDokuzRakamdanOluşanNumarayıDiğerBölümlerGirdiktenSonraSubmitETıklar(String ihtimal) {
        vice.ssn.sendKeys((CharSequence) ihtimal);
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.female.click();
        vice.submit.click();

    }

    @And("Kullanıcı tüm bölümleri girdikten sonra submit e tıklar")
    public void kullanıcıTümBölümleriGirdiktenSonraSubmitETıklar() {
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı STUDENT LIST bölümünde student number ı görür.")
    public void kullanıcıSTUDENTLISTBölümündeStudentNumberIGörür() {
        Assert.assertTrue(vice.studentnumber.isDisplayed());


    }


    @And("Kullanıcı password kısmına {string} İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public <String> void kullanıcıPasswordKısmınaİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar(String Pass) {
        vice.smpassword.sendKeys((CharSequence) Pass);
        vice.name.sendKeys(ConfigReader.getProperty("erelname"));
        vice.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        vice.email.sendKeys(ConfigReader.getProperty("erelemail"));
        vice.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        vice.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        vice.username.sendKeys(ConfigReader.getProperty("erelusername"));
        vice.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        vice.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        vice.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        vice.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        vice.female.click();
        vice.submit.click();
    }

    @Then("Kullanıcı passwordun altında Minimum sekiz character uyarısını görür")
    public <String> void kullanıcıPasswordunAltındaMinimumSekizCharacterUyarısınıGörür() {
       // String expected="Minimum 8 character";

    }


}
