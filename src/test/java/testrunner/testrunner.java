package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue= {"stepdefination","hooks"},
        monochrome = true,
       // dryRun = false,
        plugin = { "pretty", "html:target/cucumber-reports"}
        )
public class testrunner {

}