package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//cucumber ile junitin entegre olmasını saglayan test calıstırıcı notasyonudur.
//Senaryoların nerede ve nasıl calısacagi ,hangi raporu kullanacagı ile alakalı secenekleri  ayarlar.
@CucumberOptions(
        plugin = {
                "pretty",//konsolu renkli yazdirir
                "html:target/default-cucumber-reports.html",//en ıyısı bu, en okunabiliri
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        //plugin de rapor alacagımız ve raporlar uretecegimiz yerleri belirliyoruz,bizim icin onemli olan html onemli.
        monochrome = false,//konsolu okunakli hala getirir false olunca kullanılmayacak.
        features = "src/test/resources/features",
        glue = {"stepdef", "hooks"},//bu parametre ile kodalrımızı yazdıgımız stepDefinition classının package ını belirtiriz.
        tags = "@erel",//buraya herhangi birsey yazabiliriz. biz bu tagsı nerede kullacagız:benim calıstırmak ıstedıgım senaryoya isim verebilmemdir.



        dryRun = false
)


public class runnerErel {

}
