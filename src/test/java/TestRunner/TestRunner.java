package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Shankar\\JavaClassSession\\Data_BDD\\Features\\DataVerification.feature", 
				glue = "StepDefinitions", dryRun = false, monochrome = true,
					tags = "@TS_01",
					plugin = { "pretty", "html:target/Report.html", "junit:target/cucumber.xml", "json:target/cucumber.json" })

public class TestRunner {

}
