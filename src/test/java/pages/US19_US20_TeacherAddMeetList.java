package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US19_US20_TeacherAddMeetList extends Login {


// Teacher ile giris sonrası sagdaki menu tusu
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement MenuButton;

 @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement MeetManagement;

    @FindBy(xpath = "  //*[@id='root']/div/main/div/div[1]/div[2]/div/div/form/div/div[1]/div/div/div[2]/div")
    public WebElement SelectStudentMenuLine ;

    @FindBy(xpath = "//*[@class=' css-9jq23d']")
    public WebElement SelectedStudent;

@FindBy(id ="date")
    public WebElement date;

@FindBy(xpath = "//*[@class='form-label']")
    public WebElement selectdate;


@FindBy(xpath = "//input[@id='startTime']")
    public WebElement StartTime;


@FindBy(xpath = "//input[@id='stopTime']")
    public WebElement StopTime;

@FindBy(xpath = "//input[@id='description']")
    public WebElement Description;

@FindBy(xpath = "//button[text()='Submit']")
    public WebElement addMeetSubmit;

//ileri tarih ile kayıt halinde ve meet kaydı sonucu acılan alert ikisinin locate aynı
@FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement MeetPageAlert;

@FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement StartTimeRequired;

@FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement StopTimeRequired;

@FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement DescriptionRequired;

@FindBy(xpath = "")
    public WebElement popupmessage;

@FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement Login;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement LoginButton;

    @FindBy(xpath = "//label[@class='form-label']")
    public WebElement dateOfMeet;

    @FindBy(xpath = "//label[text()='Start Time']")
    public WebElement startTime;

    @FindBy(xpath = "//label[text()='Stop Time']")
    public WebElement stopTime;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement description;

    @FindBy(xpath = "//button[@class='text-dark btn btn-outline-info'][1]")
    public WebElement edit;

    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement editDateOfTime;

    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement editStartTime;

    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement editStopTime;

    @FindBy(xpath = "(//input[@id='description'])[2]")
    public WebElement editDescription;

    @FindBy(xpath = "(//button[@type='button'])[11]")
    public WebElement editSubmit;

    @FindBy(xpath = "(//div[@class=' css-19bb58m']")
    public WebElement chooseStudentMenu;

    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[1]")
    public WebElement trashMeet;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement meetDescription;


}
