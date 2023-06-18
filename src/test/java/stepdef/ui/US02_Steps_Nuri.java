package stepdef.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Login;
import pages.US02_AdminUserList;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;


public class US02_Steps_Nuri {

    Login login = new Login();

    US02_AdminUserList login2 = new US02_AdminUserList();


    @Given("Admin ilgili sitenin anasayfasina gider")
    public void admin_ilgili_sitenin_anasayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("Admin kullanici adi ve sifresini kullanarak Admin panaline giris yapar")
    public void admin_kullanici_adi_ve_sifresini_kullanarak_admin_panaline_giris_yapar() throws InterruptedException {

        login.homePageLogin.click();
        login.username.sendKeys(ConfigReader.getProperty("admin"));
        Thread.sleep(1000);
        login.password.sendKeys(ConfigReader.getProperty("psw"), Keys.TAB, Keys.ENTER);

        Thread.sleep(1000);

    }

    @When("Acilan pencerenin sol ust kosesine gidilerek Menu butonuna tiklanir")
    public void acilan_pencerenin_sol_ust_kosesine_gidilerek_menu_butonuna_tiklanir() throws InterruptedException {

        login2.menu.click();

        Thread.sleep(1000);
    }

    @When("Sayganin sol kisminda acilan main menu kisminin altindaki Guset User segmesi tiklanir")
    public void sayganin_sol_kisminda_acilan_main_menu_kisminin_altindaki_guset_user_segmesi_tiklanir() throws InterruptedException {
        login2.guestlist.click();

        Thread.sleep(1000);


    }

    @Then("Acilan sayfada Gust User listesi goruntulenir")
    public void acilan_sayfada_gust_user_listesi_goruntulenir() throws InterruptedException {

        String list= login2.gueslistPage.getText();

        assertEquals("Guest User List", list);


    }

    @Then("Sayfadan logout yapilarak cikilir")
    public void sayfadan_logout_yapilarak_cikilir() throws InterruptedException {
        Thread.sleep(1000);

        login2.menu.click();

        Thread.sleep(1000);

        login2.logout.click();

        Thread.sleep(1000);

        login2.yes.click();

    }



    @Then("Acilan sayfada Gust User listesindeki uyelerin yaninda bulunan silme buttonu tilanir")
    public void acilanSayfadaGustUserListesindekiUyelerinYanindaBulunanSilmeButtonuTilanir() throws InterruptedException {

       login2.birinciyiSil.click();
       Thread.sleep(2000);

      assertEquals("Guest User deleted Successful", login2.alert.getText());
    }
}
