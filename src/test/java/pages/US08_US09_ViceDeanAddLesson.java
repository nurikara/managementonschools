package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
    @FindBy(xpath = "(//div[text()='Page '])[2]")
    public WebElement schollLogo;
    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement msgLessonCreated2;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement msgLessonCreated3;
    @FindBy(xpath = "//h5[text()='Lesson List']")
    public WebElement lessonList;

    @FindBy(xpath = "//span[text()='']")
    public WebElement LessonNameFaker;
    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement trashBox;
    @FindBy(xpath = "(//div[@class='container-fluid'])[4]")
    public WebElement addLessonUpdateElement;
    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public List<WebElement> cop;







}
