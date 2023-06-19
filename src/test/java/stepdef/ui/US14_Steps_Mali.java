package stepdef.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US13_US14_ViceDeanTeacher;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US14_Steps_Mali {
    US13_US14_ViceDeanTeacher locate=new US13_US14_ViceDeanTeacher();

    WebDriver driver= Driver.getDriver();
    static  Faker faker=new Faker();

    static String name;
    static String surname;
    static String phoneNumber="987-987-"+faker.number().digits(4);
    static String ssnNumber;
    static String username;
    static String city;

    @Given("Kullanici AddTeacher alani inputlarini doldurarak gecerli bir giris yapar")
    public void kullaniciAddTeacherAlaniInputlariniDoldurarakGecerliBirGirisYapar() {
        locate.menuButton.click();
        ReusableMethods.bekle(1);
        locate.teacherMenagementButton.click();
        ReusableMethods.bekle(1);
        locate.selectLessonInput.click();
        locate.selectLessonInput.sendKeys("Phyton", Keys.TAB);
        ReusableMethods.bekle(1);
        name=faker.name().firstName();
        System.out.println("name = " + name);
        locate.nameInput.sendKeys(name);
        ReusableMethods.bekle(1);
        surname=faker.name().lastName();
        System.out.println("surname = " + surname);
        locate.surnameInput.sendKeys(surname);
        ReusableMethods.bekle(1);
        String city=faker.country().capital();
        locate.birthPlaceInput.sendKeys(city);
        ReusableMethods.bekle(1);
        String email=faker.internet().emailAddress();
        locate.emailInput.sendKeys(email);
        ReusableMethods.bekle(1);
        //phoneNumber=faker.phoneNumber().cellPhone();
        locate.phoneNumberInput.sendKeys(phoneNumber);
        ReusableMethods.bekle(1);
        locate.isAdviserCB.click();
        ReusableMethods.bekle(1);
        locate.maleCB.click();
        ReusableMethods.bekle(1);
        String dateOfBirth="13.08.1979";
        locate.birthDayInput.sendKeys(dateOfBirth);
        ReusableMethods.bekle(1);
        ssnNumber=faker.idNumber().ssnValid();
        locate.ssnInput.sendKeys(ssnNumber);
        ReusableMethods.bekle(1);
        username=faker.name().username();
        locate.usernameInput.sendKeys(username);
        ReusableMethods.bekle(1);
        String psw1="Proje123";
        locate.passwordInput.sendKeys(psw1);
        ReusableMethods.bekle(1);
        locate.submitButton.click();

    }
    @Given("Kullanici Ogretmen Listesi Son Sayfaya Gider")
    public void kullanici_ogretmen_listesi_son_sayfaya_gider() {
        locate.menuButton.click();
        ReusableMethods.bekle(1);
        locate.teacherMenagementButton.click();
        ReusableMethods.bekle(1);
        ReusableMethods.scrollEnd();
        ReusableMethods.click(locate.goLastPageTeacherList);
       // ReusableMethods.scroll(locate.goLastPageTeacherList);
       // locate.goLastPageTeacherList.click();
        ReusableMethods.bekle(1);

    }


    @Then("Liste son sirada bulunan ogretmen bilgileri girilen data ile dogrulanir")
    public void listeSonSiradaBulunanOgretmenBilgileriGirilenDataIleDogrulanir() {
        List<WebElement> actualData=driver.findElements(By.xpath("//td"));

        for (int i = 0; i <actualData.size() ; i++) {
            System.out.println("actualData = " + actualData.get(i).getText());
            if (actualData.get(i).getText().contains(surname)){
                System.out.println("actualData teacherName = " + actualData.get(i).getText());
                Assert.assertEquals(name+" "+surname,actualData.get(i).getText());
                Assert.assertEquals(phoneNumber,actualData.get(i+1).getText());
                System.out.println("actualData phoneNumber = " + actualData.get(i+1).getText());
                Assert.assertEquals(ssnNumber,actualData.get(i+2).getText());
                System.out.println("actualData  ssnNumber = " + actualData.get(i +2).getText());
                Assert.assertEquals(username,actualData.get(i+3).getText());
                System.out.println("actualData  username = " + actualData.get(i+3 ).getText());
            }

        }
    }

    @And("Son siradaki ogretmen bilgileri edit butona basar")
    public void sonSiradakiOgretmenBilgileriEditButonaBasar() {

        List<WebElement> editIconList=driver.findElements(By.xpath("//button[@type='button']"));
        ReusableMethods.scroll(locate.submitButton);
        ReusableMethods.bekle(1);
        int size=editIconList.size();
        System.out.println("size = " + size);
        driver.findElement(By.xpath("(//button[@type='button'])["+size+"]")).click();




    }

    @Then("Acilan pencerede tum input alanlarini gunceller ve submit butona basar")
    public void acilanPenceredeTumInputAlanlariniGuncellerVeSubmitButonaBasar() throws InterruptedException {
        name=faker.name().firstName();
        surname=faker.name().lastName();
        String email=faker.internet().emailAddress();
        String city1=faker.country().capital();
        String psw1="Proje123456";
        username=faker.name().username();
        ssnNumber=faker.idNumber().ssnValid();
        locate.editTeacherLesson.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys("Sırtustu Yuzme", Keys.ENTER,Keys.TAB).
                sendKeys(name,Keys.TAB).
                sendKeys(surname,Keys.TAB).
                sendKeys(city1,Keys.TAB).
                sendKeys(email,Keys.TAB).
                sendKeys(phoneNumber,Keys.TAB).
                sendKeys(ssnNumber,Keys.TAB,Keys.TAB,Keys.TAB).
                sendKeys("01-10-1980",Keys.ENTER,Keys.TAB).
                sendKeys(username,Keys.TAB).sendKeys(psw1).release().perform();
        locate.maleCBUpdate.click();

        ReusableMethods.bekle(3);
        locate.submitButtonUpdate.click();
        ReusableMethods.bekle(1);




    }

    @And("Liste son sırada guncellenen bilgiler goruntulenir")
    public void listeSonSıradaGuncellenenBilgilerGoruntulenir() {
        List<WebElement> actualData=driver.findElements(By.xpath("//td"));

        for (int i = 0; i <actualData.size() ; i++) {
            System.out.println("actualData = " + actualData.get(i).getText());
            if (actualData.get(i).getText().contains(surname)){
                System.out.println("actualData teacherName = " + actualData.get(i).getText());
                Assert.assertEquals(name+" "+surname,actualData.get(i).getText());
                Assert.assertEquals(phoneNumber,actualData.get(i+1).getText());
                System.out.println("actualData phoneNumber = " + actualData.get(i+1).getText());
                Assert.assertEquals(ssnNumber,actualData.get(i+2).getText());
                System.out.println("actualData  ssnNumber = " + actualData.get(i +2).getText());
                Assert.assertEquals(username,actualData.get(i+3).getText());
                System.out.println("actualData  username = " + actualData.get(i+3 ).getText());
            }

        }
    }

    @And("Basarili güncelleme mesaji goruntulenir")
    public void basariliGuncellemeMesajiGoruntulenir() {
        System.out.println("locate.msgLessonCreated2.getText() = " + locate.msgLessonCreated2.getText());
        Assert.assertTrue(locate.msgLessonCreated2.getText().contains("Teacher updated Successful"));
    }
}
