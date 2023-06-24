package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US21_Student extends Login{

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']/thead/tr/th)[1]")
    public WebElement ChooseLessonInfo;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']/thead/tr/th)[2]")
    public WebElement lessonInfo;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']/thead/tr/th)[3]")
    public WebElement teacherInfo;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']/thead/tr/th)[4]")
    public WebElement dayInfo;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']/thead/tr/th)[5]")
    public WebElement startTimeInfo;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']/thead/tr/th)[6]")
    public WebElement stopTimeInfo;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[3]")
    public WebElement lesson01;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[4]")
    public WebElement lesson02;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitManagement;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[12]")
    public WebElement sameLesson01;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[13]")
    public WebElement sameLesson02;

    @FindBy(xpath = "(//input[@type='checkbox'])[148]")
    public WebElement lastLesson;

    @FindBy(xpath = "((//*[@class='table-group-divider'])[2]/tr/td/span)[1]")
    public WebElement javaLesson;

    @FindBy(xpath = "((//*[@class='table-group-divider'])[2]/tr/td/span)[5]")
    public WebElement CypressLesson;

    @FindBy(xpath = "((//*[@class='table-group-divider'])[2]/tr/td/span)[13]")
    public WebElement makroIktisatLesson;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Grades and Announcements']")
    public WebElement gradesAndAnnouncementsButton;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[1]/thead/tr/th[3]")
    public WebElement MidtermExam;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[1]/thead/tr/th[4]")
    public WebElement FinalExam;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]/thead/tr/th[2]")
    public WebElement StartTimeMeet;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]/thead/tr/th[3]")
    public WebElement StopTimeMeet;



}
