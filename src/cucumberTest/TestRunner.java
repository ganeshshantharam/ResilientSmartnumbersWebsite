package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		monochrome = true,
		plugin = {"pretty", "html:target/TestReport"}, 
		glue={"stepDefinition"}
		,tags= "@ResourcePage"
		)

public class TestRunner {

}
