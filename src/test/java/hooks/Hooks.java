package hooks;


import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {
     /*
    Hooks her bir Scenario yada Scenario Outline dan ONCE yada SONRA calistirilan bir classdir.
   ==> Neden hooks kullanilir?
       Raporlamalarda (After metottaki kod ile)
       After metotumuzda bulunan kod ile otomatik olarak ekran goruntusu alma ve rapora ekleme
   ==> Hooks da ne tur kodlar var?
       Before ve After metot lari. After da ekran goruntusu almak icin kullandigim kodlar vardir
     */

    @Before() //==> import io.cucumber.java.Before==>import cucumberdan alinmali
    public void setUp() {
        System.out.println("Before Method");
    }//@Before yanina("buraya tag belirtiyoruz.")sonra sadece rumner da belirttigimiz tags calısır.Ama belirtmazsek de kıstlama
    //koymamıs oluruz ve before ıcıne koydugumuz bilgi tum testlerden once hep calısır


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {//Eger fail olursa alınan ekran goruntusunu rapora ekle
            final byte[] failedScreenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenShot, "image/png", "failed_scnenaio" + scenario.getName());
        }
        //Driver.closeDriver();
    }

    /*
    Scenario'lar arasındaki bağlantıyı sağlayan glue parametresine koyduğumuz stepDefinition package'ı içerisinde
@Before ve @After gibi bir notasyon varsa extend yapmamıza gerek kalmadan her scenariodan önce veya sonra bu
methodlar çalışacaktır.
    Cucumber'da @Before, @After kullanma ihtiyacımız olursa bunu Hooks class'ına koyarız.
    İstersek yeni bir package oluşturup bunun içinede Hooks class'ını koyabiliriz. Eğer yeni bir package içerisine
koyarsak Runner class'ındaki glue parametresine bu package'ı da eklememiz gerekir
 */
}