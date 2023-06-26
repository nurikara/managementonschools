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

    @FindBy(xpath = "   //*[@class=' css-13cymwt-control']")
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






}
