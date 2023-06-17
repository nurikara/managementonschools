package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02_AdminUserList extends Login{

    @FindBy(xpath =" //button[@type='button']")
    public WebElement menu;

    @FindBy(xpath ="//*[text()=\"Guest User\"]")
    public WebElement guestlist;

    @FindBy(xpath ="//h5")
    public WebElement gueslistPage;
    @FindBy(xpath ="//*[text()=\"Logout\"]")
    public WebElement logout;

    @FindBy(xpath ="//button[@class='btn btn-warning']")
    public WebElement yes;
     @FindBy(xpath ="(//td//button)[4]")
    public WebElement birinciyiSil;

     @FindBy(xpath ="//div[@role='alert']")
    public WebElement alert;








}
