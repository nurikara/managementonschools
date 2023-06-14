package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US21_Student {
    public US21_Student(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
