package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.US22_US23_US24_Add;

public class US24_Step_Zeynep {
    US22_US23_US24_Add adminTeacher=new US22_US23_US24_Add();

    @And("Kullanıcı  Choose Lesson alanını tıklar")
    public void kullanıcıChooseLessonAlanınıTıklar() {

        adminTeacher.chooseLesoonZeynep.click();

    }

    @Then("Kullanıcı Choose Lessons alanında çıkan listeden ders seçimini yapar")
    public void kullanıcıChooseLessonsAlanındaÇıkanListedenDersSeçiminiYapar() {
        adminTeacher.chooseLesoonZeynep.sendKeys("Java", Keys.TAB);
    }
}
