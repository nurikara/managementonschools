package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_AdayOgRegister {
    public US01_AdayOgRegister(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
