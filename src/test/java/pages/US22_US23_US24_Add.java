package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US22_US23_US24_Add extends Login{
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement addAdminNameTextBoxT;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement addAdminSubmitT;
    @FindBy(xpath = "(//*[@class='page-link'])[5]")
    public WebElement tableLastButton;
    @FindBy(xpath = "//table")
    public WebElement tablo;

    @FindBy(xpath = " //*[@class=' css-19bb58m']")
    public WebElement chooseLesoonZeynep;
}
