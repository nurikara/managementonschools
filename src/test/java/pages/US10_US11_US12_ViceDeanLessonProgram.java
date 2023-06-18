package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US10_US11_US12_ViceDeanLessonProgram extends Login {


    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement homeLoginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement LoginButton;

    //US10
    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[normalize-space()='Lesson Management']")
    public WebElement lessonManagement;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooseLesson;

    @FindBy(xpath = "//select[@id='day']")  //dropdown
    public WebElement chooseDay;

    @FindBy(xpath = "//select[@id='educationTermId']") //dropdown
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(),'Created Lesson Program')]")
    public WebElement lessonCreatedAlert;

    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot coerce empty String (\"\") ')]")
    public WebElement chooseLessonNegativeAlert;

    @FindBy(xpath = "//*[text()='Please select education term']")
    public WebElement chooseEducationNegativeAlert;

    @FindBy(xpath = "//div[contains(text(),'You have entered an invalid value. Valid values ar')]")
    public WebElement chooseDayNegativeAlert;

    @FindBy(xpath = "//div[normalize-space()='Required']")
    public WebElement startTimeNegativeAlert;

    @FindBy(xpath = "//div[normalize-space()='Required']")
    public WebElement stopTimeNegativeAlert;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[70]")
    public WebElement lessonProgramCheckBox;

    @FindBy(xpath = "//label[@class='fw-semibold mt-2 form-label']")
    public WebElement chooseTeacherLabel;

    @FindBy(xpath = "//select[@id='teacherId']")// dropdown
    public WebElement chooseTeacherTextBox;

    @FindBy(xpath = "//div[contains(text(),'Lesson added to Teacher')]")
    public WebElement lessonAddedTeacherAlert;

    @FindBy(xpath = "//div[contains(text(),'The given id must not be null!; nested exception i')]")
    public WebElement teacherAssignNegativeAlert;

    @FindBy(xpath = "//div[contains(@class,'mb-3 mt-4 col')]//button[@type='button'][normalize-space()='Submit']")
    public WebElement teacherSubmitButton;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logout;


    @FindBy(xpath = "//button[normalize-space()='Yes']")
    public WebElement logoutOkey;





}
