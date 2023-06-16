package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login {
    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement homePageLoginButton;
    @FindBy(xpath = "(//input)[1]")
    public WebElement userNameTextBox;
    @FindBy(xpath = "(//input)[2]")
    public WebElement pswTextBox;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;
}
