package runners.e2e;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//konsolu renkli yazdirir
                //"html:target/default-cucumber-reports.html",//en ıyısı bu, en okunabiliri
                "json:target/json-reports/cucumber.json",
                "html:src/test/resources/features/htmlReport/cucumberHooks.html",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        monochrome = false,//konsolu okunakli hala getirir false olunca kullanılmayacak.
        features = "src/test/resources/features",
        glue = {"stepdef", "hooks"},

        tags ="@e2e_us08"  //       ===>> Burasi bos kalacak



)

public class Runner_e2e {
}











