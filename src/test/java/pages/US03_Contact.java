package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03_Contact {
    public US03_Contact(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
