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
    @FindBy(xpath = "(//span[text()='»'])[2]")
    public WebElement goLastPage;
    @FindBy(xpath = "//img[@src='/static/media/logo_02.631e4888a6e3684fc004.png']")
    public WebElement schollLogo;
    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement msgLessonCreated2;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement msgLessonCreated3;






}
