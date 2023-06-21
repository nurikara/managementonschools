package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",

        },

        monochrome = false,
        features = "src/test/resources/features",
        glue = {"stepdef", "hooks"},
        tags = "@Api" ,



        dryRun = false
)


public class runnerMali {

}
