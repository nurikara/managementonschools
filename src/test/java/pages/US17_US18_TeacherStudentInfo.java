package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US17_US18_TeacherStudentInfo extends Login{

    @FindBy(xpath = "//*[text()='Student Info List']")
    public WebElement studentInfoListTextTuna;
    @FindBy(xpath = "//table")
    public WebElement studentInfoListTableTuna;
    @FindBy(xpath = "(//td//button)[1]")
    public WebElement editButtonTuna;
    @FindBy(xpath = "((//form)[2])//select")
    public WebElement editStudentInfoTuna;
    @FindBy(xpath = "(//input[@id='absentee'])[2]")
    public WebElement editStudentInfoAbsanteeTuna;
    @FindBy(xpath = "(//td)[7]//span")
    public WebElement infoNoteTable;
    @FindBy(xpath = "(//td//button)[2]")
    public WebElement studentInfoDeleteButtonTuna;

@FindBy(id = "lessonId")
    public WebElement chooselessonZeynep;

    @FindBy(id = "studentId")
    public WebElement choosestudentZeynep;

    @FindBy(id = "educationTermId")
    public WebElement chooseeducationTermZeynep;

    @FindBy(id = "absentee")
    public WebElement absenteeZeynep;


    @FindBy(id = "midtermExam")
    public WebElement midtermExamZeynep;

    @FindBy(id = "finalExam")
    public WebElement finalExamZeynep;

    @FindBy(id = "infoNote")
    public WebElement infoNoteZeynep;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButtonZeynep;

@FindBy(xpath = "//*[text()='Student Info saved Successfully']")
    public WebElement savedYazısıZeynep;


}
