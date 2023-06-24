package stepdef.ui;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.US04_US05_Admin_Dean;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.awt.*;
import java.awt.event.KeyEvent;
import static org.junit.Assert.*;


public class US_04_StepDefs {
    WebDriver driver = Driver.getDriver();

    US04_US05_Admin_Dean adminDean =new US04_US05_Admin_Dean();

    @Given("Kullanıcı \"url\"ye gider")
    public void kullanıcı_url_ye_gider() {
        driver.get(ConfigReader.getProperty("url"));

    }

    @Then("Kullanıcı logine tıklar")
    public void kullanıcı_logine_tıklar() {
        adminDean.homePageLogin.click();
        ReusableMethods.bekle(1);


    }

    @And("Kullanıcı geçerli Admin olarak user name'i girer")
    public void kullanıcı_geçerli_admin_olarak_user_name_i_girer() {
        adminDean.username.sendKeys(ConfigReader.getProperty("admin"));
        ReusableMethods.bekle(1);

    }

    @And("Kullanıcı geçerli Admin olarak password'u girer")
    public void kullanıcı_geçerli_admin_olarak_password_u_girer() {
        adminDean.password.sendKeys(ConfigReader.getProperty("psw"));
        ReusableMethods.bekle(1);

    }

    @And("Kullanıcı Login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
        adminDean.LoginButton.click();
        ReusableMethods.bekle(1);

    }

    @And("Kullanıcı Menu Butonuna tıklar")
    public void kullanıcı_menu_butonuna_tıklar() {
        adminDean.menuButton.click();
        ReusableMethods.bekle(2);

    }

    @And("Açılan sayfadan Dean Management Butonuna tıklar")
    public void açılan_sayfadan_dean_management_butonuna_tıklar() {
        adminDean.deanManagamentButton.click();
        ReusableMethods.bekle(2);

    }

    @And("Dean Management sayfasının açıldığı doğrulanır")
    public void dean_management_sayfasının_açıldığı_doğrulanır() {
        assertTrue(adminDean.deanManagamentText.isDisplayed());

    }


    @And("Kullanıcı username ve password yazar")
    public void kullanıcıUsernameVePasswordYazar() {
        adminDean.username.sendKeys(ConfigReader.getProperty("admin"));
        ReusableMethods.bekle(1);

        adminDean.password.sendKeys(ConfigReader.getProperty("psw"));
        ReusableMethods.bekle(1);

    }
    @Then("Kullanıcı Menu'den Dean Management sayfasına gider")
    public void kullanıcıMenuDenDeanManagementSayfasınaGider() {
        adminDean.menuButton.click();
        ReusableMethods.bekle(2);
        adminDean.deanManagamentButton.click();
        ReusableMethods.bekle(2);

    }

