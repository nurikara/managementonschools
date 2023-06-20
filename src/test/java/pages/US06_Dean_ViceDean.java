package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06_Dean_ViceDean extends Login{

    @FindBy(xpath =" //h5")
    public WebElement addViseDean;
    @FindBy(xpath ="//input[@id='name']")
    public WebElement addViseDeanName;

    @FindBy(xpath ="//input[@id='surname']")
    public WebElement addViseDeanSurname;

    @FindBy(xpath ="//input[@value='MALE']")
    public WebElement addViseDeanMALE;
    @FindBy(xpath ="//input[@value='FEMALE']")
    public WebElement addViseDeanFEMALE;

    @FindBy(xpath ="//input[@id='birthPlace']")
    public WebElement addViseBirthPlace;


    @FindBy(xpath ="//input[@id='birthDay']")
    public WebElement addViseDeanBIRTHDAY;
    @FindBy(xpath ="//input[@id='phoneNumber']")
    public WebElement addViseDeanPHONENUMBER;
    @FindBy(xpath ="//input[@id='ssn']")
    public WebElement addViseDeanSSN;

    @FindBy(xpath ="//input[@id='username']")
    public WebElement addViseDeanUSERNAME;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement addViseDeanPASSWORD;

    @FindBy(xpath ="//div[text()='Required']")
    public WebElement addViseDeanRequired;
    @FindBy(xpath ="//div[text()='Minimum 8 character']")
    public WebElement addViseDeanPassWordRequired;

    @FindBy(xpath ="//button[text()='Submit']")
    public WebElement addViseDeanSubmit;

    @FindBy(xpath ="//div[@role='alert']")
    public WebElement addViseDeanAlert;

    @FindBy(xpath ="(//li[@class='page-item'])[4]")
    public WebElement addViseDeanListeSonu;

    @FindBy(xpath ="//tbody//tr//td[5]")
    public WebElement addViseDeanTableUserName;








}
