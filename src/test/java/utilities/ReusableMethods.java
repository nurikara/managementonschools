package utilities;


import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ReusableMethods {


    //HARD WAIT METHOD
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertprompt(String text) {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }

    //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
    public static void ddmVisibleText(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);
    }

    //DropDown Index
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value
    public static void ddmValue(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByValue(secenek);
    }

    //SwitchToWindow1
    public static void switchToWindow(int sayi) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
    }

    //SwitchToWindow2
    public static void window(int sayi) {
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
    }
    //EXPLICIT WAIT METHODS

    //Visible Wait
    public static void visibleWait(WebElement element, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    //VisibleElementLocator Wait
    public static WebElement visibleWait(By locator, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    //Alert Wait
    public static void alertWait(int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    //Tüm Sayfa ScreenShot
    public static void tumSayfaResmi() {
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/screenshot/screenshot" + tarih + ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Tüm Sayfa ScreenShot parametreli
    public static void tumSayfaResmi(String name) {
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/screenshot/screenshot" + tarih + name + ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //WebElement ScreenShot
    public static void webElementResmi(WebElement element) {
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/screenshot/webElementScreenshot" + tarih + ".png";

        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //WebTable
    public static void printData(int satir, int sutun) {
        WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
        System.out.println(satirSutun.getText());
    }

    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS Sayfa Sonu Scroll
    public static void scrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS Sayfa Başı Scroll
    public static void scrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //JS SendKeys
    public static void sendKeysJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    //JS SendAttributeValue
    public static void sendAttributeJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //JS GetAttributeValue
    public static void getValueByJS(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: = " + attribute_Value);
    }

    //JS drag and drop
    public static void dragAndDropByJS(WebElement source, WebElement target) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String script = "function createEvent(typeOfEvent) {\n" +
                "    var event = document.createEvent(\"CustomEvent\");\n" +
                "    event.initCustomEvent(typeOfEvent, true, true, null);\n" +
                "    event.dataTransfer = {\n" +
                "        data: {},\n" +
                "        setData: function (key, value) {\n" +
                "            this.data[key] = value;\n" +
                "        },\n" +
                "        getData: function (key) {\n" +
                "            return this.data[key];\n" +
                "        }\n" +
                "    };\n" +
                "    return event;\n" +
                "}\n" +
                "\n" +
                "function dispatchEvent(element, event, transferData) {\n" +
                "    if (transferData !== undefined) {\n" +
                "        event.dataTransfer = transferData;\n" +
                "    }\n" +
                "    if (element.dispatchEvent) {\n" +
                "        element.dispatchEvent(event);\n" +
                "    } else if (element.fireEvent) {\n" +
                "        element.fireEvent(\"on\" + event.type, event);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "function simulateHTML5DragAndDrop(element, target) {\n" +
                "    var dragStartEvent = createEvent('dragstart');\n" +
                "    dispatchEvent(element, dragStartEvent);\n" +
                "    var dropEvent = createEvent('drop');\n" +
                "    dispatchEvent(target, dropEvent, dragStartEvent.dataTransfer);\n" +
                "    var dragEndEvent = createEvent('dragend');\n" +
                "    dispatchEvent(element, dragEndEvent, dropEvent.dataTransfer);\n" +
                "}\n" +
                "\n" +
                "var sourceElement = arguments[0];\n" +
                "var targetElement = arguments[1];\n" +
                "simulateHTML5DragAndDrop(sourceElement, targetElement);";
        js.executeScript(script, source, target);

    }


    /**
     * Bu metot Action class kullanarak bir webelementin ustune gidip bekler
     * @param element yerine webelement'in locate koyulmalidir
     */
    public static void moveToElementWithAction(WebElement element){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //Alttaki uc method sadce bu site icin gecerli Locate'ler degistigi icin baska sitede kullanilmaz
    //Dinamik olsun diye bu sekilde yaptim
    public static void selectFromList( String textFromList) {
        Driver.getDriver().findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='" + textFromList + "']")).click();
    }
    public static void clickEdit(int sayi){
        Driver.getDriver().findElement(By.xpath("(//a[@href='#edit'])["+sayi+"]"));
    }
    public static void clickDelete(int sayi){
        Driver.getDriver().findElement(By.xpath("(//a[text()='delete'])["+sayi+"]"));
    }



    /**Bu metot bir webelementin secili olup olmadigini dogrular
     *  @param webElement girilecek webelement dir.
     */
    public void assertTrueIsSelected(WebElement webElement){
        Assert.assertTrue(webElement.isSelected());
    }

    /** Bu metot iki string degerin birbirine equal olup olmadigini dogrular
     @param str girilecek 1. metindir
     @param str1 girilecek 2. metindir
     */
    public void assertTrueEquals(String str, String str1){
        Assert.assertTrue(str.equals(str1));
    }
    /**
     *  JavaScript ile webelement olusturma
     * @param javascriptYolu internet sitesinden sag klik ile JS yolunu kopyala ile alınan metin olacak
     */
    public static WebElement webelementJavaScript(String javascriptYolu) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement webElement = (WebElement) js.executeScript("return "+javascriptYolu+"");
        return webElement;
    }
    /**
     *  JavaScript ile webelement olusturup isEnabled oldugunu sorgulama
     * @param str internet sitesinden sag klik ile JS yolunu kopyala ile alınan metin olacak
     */
    public static void assertIsEnabled(String str){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement webElement = (WebElement) js.executeScript("return "+str+"");
        assertTrue(webElement.isEnabled());
    }















    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
    public static Statement getStatement(){
        try {
            return getConnection().createStatement();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static ResultSet getResultSet(String query){
        try {
            return getStatement().executeQuery(query);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static String fakerInput(String faker2) {
        Faker faker = new Faker();
        if (faker2 == "name") {
            String fakerFirstName = faker.name().firstName();
            return fakerFirstName;

        } else if (faker2 == "surname") {

            String fakerLastName = faker.name().lastName();
            return fakerLastName;

        } else if (faker2 == "birthPlace") {
            String fakerTownCity = faker.address().cityName();
            return fakerTownCity;


        } else if (faker2 == "dateOfBirth") {
            Date birthDate = faker.date().birthday();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            String birthDateStr = sdf.format(birthDate);
            return birthDateStr;


        } else if (faker2 == "phoneNumber1") {

            String fakePhoneNumber = faker.numerify("###-###-####");
            return fakePhoneNumber;

        } else if (faker2 == "phoneNumber2") {

            String fakePhoneNumber = faker.numerify("###-###-###");
            return fakePhoneNumber;

        } else if (faker2 == "phoneNumber3") {

            String fakePhoneNumber = faker.numerify("###-###-#####");
            return fakePhoneNumber;

        } else if (faker2 == "ssn1") {

            String ssn = faker.numerify("###-##-####");
            return ssn;

        } else if (faker2 == "ssn2") {

            String ssn = faker.numerify("#########");
            return ssn;

        } else if (faker2 == "ssn3") {

            String ssn = faker.numerify("###########");
            return ssn;

        } else if (faker2 == "ssn4") {

            String ssn = faker.regexify("[a-zA-Z]{11}");
            return ssn;

        } else if (faker2 == "username") {
            String fakeUsername = faker.name().username();
            return fakeUsername;

        } else if (faker2 == "password1") {
            String password = faker.regexify("[A-Z]{1}[a-zA-Z0-9]{7}");
            return password;
        } else if (faker2 == "password2") {
            String password = faker.regexify("[a-zA-Z0-9]{1,7}");
            return password;
        } else if (faker2 == "password3") {
            String password = faker.regexify("[a-zA-Z]{8}");
            return password;
        } else if (faker2 == "password4") {
            String password = faker.regexify("[0-9]{8}");
            return password;
        }


        return faker2;
    }

    public static void robotDelete() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 40; i++) {
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
    }}

