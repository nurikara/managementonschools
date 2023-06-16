package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08_US09_ViceDeanAddLesson extends Login{

    @FindBy(xpath = "")
    public WebElement homePageLogin;
    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement Lessons;


}