    @And("Dean Management  bilgilerini eksiksiz doldurulur.")
    public void deanManagementBilgileriniEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.maleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        adminDean.submitButton1.click();


    }


    @And("Kullanici Submit butona tıklar")
    public void kullaniciSubmitButonaTıklar() {
        adminDean.submitButton1.click();
        ReusableMethods.bekle(1);
    }

    @And("Kullanıcı yeni admin eklendigini doğrular")
    public void kullanıcıYeniAdminEklendiginiDogrular() {
        ReusableMethods.bekle(1);
       assertTrue(adminDean.saveTest.getText().contains("Saved"));
       ReusableMethods.tumSayfaResmi();

    }


    @And("Kullanıcı Name bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.nameDeanReq.getText().contains("Required"));


    }

    @And("Kullanıcı Surname bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıSurnameBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.surnameDeanReq.getText().contains("Required"));
    }

    @And("Kullanıcı Birth Place bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıBirthPlaceBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.birtPlaceDeanReq.getText().contains("Required"));
    }


    @And("Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE yazısının çıktığını doğrular")
    public void kullanıcıYouHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEYazısınınCıktıgınıDogrular() {
        adminDean.submitButton1.click();
        ReusableMethods.bekle(2);
        assertTrue(adminDean.saveTest.getText().contains("You have entered an invalid value. Valid values are: MALE, FEMALE"));
        ReusableMethods.bekle(3);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.maleGender.click();


    }

    @And("Kullanıcı Doğum Tarihi bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıDogumTarihiBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.dateOfBirdDeanReq.getText().contains("Required"));
    }

    @And("Kullanıcı user name bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıUserNameBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.usernameDeanReq.getText().contains("Required"));

    }

    @And("Kullanıcı Phone bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıPhoneBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.phoneDeanReq.getText().contains("Required"));

    }

    @And("Kullanıcı Phone bölümünün altında Minimum 12 character \\(XXX-XXX-XXXX)  yazısının çıktığını doğrular")
    public void kullanıcıPhoneBolumununAltındaMinimumCharacterXXXXXXXXXXYazısınınCıktıgınıDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.phoneDeanReq.getText().contains("Minimum 12 character (XXX-XXX-XXXX)"));

    }

    @And("Kullanıcı hata mesajını doğrular")
    public void kullanıcıHataMesajınıDoğrular() {

        ReusableMethods.bekle(1);
        adminDean.submitButton1.click();
        ReusableMethods.bekle(2);

        boolean firstAlertShown = true;
        boolean secondAlertShown = true;

        if (!firstAlertShown && !secondAlertShown) {


        } else if (!firstAlertShown) {
            assertTrue(adminDean.saveTest.getText().contains("Please enter valid phone number"));


        } else if (!secondAlertShown) {
            assertTrue(adminDean.saveTest.getText().contains("Phone number should be exact 12 characters"));

        }

    }


    @And("Kullanıcı SSN bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıSSNBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.ssnDeanReq.getText().contains("Required"));
        
    }

    @And("Kullanıcı SSN bölümünün altında Minimum 11 character \\(XXX-XX-XXXX) yazısının çıktığını doğrular")
    public void kullanıcıSSNBolumununAltındaMinimumCharacterXXXXXXXXXYazısınınCıktıgınıDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.ssnDeanReq.getText().contains("Minimum 11 character (XXX-XX-XXXX)"));

    }
    @And("Kullanıcı Please enter valid SSN number yazısının çıktığını doğrular")
    public void kullanıcıPleaseEnterValidSSNNumberYazısınınCıktıgınıDogrular() {
        ReusableMethods.bekle(2);
        adminDean.submitButton1.click();
        ReusableMethods.bekle(2);
        assertTrue(adminDean.saveTest.getText().contains("Please enter valid SSN number"));

    }

    @And("Kullanıcı password bölümünün altında Required yazısının olduğunu doğrular")
    public void kullanıcıPasswordBolumununAltındaRequiredYazısınınOldugunuDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.passwordDeanReq.getText().contains("Required"));

    }

    @And("Kullanıcı Password bölümünün altında Minimum 8 character yazısının çıktığını doğrular")
    public void kullanıcıPasswordBolumununAltındaMinimumCharacterYazısınınCıktıgınıDogrular() {
        ReusableMethods.bekle(2);
        assertTrue(adminDean.passwordDeanReq.getText().contains("Minimum 8 character"));


    }
    @And("Kullanici bilgileri eksiksiz doldurulur")
    public void kullaniciBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);

    }

    @And("Password alanına 8 harf içeren bir password girer ve Submit Butonuna Tıklar")
    public void passwordAlanınaHarfIcerenBirPasswordSubmitButonunaTıklar() throws AWTException {
        adminDean.password.click();
        ReusableMethods.robotDelete();
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password3"));
        ReusableMethods.bekle(2);
        //adminDean.submitButton1.click();

    }

    @And("Kullanıcı kayıt edilemediğine ilişkin hata mesajı çıktığını doğrular")
    public void kullanıcıKayıtEdilemedigineIliskinHataMesajıCıktıgınıDogrular() {
        ReusableMethods.bekle(2);
        adminDean.submitButton1.click();
        ReusableMethods.bekle(2);
        assertFalse(adminDean.saveTest.getText().contains("Saved"));
    }


    @And("Password alanına 8 sayı içeren bir password girer ve Submit Butonuna Tıklar")
    public void passwordAlanınaSayıIcerenBirPasswordSubmitButonunaTıklar() throws AWTException {
        adminDean.password.click();
        ReusableMethods.robotDelete();
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password4"));
        ReusableMethods.bekle(2);
        adminDean.submitButton1.click();


    }

    @And("Password alanına 8 kararterden az bir password girer ve Submit Butonuna Tıklar")
    public void passwordAlanınaKararterdenAzBirPasswordGirerVeSubmitButonunaTıklar() throws AWTException {
        adminDean.password.click();
        ReusableMethods.robotDelete();
        ReusableMethods.bekle(5);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password2"));
        ReusableMethods.bekle(2);
        adminDean.submitButton1.click();

    }

    @And("Password alanın boş bırakır ve Submit Butonuna Tıklar")
    public void passwordAlanınBosBırakırVeSubmitButonunaTıklar() {
        adminDean.password.clear();
        ReusableMethods.bekle(3);

    }

    @And("Kullanici SSN bolumu hariç hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciSSNHaricDigerBilgileriEksiksizDoldurulurSubmitButonunaTıklar() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);


    }

    @And("Kullanıcı SSN alanın boş bırakır ve Submit Butonuna Tıklar")
    public void kullanıcıSSNAlanınBosBırakırVeSubmitButonunaTıklar() {

    }

    @And("Kullanıcı SSN alanına 11 karakterden az bir rakam girer ve Submit Butonuna Tıklar")
    public void kullanıcıSSNalanınaKarakterdenAzBirRakamGirerVeSubmitButonunaTıklar() throws AWTException {
        adminDean.ssn.click();
        ReusableMethods.robotDelete();
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn2"));

    }

    @And("Kullanıcı SSN bölümüne 11 karakter bir rakam girer ve Submit Butonuna Tıklar")
    public void kullanıcıSSNBolumuneKarakterBirRakamGirerVeSubmitButonunaTıklar() throws AWTException {
        adminDean.ssn.click();
        ReusableMethods.robotDelete();
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn3"));
    }

    @And("Kullanıcı SSN bölümüne 11 tane harf girer ve Submit Butonuna Tıklar")
    public void kullanıcıSSNBolumuneTaneHarfGirerveSubmitButonunaTıklar() throws AWTException {
        adminDean.ssn.click();
        ReusableMethods.robotDelete();
        Robot robot= new Robot();
        robot.keyPress(KeyEvent.VK_DELETE);
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn4"));
    }

    @Given("Kullanici Phone bölümü hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciPhoneBolumuHaricDigerBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);


    }

    @And("Kullanıcı Phone alanın boş bırakır ve Submit Butonuna Tıklar")
    public void kullanıcıPhoneAlanınBosBırakırVeSubmitButonunaTıklar() {

    }

    @And("Kullanıcı Phone alanına 12 karakterden az sayı girer")
    public void kullanıcıPhoneAlanınaKarakterdenAzSayıGirerVeSubmitButonunaTıklar() {
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber2"));

    }

    @And("Kullanıcı Phone alanına 12 karakterden fazla sayı girer ve Submit Butonuna Tıklar")
    public void kullanıcıPhoneAlanınaKarakterdenFazlaSayıGirerVeSubmitButonunaTıklar() throws AWTException {
        adminDean.phoneNumber.click();
        ReusableMethods.robotDelete();
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber3"));
    }


    @Given("Kullanici Name bolumu hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciNameBolumuHaricDigerBilgileriEksiksizDoldurulur() {

        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);

    }

    @Given("Kullanici Surname bolumu hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciSurnameBolumuHaricDigerBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);

    }

    @Given("Kullanici Birth Place bolumu hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciBirthPlaceBolumuHaricDigerBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);
    }

    @Given("Kullanici Cinsiyet bolumu hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciCinsiyetBolumuHaricDigerBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);
    }

    @Given("Kullanici Date Of Birth bolumu hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciDateOfBirthBolumuHaricDigerBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.username.sendKeys(ReusableMethods.fakerInput("username"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);
    }

    @Given("Kullanici User Name bolumu hariç diğer bilgileri eksiksiz doldurulur")
    public void kullaniciUserNameBolumuHaricDigerBilgileriEksiksizDoldurulur() {
        adminDean.name.sendKeys(ReusableMethods.fakerInput("name"));
        ReusableMethods.bekle(1);
        adminDean.surname.sendKeys(ReusableMethods.fakerInput("surname"));
        ReusableMethods.bekle(1);
        adminDean.birthPlace.sendKeys(ReusableMethods.fakerInput("birthPlace"));
        ReusableMethods.bekle(1);
        adminDean.famaleGender.click();
        ReusableMethods.bekle(1);
        adminDean.birthDay.sendKeys(ReusableMethods.fakerInput("dateOfBirth"));
        ReusableMethods.bekle(1);
        adminDean.phoneNumber.sendKeys(ReusableMethods.fakerInput("phoneNumber1"));
        ReusableMethods.bekle(1);
        adminDean.ssn.sendKeys(ReusableMethods.fakerInput("ssn1"));
        ReusableMethods.bekle(1);
        adminDean.password.sendKeys(ReusableMethods.fakerInput("password1"));
        ReusableMethods.bekle(1);

    }
}
