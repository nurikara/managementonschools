package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_AdayOgRegister extends Login {

    @FindBy(xpath = "//*[@href='/register']")
    public WebElement homePageRegister;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthplace;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phonenumber;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement birthday;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement radioButtonFemale;

    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement radioButtonMale;

    @FindBy(xpath = "(//*[text()='Register'])[2]")
    public WebElement register;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement message;

    @FindBy(xpath = "//*[text()='Required']")
    public WebElement required;

    @FindBy(xpath = "//*[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneRequired;

    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement dateOfBirthRequired;

    @FindBy(xpath = "//*[text()='Minimum 8 character']")
    public WebElement passwordRequired;

    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnRequired;






}
