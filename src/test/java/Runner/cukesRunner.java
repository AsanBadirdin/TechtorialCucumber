package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources",
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = true,
        tags = "@positive"


)

public class cukesRunner {

}
