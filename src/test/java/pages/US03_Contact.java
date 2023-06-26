package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03_Contact extends Login{

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement subject;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement message;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement message2;

    @FindBy(xpath = "//*[Toastify__toast-body']")
    public WebElement message3;

    @FindBy(xpath = "Toastify__toast-container Toastify__toast-container--top-center")
    public WebElement message4;

    @FindBy(xpath = "//*[text()='Required']")
    public WebElement required;






}
