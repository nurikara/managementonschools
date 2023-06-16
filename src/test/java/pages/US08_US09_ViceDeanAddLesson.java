package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08_US09_ViceDeanAddLesson extends Login{


    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement Lessons;
    @FindBy(id = "lessonName")
    public WebElement lessonName;
    @FindBy(id = "compulsory")
    public WebElement compulsoryCheckbox;
    @FindBy(id = "creditScore")
    public WebElement creditScore;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement addLessonSubmit;
    @FindBy(xpath = "//div[text()='Lesson Created']")
    public WebElement msgLessonCreated;


}
