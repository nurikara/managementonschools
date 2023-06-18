package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login {
    public Login(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement homePageLogin;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement LoginButton;

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement login;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement accountlogin;
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;
    @FindBy(xpath = "(//*[@class='nav-link'])[10]")
    public WebElement studentmanagement;
    @FindBy(xpath = "//*[@id='advisorTeacherId']")
    public WebElement teacherselectddm;
  //  @FindBy(id = "advisorTeacherId")
  //  public WebElement teacherselectddm;


}
