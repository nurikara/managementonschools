package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US13_US14_ViceDeanTeacher extends Login {


    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherMenagementButton;
    @FindBy(xpath = "//h5[text()='Teacher List']")
    public WebElement teacherListText;
    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-teachersList']//span[@aria-hidden='true'][normalize-space()='»']")
    public WebElement goLastPageTeacherList;
    @FindBy(id = "react-select-3-input")
    public WebElement selectLessonInput;
    @FindBy(id = "name")
    public WebElement nameInput;
    @FindBy(id = "surname")
    public WebElement surnameInput;
    @FindBy(id = "birthPlace")
    public WebElement birthPlaceInput;
    @FindBy(id = "email")
    public WebElement emailInput;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberInput;
    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdviserCB;
    @FindBy(xpath = "(//input[@class='form-check-input'])[3]")
    public WebElement maleCB;
    @FindBy(xpath = "(//input[@class='form-check-input'])[6]")
    public WebElement maleCBUpdate;
    @FindBy(id = "birthDay")
    public WebElement birthDayInput;
    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement birthdayUpdate;

    @FindBy(id = "ssn")
    public WebElement ssnInput;
    @FindBy(id = "username")
    public WebElement usernameInput;
    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement usernameUpdate;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement passwordUpdate;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[text()='Page ']")
    public WebElement pageText;



    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement submitButtonUpdate;
    @FindBy(id = "react-select-4-input")
    public WebElement editTeacherLesson;
    @FindBy(xpath = "//h4[text()='Latest News']")
    public WebElement latestNewsText;
    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement msgLessonCreated2;
    @FindBy(xpath = "//button[@type='button']")
    public List<WebElement> editIconList;


@FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement chooseLessonTeacher;






}
