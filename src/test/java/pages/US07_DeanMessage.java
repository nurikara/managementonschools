package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07_DeanMessage extends Login {

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement MenuButton;

    @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement ContactGetAll ;

  @FindBy(xpath = "//h5")
    public WebElement ContactMessagePage ;
  @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement NameColumn ;
  @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement EmailColumn ;
  @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement DateColumn ;
  @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement SubjectColumn ;
  @FindBy(xpath = "//table/thead/tr/th[5]")
    public WebElement MessageColumn ;

 @FindBy(xpath = "//div[3]/div[2]/div/a[3]")
    public WebElement LogoutButton ;

 @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement YesButton ;




}
