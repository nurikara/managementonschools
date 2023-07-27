package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class US15_ViceDeanStudent extends Login {
    @FindBy(xpath = "(//*[@class='nav-link'])[10]")
    public WebElement studentmanagement;
    @FindBy(xpath = "//*[@class='form-select']")
    public WebElement teacherselectddm;
    @FindBy(id = "name")
    public WebElement name;
    @FindBy(id = "surname")
    public WebElement surname;
    @FindBy(id = "birthPlace")
    public WebElement birthPlace;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(id = "birthDay")
    public WebElement birthDay;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "fatherName")
    public WebElement fatherName;
    @FindBy(id = "motherName")
    public WebElement motherName;
    @FindBy(id = "password")
    public WebElement smpassword;
    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement male;
    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement female;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement namerequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surnamerequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthplacerequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement emailrequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phonerequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement dobrequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement ssnrequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement usernamerequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[9]")
    public WebElement fathernamerequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[10]")
    public WebElement mothernamerequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[11]")
    public WebElement passwordrequired;
    @FindBy(xpath = "//*[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public WebElement genderalert;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[11]")
    public WebElement passwordalerT;
    @FindBy(xpath = "(//*[@class='table-group-divider']/tr/td)[1]")
    public WebElement studentnumber;
}
