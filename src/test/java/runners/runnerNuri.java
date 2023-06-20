package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//konsolu renkli yazdirir
                "html:target/default-cucumber-reports.html",//en ıyısı bu, en okunabiliri
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        //konsolu okunakli hala getirir false olunca kullanılmayacak.
        features = "src/test/resources",
        glue = {"stepdef","Hooks"},
        tags ="@nuri",
        dryRun = false
)

public class runnerNuri {
}
