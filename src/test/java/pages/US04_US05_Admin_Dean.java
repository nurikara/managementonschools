package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04_US05_Admin_Dean extends Login {
    public US04_US05_Admin_Dean(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;


    @FindBy(xpath= "//a[.='Dean Management']")
    public WebElement deanManagamentButton;
    @FindBy(css = "h3")
    public WebElement deanManagamentText;
    @FindBy(css = "#name")
    public WebElement name;

    @FindBy(css = "#surname")
    public WebElement surname;

    @FindBy(css = "#birthPlace")
    public WebElement birthPlace;

    @FindBy(css = "[value='FEMALE']")
    public WebElement famaleGender;


    @FindBy(css = "[value='MALE']")
    public WebElement maleGender;

    @FindBy(css = "#birthDay")
    public WebElement birthDay;

    @FindBy(css = "#phoneNumber")
    public WebElement phoneNumber;

    @FindBy(css = "#ssn")
    public WebElement ssn;

    @FindBy(css = "#username")
    public WebElement username;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(css = ".btn-primary")
    public WebElement submitButton1;

    @FindBy(css = "form > .row > div:nth-of-type(1) .invalid-feedback")
    public WebElement nameDeanReq;

    @FindBy(css = "form div:nth-of-type(2) .invalid-feedback")
    public WebElement surnameDeanReq;

    @FindBy(css = "form div:nth-of-type(3) .invalid-feedback")
    public WebElement birtPlaceDeanReq;

    @FindBy(css = ".mb-3 > .invalid-feedback")
    public WebElement dateOfBirdDeanReq;
    @FindBy(css = "div:nth-of-type(6) .invalid-feedback")
    public WebElement phoneDeanReq;
    @FindBy(css = "div:nth-of-type(7) .invalid-feedback")
    public WebElement ssnDeanReq;
    @FindBy(css = "div:nth-of-type(8) .invalid-feedback")
    public WebElement usernameDeanReq;
    @FindBy(css = "div:nth-of-type(9) .invalid-feedback")
    public WebElement passwordDeanReq;
    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement genderDeanTest;
    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement paswordTest;
    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement phoneTest;
    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement ssnTest;
    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement usernameTest;

    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement nameTest;

    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement birthPlaceTest;

    @FindBy(xpath = "(//div[@class='Toastify'])[2]")
    public WebElement saveTest;


    @FindBy(css = "th:nth-of-type(1)")
    public WebElement nameDeanList;

    @FindBy(css = "th:nth-of-type(2)")
    public WebElement genderDeanList;

    @FindBy(css = "th:nth-of-type(3)")
    public WebElement phoneNumberDeanList;

    @FindBy(css = "th:nth-of-type(4)")
    public WebElement ssnDeanList;

    @FindBy(css = "th:nth-of-type(5)")
    public WebElement userNameDeanList;

    @FindBy(xpath = "//a[.='›Next']")
    public WebElement nextButton;

    @FindBy(css = "tr:nth-of-type(20) .text-dark")
    public WebElement editButton;

    @FindBy(css = ".modal-body #name")
    public WebElement nameEditDean;

    @FindBy(css = ".modal-body #surname")
    public WebElement surnameEditDean;

    @FindBy(css = ".modal-body #birthPlace")
    public WebElement birtPlaceEditDean;

    @FindBy(css = ".modal-body [value='FEMALE']")
    public WebElement famaleEditDean;

    @FindBy(css = ".modal-body [value='MALE']")
    public WebElement maleEditDean;

    @FindBy(css = ".modal-body #birthDay")
    public WebElement birtDayEditDean;

    @FindBy(css = ".modal-body #phoneNumber")
    public WebElement phoneEditDean;

    @FindBy(css = ".modal-body #ssn")
    public WebElement ssnEditDean;

    @FindBy(css = ".modal-body #username")
    public WebElement usernameEditDean;



    @FindBy(css = ".modal-body #password")
    public WebElement passwordEditDean;

    @FindBy(css = ".modal-footer > .fw-semibold")
    public WebElement submitEditDean;

    @FindBy(css = ".modal-body .row > div:nth-of-type(1) .invalid-feedback")
    public WebElement nameReqEdit;

    @FindBy(css = ".modal-body div:nth-of-type(2) .invalid-feedback")
    public WebElement surnameReqEdit;

    @FindBy(css = ".modal-body div:nth-of-type(3) .invalid-feedback")
    public WebElement birPlaceReqEdit;

    @FindBy(css = ".modal-body .col .invalid-feedback")
    public WebElement birdDayReqEdit;

    @FindBy(css = ".modal-body div:nth-of-type(6) .invalid-feedback")
    public WebElement phoneReqEdit;

    @FindBy(css = ".modal-body div:nth-of-type(7) .invalid-feedback")
    public WebElement ssnReqEdit;

    @FindBy(css = ".modal-body div:nth-of-type(8) .invalid-feedback")
    public WebElement userNameReqEdit;

    @FindBy(css = ".modal-body div:nth-of-type(9) .invalid-feedback")
    public WebElement passwordReqEdit;

    @FindBy(css = ".Toastify__toast-body > div:nth-of-type(2)")
    public WebElement editDeanOk;









}