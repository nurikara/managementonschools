package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US22_US23_US24_US25_Add extends Login{
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement addAdminNameTextBoxT;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement addAdminSubmitT;
    @FindBy(xpath = "(//*[@class='page-link'])[5]")
    public WebElement tableLastButton;
    @FindBy(xpath = "//table")
    public WebElement tablo;
}
