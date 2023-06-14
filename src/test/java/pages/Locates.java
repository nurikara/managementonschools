package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Locates {
    public Locates(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
