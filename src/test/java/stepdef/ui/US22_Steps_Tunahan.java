package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US22_US23_US24_Add;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.Random;

public class US22_Steps_Tunahan {
    US22_US23_US24_Add add = new US22_US23_US24_Add();


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
        ReusableMethods.bekle(1);



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

    @And("kullanici_AddAdmin_bölümünü_name_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_name_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys( Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @Then("kullanici_admin_eklenmedigini_dogrular")
    public void kullanici_admin_eklenmedigini_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertFalse(add.tablo.getText().contains(userName));

    }

    @And("kullanici_AddAdmin_bölümünü_surname_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_surname_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }


    @And("kullanici_AddAdmin_bölümünü_BirthPlace_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_birthplace_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @And("kullanici_AddAdmin_bölümünü_Cinsiyet_secmeden_doldurur")
    public void kullanici_addadmin_bolumunu_cinsiyet_secmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @And("kullanici_AddAdmin_bölümünü_DogumTarihi_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_dogumtarihi_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, Keys.TAB,Keys.TAB, Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @And("kullanici_AddAdmin_bölümünü_Telefon_Numarası_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_telefon_numarası_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
              Keys.TAB,  threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @And("kullanici_AddAdmin_bölümünü_SSN_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_ssn_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
              Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @And("kullanici_AddAdmin_bölümünü_SSN_e_cizgi_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_ssn_e_cizgi_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber +""+ twoDigitNumber+ ""+ fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));
    }

    @And("kullanici_AddAdmin_bölümünü_SSN_eksik_girerek_doldurur")
    public void kullanici_addadmin_bolumunu_ssn_eksik_girerek_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                twoDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                ConfigReader.getProperty("psw"));

    }

    @And("kullanici_AddAdmin_bölümünü_username_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_username_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB,  Keys.TAB,
                ConfigReader.getProperty("psw"));

    }

    @And("kullanici_AddAdmin_bölümünü_password_girmeden_doldurur")
    public void kullanici_addadmin_bolumunu_password_girmeden_doldurur() {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB);

    }

    @And("kullanici_AddAdmin_bölümünü_pasword_{int}_karakterden_az_doldurur")
    public void kullanici_addadmin_bolumunu_pasword__karakterden_az_doldurur(int arg0) {
        userName = "Team05deneme" + fourDigitNumber;
        add.addAdminNameTextBoxT.sendKeys("Team05", Keys.TAB, "Techpro", Keys.TAB, "anywhere", Keys.TAB, Keys.SPACE, Keys.TAB, "13", "06", "2000", Keys.TAB,
                threeDigitNumber + "-" + threeDigitNumber + "-" + fourDigitNumber, Keys.TAB,
                threeDigitNumber + "-" + twoDigitNumber + "-" + fourDigitNumber, Keys.TAB, userName, Keys.TAB,
                fourDigitNumber+""+threeDigitNumber);
    }
}