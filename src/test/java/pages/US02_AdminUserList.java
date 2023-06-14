package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02_AdminUserList {
    public US02_AdminUserList(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
