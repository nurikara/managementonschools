package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US22_US23_US24_Add;
import utilities.Driver;
import utilities.ReusableMethods;

public class US24_Step_Zeynep {
    US22_US23_US24_Add adminTeacher=new US22_US23_US24_Add();
    Actions actions = new Actions(Driver.getDriver());
    @And("Kullanıcı  Choose Lesson alanını tıklar")
    public void kullanıcıChooseLessonAlanınıTıklar() {

        adminTeacher.chooseLesoonZeynep.click();

    }

    @Then("Kullanıcı Choose Lessons alanında çıkan listeden ders seçimini yapar")
    public void kullanıcıChooseLessonsAlanındaÇıkanListedenDersSeçiminiYapar() {
        adminTeacher.lessonlistZeynep.click();
    }

    @And("Kullanıcı ders seçildiğini görür")
    public void kullanıcıDersSeçildiğiniGörür() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminTeacher.chooseLesoonZeynep.isDisplayed());
    }

}
