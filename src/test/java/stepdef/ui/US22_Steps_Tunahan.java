package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.US22_US23_US24_US25_Add;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class US22_Steps_Tunahan {
    US22_US23_US24_US25_Add add = new US22_US23_US24_US25_Add();


    String userName;
    Random random = new Random();
    int twoDigitNumber = random.nextInt(90) + 10;
    int threeDigitNumber = random.nextInt(900) + 100;
    int fourDigitNumber = random.nextInt(9000) + 1000;


    @And("kullanici_AddAdmin_bölümünü_eksiksiz_doldurur")
    public void kullanici_addadmin_bolumunu_eksiksiz_doldurur() {

        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));


    }

    @And("kullanici_AddAdmin_bölümünde_Submit_butonuna basar")
    public void kullanici_addadmin_bolumunde_submit_butonunaBasar() {
        add.addAdminSubmitT.click();
        ReusableMethods.bekle(1);



    }


    @Then("kullanici_admin_eklendigini_dogrular")
    public void kullanici_admin_eklendigini_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(add.tablo.getText().contains(userName));


    }


    @And("kullanici_tablonun_son_sayfasina_gelir")
    public void kullanici_tablonun_son_sayfasina_gelir() {
        ReusableMethods.click(add.tableLastButton);
    }
}